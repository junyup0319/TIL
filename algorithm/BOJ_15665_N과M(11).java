import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

class Main {
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = in.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		
		str = in.readLine().split(" ");
		int[] numbers = new int[N];
		for (int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(str[i]);
		}
		
		Arrays.sort(numbers);
		permutation(M, numbers, 0, new int[M], new HashSet<String>());
		System.out.println(sb.toString());
	}
	
	
	static void permutation(int M, int[] numbers, int dest, int[] selected, HashSet<String> set) {
		if (M == dest) {
			if (!set.contains(Arrays.toString(selected))) {
				set.add(Arrays.toString(selected));
				for (int i = 0; i < M; i++) {
					sb.append(selected[i]).append(" ");
				}
				sb.append("\n");
			}
			return;
		}
		for (int i = 0; i < numbers.length; i++) {
			selected[dest] = numbers[i];
			permutation(M, numbers, dest+1, selected, set);
		}
	}
}


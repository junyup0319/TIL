# ngrok
* Secure tunnels to localhost => 방화벽을 넘어서 외부에서 로컬에 접속 가능하게 하는 터널 프로그램
* 웹 사이트나 API서버 등을 개발할 때 보통 로컬에 개발환경이 구축 되어있으므로 외부에서 접근하기 어렵다 (서버에 올려야함) -> ngrok을 이용해 쉽게 접근할 수 있다
* https 로 된 사이트로 접속이 가능하다

## 설치
`$npm install -g ngrok`


## 사용
1.  포트번호(8080)에 맞게 ngork을 실행해준다 (포트번호에 맞게 로컬의 포트를 ngrok 도메인과 연결해서 터널을 열어준다)
`$ ngrok http 8080`

2. http/https 주소가 나온다 -> 복사해서 브라우저에서 접속! (같은 네트워크가 아니더라도 어디서나 접근이 가능)
`https://f613d86a.ngrok.io`
# 1. 맥 git 설치
- [Homebrew](https://brew.sh/)에 보이는 긴 설치 명령어를 터미널에 입력  
- passward 입력하라고 나오면 맥북 비밀번호 입력  
- 설치 완료후 커맨드 2줄 입력하라고 나오면 2개를 각각 터미널에 입력  
```
echo 'eval ~~~~
evl "$ ~~~~~
```

<br>

- Homebrew 설치 후 터미널 창에 `brew install git` 입력하면 git 설치 완료

<br>

- git 설치 후 터미널에서 `git config --global init.defaultBranch main` 입력하면 기본 branch 이름을 master -> main으로 바꿔줌
- 난 master로 사용해서 편한대로 하면 됨

<br>

- Visual Studio Code 실행
- `shift + command + p`누르고 `Install "code" from VSCode commander` 검색하여 눌러줌
- 다시 터미널에서 `git config --global core.editor "code --wait"`입력하면 git의 기본 에디터가 Vim -> VSCODE로 변경됨

<br>

# 2. git 설치 확인
- 터미널에서 `git --version`입력 후 버번이 나오면 설치 완료

<br>

# 3. git 유저 이름 세팅
```
git config --global user.email "홍길동@naver.com"
git config --global user.name "홍길동"
```
- 컴퓨터에서 git을 처음 사용하면 위의 코드를 입력, 누가 git을 사용하고 있는지에 대한 아이디 등록같은 것

<br>

# 4. 그 외
- `git config --list`: config 리스트 보기
- git config 삭제
    ```
    git config --unset user.name
    git config --unset user.email
    ```
- 삭제 시 남아있을 경우 global 옵션 추가
    ```
    git config --unset --global user.name
    git config --unset --global user.email
    ```
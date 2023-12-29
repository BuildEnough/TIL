# 1. 작업 폴더에서 git 사용
- 터미널에서 `git init` 부터 입력
    - git이 파일 생성, 코드 작성 하는 것을 추척
- git 이용하기
    - 차례대로 터미널에 입력
        ```
        git add 파일명 
        git commit -m '아무메세지'
        ```

## staging area & repository
- staging area
    - commit를 하기 전 commit할 파일들을 골라놓는 곳
    - `git add`명령어로 staging 함
- repository
    - commit된 파일의 버전들을 모아놓는 곳
    - repository를 보고 싶으면 작업 폴더 안의 .git 폴더 열어보기(숨겨진 파일로 있을 수 있음)

<br>

# 2. 다른 명령어들
- `git add 파일명1 파일명2`
    - 여러 파일을 동시에 staging
- `git add .`
    - 작업폴더의 모든 파일을 전부 staging
    - 자주 사용
- `git status`
    - 변경된 파일, staging된 파일을 보여줌
    - 뭐하는지 까먹었을 때 자주 사용
- `git restore --staged 파일명`
    - staging된 파일 취소
- `git log`
    - `commit 기록 조회`

<br>

# 3. 얼마나 자주 commit 하는 것이 좋을까?
- 기능을 하나 추가할 때마다 commit 하는 것이 좋다
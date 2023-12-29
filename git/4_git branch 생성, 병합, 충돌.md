# git branch
- git 안에서 branch 기능을 이용해서 복사본을 쉽게 만들 수 있다
- branch는 프로젝트 복사본이라고 생각하면 됨
- main branch 또는 master branch를 제외한 branch에서 작업한 내용은 main branch에 아무런 영향이 없다

<br>

# branch 생성
```
git branch 브랜치이름
```

<br>

# branch 이동
```
git switch 브랜치이름
```

<br>

# git log하면 나오는 HEAD?
- 현재 branch가 어떤 것인지 알려줌

<br>

# branch merge(합치기, 병합)
- merge를 하고 싶을 경우
    1. main/master 브랜치로 이동
    2. `git merge 브랜치명` 입력

<br>

# merge conflict(충돌)
- master 브랜치와 다른 브랜치가 같은 파일에 같은 줄을 수정할 경우 발생
    1. `<<<< | >>>> | ====` 이런 것들을 지우고 원하는 코드만 남기기
    2. 결정 했다면 `git add 파일명`, `git commit -m '메시지'`를 하면 branch merge 완료

<br>

# 정리
- 브랜치 생성은 `git branch 브랜치명`
- 브랜치 이동은 `git switch 브랜치명`
- 브랜치 합치기는 main/master 브랜치로 이동한 뒤에 `git merge 브랜치명`
- 브랜치마다 commit 내역을 그래프로 보고싶으면 `git log --graph --oneline --all`
- 브랜치 합칠 때 conflict가 발생하면 파일열어서 수정하고 `git add`, `git commit 하기`

<br>

# 그외
- `git log --oneline --all --graph`
    - 그래프식으로 git 로그를 보여줌

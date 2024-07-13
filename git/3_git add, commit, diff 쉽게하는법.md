# 터미널에 명령어 입력?
- 요즘 많은 에디터들에 git 기능이 내장되어 있기 때문에 터미널을 사용하지말고 편리하게 add와 commit 기능을 사용할 수 있다
- git 기능이 없는 에디터라면 git 부가기능을 추가하면됨

<br>

# git diff?
```
git diff
```
- commit 하기 전에 이전과 현재 코드의 차이를 알고 싶은 경우 사용
- 바로 전 commit과 현재 코드의 차이점을 비교해줌
    - Vim 에디터가 오픈되었기 때문에 스크롤(j, k), 종료(q)

<br>

```
git diff 커밋id
```
- 최근 commit과 비교하는 것이 아닌 과거의 특정 commit과 현재 파일을 비교하고 싶은 경우 커밋ID 명시해주면 됨
- 커밋ID: `git log --oneline` 했을 때 보이는 글자

<br>

```
git diff 커밋id1 커밋id2
```
- 과거의 특정 commit 2개 간의 차이점 비교 가능

<br>

# git difftool?
- Vim 에디터로 표시됨, 종료(q, qa)
```
gif difftool
```
- `git diff`보다 비주얼적으로 좋게 차이점을 보여준다
- 현재 파일과 최근 commit의 차이점을 비교

<br>

```
git difftool 커밋id
```
- 현재 파일과 특정 commit의 차이점을 비교해준다

<br>

```
git difftool 커밋id1 커밋id2
```
- 특정 commit 2개의 차이점을 보여준다

<br>

### Vim에디터말고 VSCode로 열고 싶을 경우
```
git config --global diff.tool vscode
git config --global difftool.vscode.cmd 'code --wait --diff $LOCAL $REMOTE'
```
- 차례대로 입력
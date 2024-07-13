# # git stash
- 작성한 코드를 지워두고 싶으면 주석처리 해도 되지만,  
`git stash`라는 명령어를 사용해도 된다
- 임시보관함에 잠시 넣어둔다고 생각하면 됨

<br>

```
git stash
```
- 파일이 최근 commit 상태로 돌아감
- staging 여부에 상관없이 추적 중인 파일은 다 이동됨
- 새로 만든 파일인데 staging 안된 경우 이동 안된다
- `git stash`는 여러 번 가능

<br>

```
git stash save "메모"
```
- git stash 할 때 메모도 함께 입력 가능

<br>

```
git stash list
```
- 현재 `stash` 되어있는 코드 목록을 전부 출력해 줄 수 있다

<br>

```
git stash pop
```
- `git stash`가 최근에 보관했던 코드를 불러온다
- 현재 코드와 겹치는 부분은 `conflict` 발생하지만 해결하면 됨

<br>

```
git stash drop 삭제할id
```
- 특정 `stash` 삭제
- id는 `git stash list` 입력하면 보이는 0, 1, 2와 같은 숫자

<br>

```
git stash clear
```
- 모든 `stash` 삭제

<br>

```
git stash -p
```
- 일부 코드만 `git stash`하고 싶은 경우 사용
- y/n 중에 선택

<br>

# 주석처리하지 굳이 stash?
- 주석처리와 비슷하지만 주석처리된 코드는 commit 할 때 반영됨
- `stash`는 commit 시에 반영이 안된다

<br>

# stash 대신 branch 새로 만드는거는?
- 그래도 됨
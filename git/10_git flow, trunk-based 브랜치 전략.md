# git branch 방법론
- branch를 아무렇게 만들면 개발과정이 매우 복잡해지고 추적이 어렵다
- git branch를 깔끔하게 만들도록 도와주는 방법론이 있다
- `git flow`, `github flow`, `gitlab flow`, `trunk-based` 등
    1. branch 관리 용이
    2. 팀원이 많아도 개발절차가 매끄러워짐
    - 프로젝트 리더들이 알면 좋음

<br>

# git flow
- 안정적인 운영이 필요하면 `git flow`
- 크게 5가지 branch 운영
    - `main branch`
    - `develop branch`(개발용)
    - `feature branch`(develop에 기능 추가용)
    - `hotfix branch`(main 브랜치 버그해결용)
    - 가끔 `release branch`(develop 브랜치를 main 브랜치에 합치기 전에 최종 테스트용)

<br>

# Trunk-based 전략
- 많은 branch를 만들 필요가 없을 때 `main branch`와 기능 추가용 `feature branch`만 운영하면 됨
    1. 기능추가, 버그수정이 필요하면 `main branch`에서 새로운 branch를 하나 만들어 코드 생성
        - 브랜치 작명 중요
    2. 기능이 완성되었다면 `main branch`에 합침
        - 필요없는 branch 삭제
    3. `main branch`에 있는 코드가 필요할 떄마다 유저들에게 배포
- 한 개의 브랜치에서만 관리하기 때문에 편리함
- 크게 개발해서 한 번에 `merge`하는 것보다 작은 단위로 `merge`하는 것이 안전
    - 대신 테스트나 코드리뷰를 자주해야 함
    - 테스트를 자주하고 자동화 해놓는 곳들이 제대로 사용 가능

<br>

# 정리
- 프로젝트에서 개발이 어느정도 진행되었거나 잘하는 사람들이 있다면 `trunk-based`
- `CI/CD` 개발도 `trunk-based` 개발방식 적용
- 출시된 버전의 안정성이 중요한 프로그램이나 뼈대가 확실하지않아 연구식으로 개발하는 프로그램은 `git flow` 적합

<br>

### merge 할때 방법
- `3-way merge`: 기록을 남겨야 하는 중요한 브랜치를 merge할 때
- `squash`, `rebase`: 기록을 남길 필요없는 쓸데없는 브랜치를 merge할 때
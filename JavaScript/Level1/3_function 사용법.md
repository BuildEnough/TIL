# function 문법
- 함수는 길고 더러운 코드를 한 단어로 축약하고 싶을 때 사용하는 문법
- 특정 기능을 다음에도 쓰기 위해 모듈화해놓는 문법

<br>

```javascript
function 함수이름() {
    코드
}
```

<br>

# Alert 코드 function으로 축약
기존코드
```html
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <link rel="stylesheet" href="main.css">
</head>
<body>
    <div class="alert-box" id="alert">알림창
        <button onclick="document.getElementById('alert').style.display = 'none';">닫기</button>
    </div>
    <button onclick="document.getElementById('alert').style.display = 'block';">열기</button>
</body>
</html>
```

<br>

function 사용
```html
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <link rel="stylesheet" href="main.css">
</head>
<body>
    
    <div class="alert-box" id="alert">알림창
        <button onclick="alertColse()">알림창 닫기</button>
    </div>
    <button onclick="alertOpen()">알림창 열기</button>

    <script>
        function alertColse() {
            document.getElementById('alert').style.display = 'none';
        }

        function alertOpen() {
            document.getElementById('alert').style.display = 'block';
        }
    </script>
</body>
</html>
```

# 자주 겪는 에러
1. JavaScript 코드는 html 코드 밑에 생성
    - JavaScript는 html을 조작하는 언어
    - 컴퓨터가 html 파일을 읽을 때 위에서 부터 읽기 때문에 html을 미리 읽어야 JavaScript 조작 가능

2. 오타 주의
    - 예를 들어 `getElementById`를 getelementById나 getElementByid와 같이 대문자를 소문자로 입력하는 오타 주의
    - 에러 발생 했을 시 `개발자 도구`에서 `Console`탭에서 확인하기

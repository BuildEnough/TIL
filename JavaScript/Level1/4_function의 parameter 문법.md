# function에 사용 가능한 parameter 문법
```javascript
function alert(parameter) {
    document.getElementById('alert').style.display = 'parameter';
}
```
1. () 소괄호 내에 문자 입력
2. {} 중괄호 내에도 () 소괄호에 입력한 같은 문자 입력

<br>

# parater 사용 예시
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
- `alert`라는 곳에서 function을 2번 사용
- 만약 parameter 문법을 사용한다면 function을 1번만 사용해도 됨

<br>

```html
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <link rel="stylesheet" href="main.css">
</head>
<body>
    
    <div class="alert-box" id="alert">알림창
        <button onclick="alert('none')">알림창 닫기</button>
    </div>
    <button onclick="alert('block')">알림창 열기</button>

    <script>
        function alert(parameter) {
            document.getElementById('alert').style.display = parameter;
        }
    </script>
</body>
</html>
```
- function 하나로 여러 기능 실행 가능

<br>

# parameter 문법 특징
1. 파라미터는 자유롭게 작명 가능
```javascript
function plus(a) {
    2 + a
}
```

2. 파라미터는 2개 이상 사용가능
    - ,(콤마)로 구분
```javascript
function plus(a, b) {
    a + b
}
plus(2, 2);
```

<br>

# 문제
- 기존 코드를 버튼1을 누르면 `아이디를 입력하세요`  
버튼2를 누르면 `비밀번호를 입력하세요`로 나오게 바꾸기

<br>

기존 코드
```html
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <link rel="stylesheet" href="main.css">
</head>
<body>
    
    <div class="alert-box" id="alert">
        <p>알림창임</p>
        <button onclick="alert('none');">닫기</button>
    </div>
    <button onclick="alert('block');">버튼1</button>
    <button onclick="alert('block');">버튼2</button>

    <script>
        function alert(parameter) {
            document.getElementById('alert').style.display = parameter;
        }
    </script>

</body>
</html>
```

<br>

변경된코드
```html
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <link rel="stylesheet" href="main.css">
</head>
<body>
    
    <div class="alert-box" id="alert">
        <p id="title">알림창임</p>
        <button onclick="alert('none');">닫기</button>
    </div>

    <button onclick="alertId()">버튼1</button>
    <button onclick="alertPassward();">버튼2</button>

    <script>
        
        function alertId() {
            document.getElementById('title').innerHTML = '아이디를 입력하세요';
            document.getElementById('alert').style.display = 'block';
        }

        function alertPassward() {
            document.getElementById('title').innerHTML = '비밀번호를 입력하세요';
            document.getElementById('alert').style.display = 'block';
        }

        function alert(parameter) {
            document.getElementById('alert').style.display = parameter;
        }
    </script>

</body>
</html>
```
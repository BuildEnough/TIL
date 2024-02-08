# UI 만드는 법칙
1. HTML CSS로 미리 UI 디자인을 해놓고 필요하면 평소에 숨긴다
2. 버튼을 누르거나할 경우 UI를 보여달라고 자바스크립트 코드 만들기

<br>

# 1. Alert UI 디자인
- 작업 폴더에 `main.css` 만든 후
- `index.html` <head> 태그 안에 `<link rel="stylesheet" href="main.css">` 입력 하면 css 사용 가능
- html 파일의 <body> 태그 안
    ```html
    <div class="alert-box">알림창</div>
    ```
- main.css 파일
    ```css
    .alert-box {
        background-color: skyblue;
        padding: 20px;
        color: white;
        border-radius: 5px;
        display: none;
    }
    ```
    - `display: none`: UI 숨기기
    - `display: block`: UI 보여주기
    - `visibility : hidden`: UI 숨기기

<br>

2. 버튼 누르면 Alert UI 보여주기
- 거의 모든 html 태그 안에 `onclick`이라는 속성 사용 가능
    - 해당 html을 클릭시 `onclick` 안의 자바스크립트를 실행해 줌
```html
<button onclick="자바스크립트 코드">버튼</button>
```

- html 코드
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
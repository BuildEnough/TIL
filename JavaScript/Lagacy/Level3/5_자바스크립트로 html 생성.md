# html 생성하는 방법 1
`<div>` 태그 안에 `<p>`를 생성
```html
<div id="test">
  
</div>

<script>
  var a = document.createElement('p');
  a.innerHTML = '안녕';
  document.querySelector('#test').appendChild(a);
</script>
```
- `document.createElement()`는 html 자료를 하나 생성해준다
    - 생성한 것을 마음대로 조작한 다음 `appendChild()`로 넣으면 html 완성됨

<br>

# html 생성하는 방법 2
```html
<div id="test">
  
</div>

<script>
  var a = '<p>안녕</p>';
  document.querySelector('#test').insertAdjacentHTML('beforeend', a);
</script>
```
1. 문자자료로 html을 만듬
2. `insertAdjacentHTML()`안에 넣기
- `beforeend`: 안쪽 맨 밑에 추가

<br>

```html
<div id="test">
  
</div>

<script>
  var a = '<p>안녕</p>';
  $('#test').append(a);
</script>
```
- 이것도 가능
- `append`: 안쪽 맨 밑에 추가

<br>

### 안쪽 추가말고 완전히 바꾸고 싶은 경우
- `div`를 찾아 `innerHTML = '<p></p>'` 사용
- `jQuery`에선 `.html()`이다

<br>

# 바지 옵션 선택 시 다른 사이즈 나오게 하기
```html
<form class="container my-5 form-group">
    <p>상품선택</p>
    <select class="form-select mt-2">
      <option>모자</option>
      <option>셔츠</option>
      <option>바지</option>
    </select>
    <select class="form-select mt-2 form-hide">
      <option>95</option>
      <option>100</option>
    </select>
</form>
```
- 첫 `<select>`에 바지옵션 추가
     - 28, 30 사이즈가 담긴 `<select>`가 나와야함
- html을 미리 만들어 놓은 후 보여줘도 되지만 실제 쇼핑몰의 경우 그럴 수 없다
- 실제 서비스는 매번 서버에서 데이터를 받아와 "데이터 갯수만큼 `<option>` 생성해주세요"라고 코드를 만들어 둔다
- 따라서 미리 html을 만들기보다 JavaScript로 html을 생성
```html
<script>
  $('.form-select').eq(0).on('input', function(){

    var value = $('.form-select').eq(0).val();
    if (value == '셔츠') {
      $('.form-select').eq(1).removeClass('form-hide');
    }
    else if (value == '바지'){
      $('.form-select').eq(1).removeClass('form-hide');
      $('.form-select').eq(1).html('');
      var 템플릿 = `<option>28</option><option>30</option>`;
      $('.form-select').eq(1).append(템플릿)
    }

  });
</script>
```
유저가 바지를 선택하면  
1. 두 번째 `<select>` 보여주기
2. 두 번쨰 `<select>`안에 비우기
3. html 만든 후 두 번째 `<select>`안에 `append`
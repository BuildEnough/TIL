# Array 자료형
- 자료를 한 곳에 저장하고 싶을 때 사용하는 자료형
- 여러 자료를 변수 하나에 저장하고 싶을 때 array 자료형 사용
```js
var car = ['소나타', 50000, 'white'];
```
- 대괄호를 열고 자료를 ,(콤마)로 구분해서 넣으면 됨
- 여러 자료를 엑셀처럼 저장가능

<br>

```js
var car = ['소나타', 50000, 'white'];
console.log(car[1]);
```
- array 자료에서 데이터를 뽑을 땐 []대괄호를 뒤로 붙이면 됨

<br>

```js
var car = ['소나타', 50000, 'white'];
car[1] = 60000;
console.log(car[1]);
```
- array 자료를 수정하고 싶으면 등호를 이용해서 수정하면 됨

<br>

# Object 자료형
- 여러가지 자료를 한 곳에 저장하고 싶을 때 사용하는 자료형
- 여러 자료를 변수 하나에 저장하고 싶으면 object 사용하면 편리함
```js
var car2 = { name : '소나타', price : 50000 };
```
- {}중괄호를 열고 자료를 ,(콤마)로 구분해서 넣으면 됨
- 자료 왼쪽에 자료의 이름을 붙여서 저장해야 함
- `key`: 자료의 이름
- `value`: 실제 자료
- object 자료형은 `key:value`형태로 자료를 저장할 수 있다

<br>

```js
var car2 = { name : '소나타', price : 50000 };
console.log(car2['name']);
console.log(car2.name);
```
- array 자료에서 데이터를 뽑을 땐 []대괄호를 뒤에 붙이면 됨
    - `[자료이름]`
- `.자료이름` 이것도 가능

<br>

```js
var car2 = { name : '소나타', price : 50000 };
car2['name'] = '그랜저';
console.log(car2['name']);
```
- object 자료를 수정하고 싶으면 =등호를 이용하여 수정하면 됨
- 자료 추가도 =등호를 이용하면 됨

# Array/Object 차이
`상품명`, `가격`, `연식`, `색상`, `옵션여부`, `...`
- 이런 데이터를 변수 하나에 보관하고 싶으면 `object`가 좋을거 같음

<br>

```js
var car = ['소나타', 50000, 2030, 'white', false];
```
- array를 사용하면 저장 시 간단하겠지만, 자료를 뽑을 때 힘들 수 있음
    - 가격을 뽑을 때 "몇 번째 위치에 있었는지"를 기억해야 함

<br>

```js
var car = { name : '소나타', price : 50000, year : 2030 };
```
- object로 넣으면 저장은 귀찮지만 가격을 뽑을 때 "가격의 key 이름이 뭔지를" 기억하면 됨

<br>

# Array/Object 차이 2
- array는 순서가 있다
    - 왼쪽에 있을수록 더 앞에 있는 자료
- object는 순서가 없다

<br>

array는 순서가 있기 때문에 순서개념이 필요한 것들을 할 수 있다
- 가나다순 정렬
- x번 자료부터 x번 자료까지 자르기
- x번 자료 바꾸기
- 맨 뒤, 맨 앞에 자료 넣기
- 원하는 자료가 있는지 검색

<br>

- `array.sort()`: 가나다순 정렬
- `array.slice(x, y)`: x번부터 y번 전까지 자름
- `array.push(x)`: x를 맨 뒤에 입력
- ...

<br>

# 숙제
```html
<div class="container mt-3">
  <div class="card p-3">
    <span>상품명</span>
    <span>가격</span>
  </div>
</div> 

<script>
  var car2 = { name : '소나타', price : 50000 } 
</script>
```
- 여기서 car2에 저장된 소나타라는 상품명과 50000이라는 가격을 뽑아서 html에 넣기

<br>

### 풀이

```html
<div class="container mt-3">
    <div class="card p-3">
    <span id="item">상품명</span>
    <span id="price">가격</span>
    </div>
</div>

<script>
    var car2 = {name :'소나타', price: 50000}

    document.getElementById('item').innerHTML = car2['name'];
    document.getElementById('price').innerHTML = car2['price'];
</script>
```

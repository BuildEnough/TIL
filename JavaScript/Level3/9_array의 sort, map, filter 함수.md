# array 정렬
- array 자료는 순서 개념이 있어 정렬 가능함
- 가나다 순은 `.sort()` 붙이면 됨
- 숫자 정렬은 코드를 작성해야 함
    ```js
    var 어레이 = [7,3,5,2,40];
    어레이.sort(function(a, b){
        return a - b
    });

    console.log(어레이);
    ```

<br>

# sort() 동작원리
sort() 함수는 원본은 변형시킴
```js
어레이.sort(function(a, b){
  return a - b
})
```
1. a, b는 array 안의 자료들
2. return 오른쪽이 양수면 a를 오른쪽으로 정렬해 줌
3. return 오른쪽이 음수면 b를 오른쪽으로 정렬해 줌
4. array 안의 자료들을 계속 뽑아서 a, b에 넣어준다

<br>

- a=7, b=3일 때 7-3=4가 남는다
- 4는 양수 -> 7을 3보다 오른쪽으로 보내줌
- 오름차순 정렬 완성

<br>

### 내림차순 정렬은?
```js
var 어레이 = [7,3,5,2,40];

어레이.sort(function(a, b){
  return b - a 
}); 
```
- return 우측이 음수면 b를 오른쪽으로 보냄
- a=7, b=3일 때 `return -4`라서 3을 오른쪽으로 보낸다
- 내림차순 정렬 완성

<br>

# 버튼을 누르면 products를 가격순 정렬하기
- `var products`라는 array는 `[{}, {}, {}]`이렇게 생김
- 안에 있는 `{}`을 가격이 낮은 순으로 정렬하려면
```js
products.sort(function(a, b){
  return a.price - b.price 
});

console.log(products);
```
- {} 끼리 빼면 안되고 {}안에 있는 가격끼리 빼면 됨

<br>

# html도 정렬하기
1. 가격 순 정렬버튼 누르기
2. products 자료를 가격순으로 정렬
3. 현재 있는 카드 3개 지우고 products 갯수만큼 카드 새로 생성

<br>

```js
var products = 생략;

$('#price').click(function(){

      products.sort(function(a, b){
        return a.price - b.price
      });

      $('.row').html('');

      products.forEach((a, i)=>{
        var 템플릿 = 
        `<div class="col-sm-4">
          <img src="https://via.placeholder.com/600" class="w-100">
          <h5>${products[i].title}</h5>
          <p>가격 : ${products[i].price}</p>
        </div>`;
        $('.row').append(템플릿)
      })
}); 
```
1. `id=price`버튼 생성
2. products 자료 정렬
3. 상품목록 html 지우고 새로 3개 생성

<br>

# array에서 쓰는 filter 함수
```js
var 어레이 = [7,3,5,2,40];

var 새어레이 = 어레이.filter(function(a){
  return 조건식
}); 
```
1. a라고 작명한 것은 array에 있던 데이터
2. return 우측에 조건식을 넣으면, 조건식에 맞는 a만 남겨줌
3. filer은 원본은 변형시키지 않는 함수이기 때문에 새로운 변수에 담아 사용해야 함

### 예시
```js
var 어레이 = [7,3,5,2,40];

var 새어레이 = 어레이.filter(function(a){
  return a < 4
}); 
```
- 숫자들 중 4 미만인 것만 남기고 사용

<br>

# array에서 쓰는 map 함수
array 안의 자료들을 전부 변형시 map 사용
```js
var 어레이 = [7,3,5,2,40];

var 새어레이 = 어레이.map(function(a){
  return 수식같은거
}); 
```
1. a라고 작명한 것은 array에 있는 데이터
2. return 우측에 변경될 수식 넣기
3. filter은 원본은 변형시키지 않는 함수이기 때문에 새로운 변수에 담아 사용

<br>

### 예시
```js
var 어레이 = [7,3,5,2,40];

var 새어레이 = 어레이.map(function(a){
  return a * 4
});
```
- 새어레이에 [28, 12, 20, 8, 160]이 들어있다

<br>

# 1. "상품명 다나가순 정렬" 버튼과 기능을 생성
누르면 상품이 '다나가' 순으로 정렬
- 버튼 누르면 products 안에 있는 자료들을 다나가순 정렬
- 카드를 지우고 products 순으로 다시 생성

<br>

버튼 생성
```html
<div class="container my-3">
  <button class="btn btn-danger" id="sort1">다나가순정렬</button>
</div>
```

<br>

```js
var products = 생략;

$('#sort1').click(function(){
  
  products.sort(function(a, b){
    if (a.title < b.title) {
      return 1
    } else {
      return -1
    }
  });
  
  $('.row').html(''); //카드 다 없애주셈
  products.forEach((a, i)=>{
    var 템플릿 = `<div>상품명은 ${products[i].title}</div>`;
    $('.row').append(템플릿)
  })
});
```


# 2. "6만원 이하 상품보기" 버튼과 기능 생성
누르면 6만원 이하 상품만 보여야함  
더보기버튼과 함께 동작하는지 안하는지는 신경안써도 됩니다.

<br>

버튼 생성
```html
<div class="container my-3">
  <button class="btn btn-danger" id="filter">6만원이하</button>
</div>
```

<br>

```js
var products = 생략;

$('#filter').click(function(){
  
  var newProduct = products.filter(function(a){
    return a.price <= 60000
  });
  
  console.log(newProduct)
});
```

### 코드 줄이고 싶은 경우
```js
//일반함수
var newProduct = products.filter(function(a){
  return a.price <= 60000
}); 

//화살표함수
var newProduct = products.filter(a => a.price <= 60000);
```
- `arrow function` 사용
- 파라미터가 1개면 소괄호 생략 가능
- 함수 {} 안에 return 한 줄 밖에 없으면 중괄호와 return 동시 생략 가능


<br>

# 정리
```html
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Hello, world</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

    <script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
  </head>
  <body>

    <div class="container">
      <div class="row">
    
          <!-- <div class="col-sm-4">
            <img src="https://via.placeholder.com/600" class="w-100">
            <h5>Card title</h5>
            <p>가격 : 70000</p>
          </div> -->
    
      </div>
    </div>
    
    <div class="container my-3">
      <button class="btn btn-danger" id="price">가격순 정렬</button>
    </div>

    <div class="container my-3">
      <button class="btn btn-danger" id="sort1">다나가순 정렬</button>
    </div>

    <div class="container my-3">
      <button class="btn btn-danger" id="filter">6만 원이하</button>
    </div>
    
    <script>
      var products = [
        { id : 0, price : 70000, title : 'Blossom Dress' },
        { id : 1, price : 50000, title : 'Springfield Shirt' },
        { id : 2, price : 60000, title : 'Black Monastery' }
      ];

      $('#filter').click(function() {
        var newProduct = products.filter(function(a) {
          return a.price <= 60000;
        });

      $('.row').html('');
  
      newProduct.forEach((a, i)=>{
        var 템플릿 = 
        `<div class="col-sm-4">
          <img src="https://via.placeholder.com/600" class="w-100">
          <h5>${newProduct[i].title}</h5>
          <p>가격 : ${newProduct[i].price}</p>
          </div>`;
          $('.row').append(템플릿)
        });
      });

      $("#sort1").click(function() {
        products.sort(function(a, b) {
          if (a.title < b.title) {
            return 1;
          } else {
            return -1;
          }
        });
      });
      console.log(products);

      $('#price').click(function() {
        products.sort(function(a, b){
          return a.price - b.price;
        });

      $('.row').html('');
  
      products.forEach((a, i)=>{
        var 템플릿 = 
        `<div class="col-sm-4">
          <img src="https://via.placeholder.com/600" class="w-100">
          <h5>${products[i].title}</h5>
          <p>가격 : ${products[i].price}</p>
          </div>`;
          $('.row').append(템플릿)
        });
      });


      
      products.forEach((a, i)=>{
        var 템플릿 = 
        `<div class="col-sm-4">
          <img src="https://via.placeholder.com/600" class="w-100">
          <h5>${products[i].title}</h5>
          <p>가격 : ${products[i].price}</p>
          </div>`;
          $('.row').append(템플릿)
        });


        
        </script> 
      
      <div class="container">
        <button class="btn btn-danger" id="more">더보기</button>
      </div>

      <script>

        $('#more').click(function() {
          $.get('https://codingapple1.github.io/js/more1.json')
          .done((data)=> {
            console.log(data);

            data.forEach((a, i)=>{
              var 템플릿 = 
                `<div class="col-sm-4">
                  <img src="https://via.placeholder.com/600" class="w-100">
                  <h5>${data[i].title}</h5>
                  <p>가격 : ${data[i].price}</p>
                  </div>`;
                  $('.row').append(템플릿)
            });

          });
        });

      </script>
      
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </body>
    </html>
```
# 함수 function
- 긴 코드를 짧게 축약해서 사용
- 파라미터 기능

<br>

# 함수 안의 return 문법
- return 오른쪽에 입력하면 함수가 실행되고 난 자리에 입력한 값이 남는다
```js
function 함수(){
  return 123
}

console.log(함수());
```
- 함수()를 실행하고 결과를 남기고 싶을 때 `return 문법` 사용

<br>

### return 종료 기능
```js
function 함수(){
  console.log('안녕');
  return 123
  console.log('반가워'); // 실행 X
}

함수();
```
- `return 문법`은 함수를 종료 시킨다
- `return`을 만나면 함수가 바로 종료된다

<br>

# 함수 사용 용도
- 자료를 집어넣으면 규칙에 따라 다른 자료가 나오는 `변환기 역할`

<br>

# JavaScript의 소수 연산시 주의점
```js
console.log(1.1 + 0.3)
```
- 1.4가 나올거 같지만 1.40000000001 이 출력됨

<br>

### 해결방법
1. 덧셈하기 전 10을 곱하고 10으로 나누기
2. 외부 라이브러리 사용
3. 반올림

<br>

# 소수 반올림
```js
console.log( (1.1 + 0.3).toFixed(1) );
```
- `숫자.toFixed(몇자리)`
- 반환 시 숫자가 아닌 `문자`로 반환됨

<br>

### 문자가 아닌 숫자로 반환하고 싶을 때
```js
parseFloat('123')
paresInt('123')
```
- 숫자로 변경해주는 함수

<br>

# 숙제
### Q1. 함수에 분과 초를 차례로 파라미터로 입력하면 ms단위로 바꿔서 뱉어주는 함수를 만들기
예시1
```js
console.log(함수(1,30))
```
출력 결과: 90000

<br>

예시2
```js
console.log(함수(2,10))
```
출력 결과: 130000

<br>

풀이
```js
function 함수(m, s) {
    return (60*m+s) * 1000;
}
```

<br>

### Q2. 가격을 파라미터로 입력하면 10% 할인된 가격을 뱉는 함수를 만들기
첫 구매여부도 true/false로 둘째파라미터에 입력해서 첫 구매가 맞을 경우 추가로 1.5 달러도 할인  
  

예시1
```js
console.log(함수(70, false))
```
출력 결과: 63

<br>

예시2
```js
console.log(함수(10, true))
```
출력 결과: 7.5

<br>

풀이
```js
function 함수(price, a) {
    var result = price * 0.9;
    if (a = true) {
        result = result - 1.5;
    }
    return result;
}
```
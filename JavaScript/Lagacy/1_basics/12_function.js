/**
 * function -> 함수
 */

/**
 * 만약 2라는 숫자에 * 10 / 2 % 3를 String으로 변환해서 반환받고 싶다면 어떻게 해야할까
 */
console.log((2*10/2%3).toString());
console.log((3*10/2%3).toString());


/**
 * DRY
 * Don't Repeat Yourself
 */
function calculate() {
    console.log((2*10/2%3).toString());
}

// calculate();


function calculate(number) {
    console.log((number*10/2%3).toString());
}

/**
 * 함수에서 입력받는 값에 대한 정의를 Parameter라고 한다
 * 
 * 실제 입력받는 값은 argument라고 한다0
 */

calculate(4);
calculate(5);


// parameter 여러 개 받기
function mutiply(x, y) {
    console.log(x * y);
}
mutiply(2, 4);
console.log('---------------------');

// default parameter
function mutiply(x, y=10) {
    console.log(x * y);
}
mutiply(2, 4);
mutiply(2);
console.log('---------------------');


/**
 * 반환받기 return
 */
function mutiply(x, y) {
    return x * y;
}
const result1 = mutiply(2, 4);
console.log(result1);

const result2 = mutiply(4, 5);
console.log(result2);


/**
 * Arrow 함수
 */
const mutiply2 = (x, y) => {
    return x * y;
}
console.log(mutiply2(3, 4));

const mutiply3 = (x, y) => x * y;
console.log(mutiply3(4, 5));

const mutiply4 = x => x * 2;
console.log(mutiply4(2));

const mutiply5 = x => y => z => `x: ${x}, y: ${y}, z: ${z}`;
console.log(mutiply5(2)(5)(3));

function mutiply6(x) {
    return function(y) {
        return function(z) {
            return `x: ${x}, y: ${y}, z: ${z}`
        }
    }
}
console.log(mutiply6(3)(4)(5));


const mutiplyTwo = function(x, y) {
    return x * y;
}
console.log(mutiplyTwo(4, 5));


const mutiplyThree = function(x, y, z) {
    console.log(arguments);
    return x * y * z;
}

console.log('------------------------');
console.log(mutiplyThree(4, 5, 6));


// parameter 무한히 받기 => ...arguments
const multiplyAll = function(...arguments) {
    return Object.values(arguments).reduce((a, b) => a * b, 1);
}
console.log(multiplyAll(3, 4, 5, 6, 7, 8, 9, 10));


// immediately invoked function, 즉시 실행 함수
(function(x, y) {
    console.log(x * y);
})(4, 5)

console.log(typeof mutiply);
console.log(mutiply instanceof Object);
/**
 * Data Types
 * 
 * 6개의 Primitive Tpye / 1개의 Object Type
 * 
 * 1) Number (숫자)
 * 2) String (문자열)
 * 3) Boolean
 * 4) undefined
 * 5) null
 * 6) Symbol
 * 
 * 7) Object (객체)
 *     Function
 *     Array
 *     Object
 */

// Number 타입
const age = 99;
const tempature = -10;
const pi = 3.14;

console.log(typeof age);
console.log(typeof tempature);
console.log(typeof pi);
console.log('---------------------');

const infinity = Infinity;
const nInfinity = -Infinity;
console.log(typeof Infinity);
console.log(typeof -Infinity);

console.log('----------------------');

// String 타입
const enough  = 'Enough';
console.log(typeof enough);

const ive = "'아이브', 안유진";
console.log(ive);


/**
 * Template Literal
 * 
 * Escaping Character
 * 1) newline -> /n
 * 2) tab -> /t
 * 3) 백슬래시를 String으로 표현하고 싶다면 2번 입력
 *
*/

const iveYuJin = '아이브\n안유진';
console.log(iveYuJin);

const iveWonYoung = '아이브\t장원영';
console.log(iveWonYoung);

const backSlash = '아이브\\enough';
console.log(backSlash);

const smallQutoation = '아이브\'enough';
console.log(smallQutoation);

const iveWonYoung2 = `아이브
장원영`;
console.log(iveWonYoung2);
console.log(typeof iveWonYoung2);

const groupName = '아이브';
console.log(groupName + ' 안유진');
console.log(`${groupName} 안유진`);
console.log('---------------------------');

/**
 * Boolean 타입
 */
const isTrue = true;
const isFlase = false;
console.log(typeof isTrue);
console.log(typeof isFlase);


/**
 * undefined
 * 
 * 사용자가 직접 값을 초기화하지 않았을 때 지정되는 값
 * 
 * 직접 undefinded로 값을 초기화하는 것은 지양해야함
 */

let noInit;
console.log(noInit);
console.log(typeof noInit);


/**
 * null 타입
 * 
 * undefined와 마찬가지로 값이 없다는 뜻이나
 * JS에서는 개발자가 명시적으로 없는 값으로 초기화할 때 사용됨
 */
let init = null;
console.log(init);
console.log(typeof init);
console.log('---------------------------');

/**
 * Symbol 타입
 * 
 * 유일무이한 값을 생성할 때 사용됨
 * 다른 Primitive 값들과 다르게 Symbol 함수를 호출해서 사용됨
 */
const test1 = '1';
const test2 = '1';
console.log(test1 === test2);

const symbol1 = Symbol('1');
const symbol2 = Symbol('2');
console.log(symbol1 === symbol2);

/**
 * Object 타입
 * 
 * Map
 * key:value의 쌍으로 이루어져있다
 */
const dictionary = {
    red: '빨간색',
    orange: '주황색',
    yellow: '노란색',
};

console.log(dictionary);
console.log(dictionary['red']);
console.log(dictionary['orange']);
console.log(dictionary['yellow']);

console.log(typeof dictionary);

/**
 * Array 타입
 * 
 * 값을 리스트로 나열할 수 있는 타입
 */
const iveMembersArray = [
    '안유진',
    '가을',
    '레이',
    '장원영',
    '리즈',
    '이서',
];
console.log(iveMembersArray);

/**
 * index
 * 
 * 0부터 시작
 * 1씩 증가
 */
console.log(iveMembersArray[0]);
console.log(iveMembersArray[5]);

iveMembersArray[0] = 'enough';
console.log(iveMembersArray);
console.log(typeof iveMembersArray);

/**
 * static typing -> 변수를 선언할 때 어떤 타입의 변수를 선언할지 명시한다
 * dynamic typing -> 변수의 타입을 명시적으로 선언하지 않고 값에 의해 타입을 추론한다
 * JS -> dynamic typing
 */
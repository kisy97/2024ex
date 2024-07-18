let result1 = document.getElementById('func1');
let result2 = document.getElementById('func2');
let result3 = document.getElementById('func3');
let result4 = document.getElementById('func4');

/////////////////////////////////////////////////////////
// 함수 만들기
function all(a, b) {
    var result;
    result = a > b ? 'a가 큽니다.' : 'b가 큽니다.';
    return result;
}

var first = 13;
var last = 7;

result1.innerHTML += all(first, last) + '<br>';
result1.innerHTML += all(23, 45) + '<br>';
result1.innerHTML += all(1 / 2, 3 / 4) + '<br>';

//////////////////////////////////////////////
// 이름없는 함수만들기

var all2 = function (a, b) {
    var result;
    a > b ? result = 'a' : result = 'b';
    return result;
}
result2.innerHTML += all2(7, 10);

/////////////////////////////////////////////////////////
// 함수식
var f3 = 5;
var l3 = 7;

var all3 = (function (a, b) {
    var result;
    a > b ? result = 'a가 크다.' : result = 'b가 크다.';
    return result;
})(f3, l3)

result3.innerHTML += all3 + '<br>';
////////////////////////////////////////////////////////////
// 화살표 함수 let / const 변수명 = (매개변수) => { 실행문 }

// 매개변수 없는 경우 let / const 변수명 = () => { 실행문 }
const main1 = () => {
    result4.innerHTML += 'main1<br>';
}
main1();
// 매개변수 1개인 경우 let / const 변수명 = 매개변수 => { 실행문 }

const main2 = a => {
    result4.innerHTML += a;
}
main2('welcome<br>');
// 매개변수 여러개인 경우 let / const 변수명 = (매개변수,매개변수) => { 실행문 }

const main3 = (a, b) => {
    result4.innerHTML += (a + b) + '<br>';
}
main3(3, 5);
// 화살표함수 단축형
const main4 = () => result4.innerHTML += 'main4<br>';

main4();

const main5 = a => a * 2;
result4.innerHTML += main5(5) + '<br>';

const main6 = a => ({b:a});
result4.innerHTML += main6(25) + '<br>';




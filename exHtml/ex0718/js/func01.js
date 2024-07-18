var result01 = document.getElementById('func1');
var result02 = document.getElementById('func2');
var result03 = document.getElementById('func3');
var result04 = document.getElementById('func4');
var result05 = document.getElementById('func5');
var result06 = document.getElementById('func6');
var result07 = document.getElementById('func7');
var result08 = document.getElementById('func8');


function line() {
    result01.innerHTML += '<p>' + '*********************' + '</p>';
}
line();
line();
line();
line();

function add (num1,num2) {
    var hap = num1 + num2;
    result03.innerHTML += hap + "<br>";
}


////////////////////////////////////////////////////////////

function flower(flowerName) {

    switch (flowerName) {
        case '무궁화': alert('무궁화 동호회를 추천합니다!');
            break;
        case '장미': alert('장미 동호회를 추천합니다.');
            break;
        case '국화': alert('국화 동호회를 추천합니다.');
            break;

    }
}

//////////////////////////////////////////////////////////////

var first = 13;
var last = 7;

function all(a, b) {
    var sam = a + b;
    return sam;
}

var result = all(first, last);
result05.innerHTML += '결과값: ' + result;

//////////////////////////////////////////////////////////////
var num06 = 1;

function love() {
    var  a = num06 + 1;
    console.log('a:',a);
}
love();
console.log(num06);
//////////////////////////////////////////////////////////////
var num07 = 1;


function love2() {
    a = '산';
    var b = '강';
    document.write('함수내에서 출력',a,'<br>');
    document.write('함수내에서 출력',b,'<br>');
    return b;
}

document.write(love2(),'<br>');

/////////////////////////////////////////////////////////////

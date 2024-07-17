// 변수 선언

var num1 = 10;
var num2 = 20;
var num3 = 3;
var result = 0;


document.getElementById('cal01').innerHTML
    = num1 + num2 + "<br>";

document.getElementById('cal02').innerHTML
    = num1 - num2 + "<br>";

document.getElementById('cal03').innerHTML
    = num1 * num3 + "<br>";

document.getElementById('cal04').innerHTML
    = num2 / num3 + "<br>";

document.getElementById('cal05').innerHTML
    = num1 % num3 + "<br>";


//대입 연산자
document.getElementById('cal01_2').innerHTML
    = (result += num2) + "<br>";

result = 0;

document.getElementById('cal02_2').innerHTML
    = (result -= num2) + "<br>";

result = 10;

document.getElementById('cal03_2').innerHTML
    = (result *= num2) + "<br>";

result = 30;

document.getElementById('cal04_2').innerHTML
    = (result /= num2) + "<br>";

result = 55;

document.getElementById('cal05_2').innerHTML
    = (result %= num2) + "<br>";
/////////////////////////////////////////////////////////

var d = document;
var num = 5;
d.getElementById("cal01_3").innerHTML = ++num;
d.getElementById("cal02_3").innerHTML = num++;
d.getElementById("cal03_3").innerHTML = num--;
d.getElementById("cal04_3").innerHTML = --num;

// -----------------------------연결연산자 사용법

var a = 5, b = 6;
console.log('1문항의 답은', a + b, "입니다.");
console.log('1문항의 답은', (a + b), "입니다.");

// ------------------백틱 사용법

var num01 = 5, num02 = 6;
var result2 = `1문항의 답은 ${num01 + num02}`;
console.log(result2);

//-------------------비교 연산자
var comA = 20; comB = 10, comC ="10";
var result3 = `comA가 comB보다 크다. ${comA > comB}`;
console.log(result3);

result3 = `comA가 comB보다 작다. ${comA < comB}`;
console.log(result3);

result3 = `comB가 comC와 같다. ${comB == comC}`;
console.log(result3);

result3 = `comB가 comC와 타입까지 같다. ${comB === comC}`;
console.log(result3);

result3 = `comB가 comC와 타입까지 같지않다. ${comB !== comC}`;
console.log(result3);


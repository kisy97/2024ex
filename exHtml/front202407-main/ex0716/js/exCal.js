// document객체를 변수에 담음.
var d = document;
// 변수 선언
var num01 = 10;
var num02 = 20;
var num03 = 3;
var result;

// -------------------산술연산자
d.getElementById("cal01").innerHTML = num01 + num02;
d.getElementById("cal02").innerHTML = num01 - num02;
d.getElementById("cal03").innerHTML = num01 * num02;
d.getElementById("cal04").innerHTML = num02 / num03;
d.getElementById("cal05").innerHTML = num01 % num03;

// -------------------대입연산자
// result = result + num01
result = 0;
d.getElementById("cal2_01").innerHTML = result += num01;

// result = result - num01
result = 0;
d.getElementById("cal2_02").innerHTML = result -= num01;

// result = result * num03 곱하기
result = 30;
d.getElementById("cal2_03").innerHTML = result *= num03;

// result = result / num03 나누기
result = 30;
d.getElementById("cal2_04").innerHTML = result /= num03;

// result = result % num03 나머지가 몇이니?
result = 32;
d.getElementById("cal2_05").innerHTML = result %= num03;

// -------------------증감연산자
var num = 5;

d.getElementById("cal3_01").innerHTML = ++num;
d.getElementById("cal3_02").innerHTML = num;
d.getElementById("cal3_03").innerHTML = num++;
d.getElementById("cal3_04").innerHTML = num;
d.getElementById("cal3_05").innerHTML = --num;
d.getElementById("cal3_06").innerHTML = num;
d.getElementById("cal3_07").innerHTML = num--;
d.getElementById("cal3_08").innerHTML = num;

// -------------------연결연산자
var a = 5, b = 6;
console.log("1문항의 답은 ", a + b, "입니다");
console.log("1문항의 답은 " + (a + b) + "입니다");

d.getElementById("cal4_01").innerHTML
    = "1문항의 답은 " + (a + b) + "입니다";

// -------------------백틱사용법
var num1 = 5, num2 = 6;
var result2 = `1문항의 답은 ${num1 + num2} 입니다`;
d.getElementById("cal5_01").innerHTML = result2;

// -------------------비교연산자
var comA = 20; comB = 10, comC = "10";
var result3;

result3 = `1.크다: comA가 comB보다 크다 ${comA > comB}`;
d.getElementById("cal6_01").innerHTML = result3;

result3 = `2.작다: comB가 comA보다 작다 ${comB < comA}`;
d.getElementById("cal6_02").innerHTML = result3;

result3 = `3.같다: C와 같다 ${comB == comC}`;
d.getElementById("cal6_03").innerHTML = result3;

result3 = `4.타입까지 다 같다: C와 같다 ${comB === comC}`;
d.getElementById("cal6_04").innerHTML = result3;

result3 = `5.타입까지 다 같지 않다: C와 같다 ${comB !== comC}`;
d.getElementById("cal6_05").innerHTML = result3;

var num = 5;

var result1 = document.getElementById('result1');
var result2 = document.getElementById('result2');



if (num < 10) {
    result1.innerHTML = 'num은 10보다 작아요';
}

var num2;
//num2 = prompt('숫자를 입력하세요', '숫자만 입력해야되요');
if (num2 >= 10) {
    result2.innerHTML = 'if: num은 10이상이예요';
} else {
    result2.innerHTML = 'else: num은 10보다 작아요';

}

//삼항연산자일때
// result2.innerHTML = num2 > 10 ? 'if: num은 10이상이예요' : 'else: num은 10보다 작아요';

var str1 = '학년을 입력하세요';
var str2 = '1학년: 1, 2학년: 2, 3학년: 3, 기타: 4';
var classRoom;
//classRoom= prompt(str1, str2);
var result4 = document.getElementById('result4');

switch (classRoom) {
    case '1': { result4.innerHTML = '2층으로 가세요'; }
        break;

    case '2': { result4.innerHTML = '3층으로 가세요'; }
        break;

    case '3': { result4.innerHTML = '4층으로 가세요'; }
        break;

    case '4': { result4.innerHTML = '5층으로 가세요'; }
        break;

    default:
        break;
}
var result5 = document.getElementById('result5');

var result6 = document.getElementById('result6');
var resultStr = '';
for (let i = 1; i < 10; i++) {
    if (i == 9) {
        resultStr += i;
        continue;
    }
    resultStr += i + ', ';
}
result5.innerHTML = resultStr;

resultStr = '';



for (let dan = 2;dan < 10; dan++) {
    for (let i = 1; i < 10; i++) {
        resultStr += dan + ' * ' + i + ' = ' + dan * i + '<br>';
    }
}
result6.innerHTML = resultStr;
resultStr = '';

var numwhile = 10;

while(numwhile > 0) {
    resultStr += (numwhile + "<br>");
    numwhile--;
}
result7.innerHTML = resultStr;

resultStr = '';
let numDo = -10;

do {
    resultStr += numDo + '<br>';
    numDo--;
} while(numDo > 0);
result8.innerHTML = resultStr;

resultStr = '';

let numCnt;

for (numCnt=1;numCnt <= 10; numCnt++) {
    if(numCnt == 3) {
        continue;
    }
    resultStr += numCnt + '<br>';
}

result9.innerHTML = resultStr;

//날짜             Date()는 자바스크립트 자체가 가지고 있다.
var today = new Date();
console.log(today);
console.log(today.getFullYear());
today.setFullYear(2022);
console.log(today);

//오늘 날짜
var valYear = today.getFullYear() + '년 ';

// getMonth = 0-11 월 값
var valMonth = (today.getMonth()+1) + '월 ';
var valDate = today.getDate() + '일 ';

var valDay = today.getDay() + '요일';
var str = valYear + valMonth + valDate + valDay;
console.log(str);

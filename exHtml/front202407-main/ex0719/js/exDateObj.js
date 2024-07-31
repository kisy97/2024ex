// 날짜
var today = new Date();
console.log(today);
console.log(today.getFullYear());
// today.setFullYear(2022);
console.log(today.getFullYear());


//----- 오늘날짜를 찍어보자~ -----
var valYear = today.getFullYear() + "년 " ;
// ( 0 ~ 11까지의 값)
var valMonth = (today.getMonth() + 1) + "월 " ;
var valDate = today.getDate() + "일";
// 일요일부터 ( 0 ~ 6까지의 값)
var valDay = (today.getDay() + 1) + "요일";

var str = valYear + valMonth + valDate;
console.log(str);
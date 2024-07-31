// 변수 정의 var, let, const, 사용안함(글로벌변수)
var var1;
let var2;
const var3 = "http://~";

var1 = 123;
var2 = "123";
{
    var4 = "글로벌 변수로 사용됨";
}

// 값을 뿌려줄때
console.log(var3);

document.write(var1);
document.getElementById("variable2").innerText
    = "var2의 값은: " + var2 + "<hr>";
document.getElementById("variable3").innerHTML
    = "var2의 값은: " + var2 + "<hr>";




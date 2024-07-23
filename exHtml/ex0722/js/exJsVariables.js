var var1;
let var2;
const con1 = 'http://~';

var1 = 123;
var2 = '123';
{
    var3 = '글로벌 변수로 사용';
}

console.log(var3);

document.write(var1);
document.getElementById('variable2').innerHTML
    = 'var2의 값은: ' + var2 + '<br>';
document.getElementById('variable3').innerText
    = 'var2의 값은: ' + var2 + '<br>';
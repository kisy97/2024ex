/* document.getElementById('demo').innerHTML
    = document.getElementById('main')
    .getElementsByTagName('p')[0]
    .innerHTML + '__test'; */




/* var demo = document.getElementById('demo');

var main1 = document.getElementById('main');
var p = main1.getElementsByTagName('p');

demo.innerHTML = '두번째 ' + p[0].innerHTML; */





var x = document.getElementsByClassName('intro');
document.getElementById('demo').innerHTML
    = '클래스 접근: ' + x[0].innerHTML;
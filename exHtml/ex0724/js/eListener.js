var d = document;
var btn = d.getElementById('btn');
btn.addEventListener('click',displayDate);
function displayDate(){
    this.innerHTML = Date();
}

var btnOverOut = d.getElementById('btnOverOut');
var viewOverOut = d.getElementById('viewoverOut');

btnOverOut = addEventListener('mouseover',mytext);
btnOverOut = addEventListener('mouseout',mytext);

function mytext(e) {
    let myEvent = e.type;
    console.log(myEvent);
  }
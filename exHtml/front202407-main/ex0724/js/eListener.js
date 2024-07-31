var d = document;
var btn = d.getElementById("btn");
var date = d.getElementById("date");

function displayDate() {
    // this.innerHTML = Date();
    date.innerHTML = Date();
}
btn.addEventListener("click", displayDate);

// -----------------------------
var btnOverOut = d.getElementById("btnOverOut");
var viewOverOut = d.getElementById("viewOverOut");

function mytext(e){
    
    // e.type 이벤트의 종류
    let myEvent = e.type;
    // console.log(e.type);

    viewOverOut.innerHTML = `마우스 ${myEvent}이벤트가 발생하였습니다.`;
}
btnOverOut.addEventListener("click", mytext);
btnOverOut.addEventListener("dblclick", mytext);

// btnOverOut.addEventListener("mousemove", mytext);
// btnOverOut.addEventListener("mouseleave", mytext);

btnOverOut.addEventListener("mouseenter", mytext);
btnOverOut.addEventListener("mouseout", mytext);



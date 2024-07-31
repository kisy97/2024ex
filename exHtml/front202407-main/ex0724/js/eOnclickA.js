function myFun(id) {
    id.innerHTML = "나도 H1이야..Ooops2~~!!";
}
function myFun3() {
    // myH1.innerHTML = Date();
    this.innerHTML = Date();
}

var myH1 = document.getElementById("myH1");
myH1.onclick = myFun3;
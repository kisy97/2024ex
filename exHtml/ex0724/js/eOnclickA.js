function myFun(id) {
    id.innerHTML = 'h1 js Ooops~~!!'
}

function myFun3() {
    this.innerHTML = Date();
}

var myH1 = document.getElementById('myH1');
myH1.onclick = myFun3;
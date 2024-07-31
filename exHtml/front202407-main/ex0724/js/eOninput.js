// id="fname"
var fname = document.getElementById("fname");
var fname2 = document.getElementById("fname2");

function upperCase(){
    // fname.value = fname.value.toUpperCase();
    this.value = this.value.toUpperCase();
}
function upperCase2(){
    // fname.value = fname.value.toUpperCase();
    this.value = this.value.toLowerCase();
}

fname.oninput = upperCase;
fname2.onchange = upperCase2;

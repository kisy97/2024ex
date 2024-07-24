var fname = document.getElementById('fname');
var fname2 = document.getElementById('fname2');

function upperCase() {
    this.value = this.value.toUpperCase();
}

function lowerCase() {
    this.value = this.value.toLowerCase();
}

fname.oninput = upperCase;
fname2.onchange = lowerCase;
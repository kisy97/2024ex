var d = document;
// id="skill"
const skill = d.getElementById("skill");
skill.style.backgroundColor = "lightblue";
skill.style.border = "1px solid red";
console.log(skill);

// <a> 전체를접근
const w3 = d.getElementsByTagName("a");
// w3.style.backgroundColor = "yellow";
w3[0].style.backgroundColor = "yellow";
console.log(w3);

// <a><a><a>  <a>[0],<a>[1],<a>[2] 특정<a>접근
const w3_2 = d.getElementsByTagName("a")[2];
w3_2.innerHTML = "a태그의 세번째[0]요소";
w3_2.style.backgroundColor = "orange";
console.log(w3_2);


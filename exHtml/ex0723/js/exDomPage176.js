var d = document;

const skill = d.getElementById('skill');
skill.style.backgroundColor = 'lightblue';
console.log(skill);

const w3 = d.getElementsByTagName('a');
w3[0].style.backgroundColor = 'yellow';
console.log(w3);

const w3_2 = d.getElementsByTagName('a')[2];
w3_2.innerHTML = 'a태그의 세번째 요소[2]';
w3_2.style.backgroundColor = 'orange';
console.log(w3_2);
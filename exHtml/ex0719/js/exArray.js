var pen = new Array();

console.log(pen);

pen[0] = 'red';
console.log(pen);

pen[1] = 'green';
console.log(pen);

pen[2] = 'blue';
console.log(pen);

pen[3] = 'orange';
console.log(pen);

console.log(pen[2]);

var room = new Array();
room = ['red','green','blue','orange'];
console.log(room);

pen.reverse();
console.log('reverse: ', pen);

pen.shift();
console.log('shift: ',pen);

pen.unshift('pink','brown');
console.log('unshift: ', pen);

pen.pop();
console.log('pop: ', pen);

pen.push('pink','sky');
console.log('push: ', pen);

pen.splice(3);
console.log('splice(3)', pen);

pen.push('yellow','purple');
console.log('push: ',pen);

pen.splice(1,2);
console.log('splice(1,2)',pen);

pen.push('black','white');
console.log('push: ',pen);

pen.splice(1,2,'apple','grape');
console.log('splice(1,2,"apple,"grape")',pen);

var myval = pen.indexOf('grape');
console.log(myval);

console.log('pen.join: ',pen.join());
console.log('pen.join("/"): ',pen.join('/'));

// 오름차순
let pen2 = ['red','green','blue','orange'];
console.log('오름차순: ',pen2.sort());
// 내림차순
pen2.sort();
pen2.reverse();
console.log('내림차순: ',pen2);


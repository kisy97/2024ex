// forEach
let valForEach = ['people', 'dog', 'cat', 'rabbit'];

valForEach.forEach(function (item, index) {
    document.write(
        `<p>
            ${index} : ${item}입니다.
        </p>`
    );
});

// map 함수
let myNum = [1, 2, 3, 4, 5];
let myResult = myNum.map(function (item, index) {
    document.write(`<p> ${item} </p>`);
    return item * 3;
});
console.log(myResult);

//filter 함수
let myNum2 = [1, 2, 3, 4, 5, 6, 7, 8, 9];
let myResult2 = myNum2.filter(function (item, index) {
    return index % 2 === 0;
});
console.log(myResult2);
myNum2.forEach(function (item) {
    document.write(item, '입니다.<br>');
});

let myNum3 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let myResult3 = myNum3.reduce(
    (hap, item, index) => {
        return hap + (item * 2);
    }, 0)
console.log(myResult3);
// of문: 배열의 값을 불러옴
let myStr1 = ['red','blue','green','violet'];
for(let s of myStr1) {
    document.write(`<p> ${s} </p>`);
}
// in문: 배열의 인덱스를 불러옴
let myStr2 = ['red','blue','green','violet'];
for (let s in myStr2) {
    document.write(`<p>${myStr2[s]} 입니다.</p>`)
}
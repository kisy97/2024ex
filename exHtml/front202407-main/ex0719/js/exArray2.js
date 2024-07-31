console.log("--------------------------------------------");
// forEach함수
let valForEach = ["people", "dog", "cat", "rabbit"];

valForEach.forEach(function (item, index, array) {

    document.write(
        `<p> ${index} : ${item}</p>`
    );
})

// map함수
let myNum = [1, 2, 3, 4, 5];
let myResult = myNum.map(function (item, index, array) {

    document.write(
        `<p>  ${item}</p>`
    );
    return item * 3;
})
console.log(myResult);

// filter함수
let myNum2 = [1, 2, 3, 4, 5, 6, 7, 8, 9];
let myResult2 = myNum2.filter(function (item, index) {

    return index % 2 === 0;
})
console.log(myResult2);
myNum2.forEach(function (item) {
    document.write(item, "입니다<br>")
})

// reduce함수
let myNum3 = [11, 22, 33];
//  myNum3.reduce(함수, 0)
let myResult3 = myNum3.reduce(
    (hap, item, index) => {

        return hap + (item * 2);
    }, 0)
console.log(myResult3);

// for ~in문
let myStr1 = ["red", "blue", "green", "viilet"];
for (let s in myStr1) {
    document.write(`for ~in문myStr1[s]: ${myStr1[s]}입니다<br>`);
}

// for ~of문
let myStr2 = ["red", "blue", "green", "viilet"];
for (let ss of myStr2) {
    document.write(`for ~of문ss: ${ss}입니다<br>`);
}
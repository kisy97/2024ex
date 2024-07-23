/* class Book {
    constructor(title,actor,year) {
        this.title = title;
        this.actor =actor;
        this.year =year;
    }
    list() {
        console.log(
            `${this.title}: ${this.actor} : ${this.year}`
        );
    }

}

const it = [
    new Book('photoshop','A작가',2021),
    new Book('javascript','B작가',2022)

]

it[0].list();
it[1].list(); */

/* class Rect {
    constructor(width, height) {
        this.width = width;
        this.height = height;
    }
    area() {
        console.log(this.width * this.height);
    }
}

const myRect = new Rect(100, 300);
myRect.area();

class Triangle extends Rect {
    constructor(width, height) {
        super(width, height);
    }
    area() {
        console.log((this.width * this.height) / 2);
    }
}
const myTri = [
    new Triangle(100, 300),
    new Triangle(40, 70)
]

myTri[0].area();
myTri[1].area(); */

const num = {
    'brand name' : 'MyBrand',
    level : 2,
    'born-year' : 2022,
    isVeryNice : true,
    '1stName' : 'javascript',
    bestCourse : {
        title : '프론트엔드',
        language : 'javascript',
        'level num' : 1
    },
    name : [1,2,3,4,5]
}

console.log(num.level);
console.log(num['brand name']);
console.log(num['1stName']);
console.log(num['born'+'-'+'year']);
console.log(num.bestCourse.title);
console.log(num.bestCourse['level num']);
console.log(num.name[2]);


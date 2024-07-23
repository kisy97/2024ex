
function Picture(image, title, artist) {
    this.image = image;
    this.title = title;
    this.artist = artist;
    this.art = function () {
        document.write('<dl><dt>', this.artist, '</dt><dd><img src="', this.image, '"></dd><dd>', this.title, '</dd></dl>');
    }
}
/*
var Picture01 = new Picture('images/pic01.jpg', '에펠탑의 신랑 신부', '마르크 샤갈');
var Picture02 = new Picture('../javascript/all/06/images/pic02.jpg', '꿈', '파블로 피카소');
var Picture03 = new Picture('../javascript/all/06/images/pic03.jpg', '무용실', '에드가 드가');
var Picture04 = new Picture('../javascript/all/06/images/pic04.jpg', '피아노치는 소녀들', '오귀스트 르누아르');

 console.log(Picture02);

Picture01.art();
Picture02.art();
Picture03.art();
Picture04.art(); */

let picture = [
    new Picture('images/pic01.jpg', '에펠탑의 신랑 신부', '마르크 샤갈'),
    new Picture('../javascript/all/06/images/pic02.jpg', '꿈', '파블로 피카소'),
    new Picture('../javascript/all/06/images/pic03.jpg', '무용실', '에드가 드가'),
    new Picture('../javascript/all/06/images/pic04.jpg', '피아노치는 소녀들', '오귀스트 르누아르')
]

console.log(picture[1]);
console.log(picture.length);
for(let i = 0;i<=picture.length-1;i++){
    picture[i].art();
}



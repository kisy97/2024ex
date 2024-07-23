
function Picture(image, title, artist, year) {
    this.image = image;
    this.title = title;
    this.artist = artist;
    this.year = year;
    Picture.prototype.art = function () {
        document.write('<dl><dt>', this.artist, '</dt><dd><img src="', this.image, '"></dd><dd>', this.title, '</dd></dl>');
    }
    Picture.prototype.artYear = function () {
        document.write(`<p><span>${this.title}: </span><span>${this.year} </span></p>`)
    }
}

var picture = [
    new Picture('images/pic01.jpg', '에펠탑의 신랑 신부', '마르크 샤갈',2000),
    new Picture('../javascript/all/06/images/pic02.jpg', '꿈', '파블로 피카소',2001),
    new Picture('../javascript/all/06/images/pic03.jpg', '무용실', '에드가 드가',2002),
    new Picture('../javascript/all/06/images/pic04.jpg', '피아노치는 소녀들', '오귀스트 르누아르',2003)
]

var num = picture.length;
console.log(num);

for(let i=0;i<=num-1;i++){
    picture[i].art();
}

for(let i=0;i<=num-1;i++){
    picture[i].artYear();
}
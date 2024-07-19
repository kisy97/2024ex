var Picture = new Object();
Picture.image = '';
Picture.title = '에펠탑의 신랑신부';
Picture.artist = '마르크 샤갈';
Picture.year = '유화'
Picture.art = function(){
    document.write(`<dl><dt>${Picture.title}</dt><dd><img src='${Picture.image}' alt='사진'></dd></dl>`);
}
console.log(Picture);
console.log(Picture.artist);
Picture.art();
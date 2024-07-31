
/* // 오브젝트 생성
var Picture = new Object();

// 속성properti 생성 및 초기화
Picture.title = "에펠탑의 신랑신부";
Picture.artist = "마르크 샤갈";
Picture.type = "유화";

// 행위Method
Picture.art = function(){
    document.write(
        `제목: ${Picture.title} <br> 작가: ${Picture.artist}`
    );
}
Picture.art(); */

// =====================================================

var Pic ={
    tit: "에펠탑의 신랑신부",
    art: "마르크 샤갈",
    year: "1965"
}
document.write("<br>제목은: " + Pic.tit 
    + "<br>작가는: " + Pic.art + "<br>년도는: " + Pic.year);
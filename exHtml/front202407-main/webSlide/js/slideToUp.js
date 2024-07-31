var slide = $(".slideContent>img");
var startCnt = 0;
var endCnt = slide.length - 1;

var timer = setInterval("autoSlide()", 3000);

function autoSlide() {
    $(slide[startCnt]).stop().animate(
        { top: "-300px" }, 1000, function () {
            $(this).css({ top: "300px" });
        }
    );
    startCnt++;
    if (startCnt > endCnt) {
        startCnt = 0;
    }
    $(slide[startCnt]).stop().animate(
        { top: "0" }, 1000);
}



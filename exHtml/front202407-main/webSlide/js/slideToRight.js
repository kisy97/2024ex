var slide = $(".slideContent>img");
var startCnt = 0;
var endCnt = slide.length - 1;

var timer = setInterval("autoSlide()", 3000);

function autoSlide() {
    $(slide[startCnt]).stop().animate(
        { left: "100%" }, 1000, function () {
            $(this).css({ left: "-100%" });
        }
    );
    startCnt++;
    if (startCnt > endCnt) {
        startCnt = 0;
    }
    $(slide[startCnt]).stop().animate(
        { left: "0" }, 1000);
}



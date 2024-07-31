// ID로 접근
/* document.getElementById("demo").innerHTML
    = document.getElementById("main")
        .getElementsByTagName("p")[0]
        .innerHTML + "___test";
 */

// id가 demo인 요소에 접근        
/* var demo = document.getElementById("demo");

// id가 main 요소에 접근
var main1 = document.getElementById("main");
// id가 main안에 있고, 태그가 p인 요소에 접근
var p = main1.getElementsByTagName("p");

demo.innerHTML = "두번째: " + p[0].innerHTML; */

// 클래스 접근
var x = document.getElementsByClassName("intro");
document.getElementById("demo").innerHTML
= "클래스접근: " + x[0].innerHTML;
//글로벌 === 전역
var i = 30;
var j = 15;
var d1 = document.getElementById('cal1');

window.onload = function() {
    var result = (i < j) ? "i가 j보다 크다." : "i가 j보다 작다.";
    var result2 = (i < j) ? "i가 j보다 크다." : "i가 j보다 작다.";

    d1.innerHTML = result2
    console.log(result);

    // 연산자 우선순위
    /* 
    1.  ___ 수학에서 ()가 최우선순위 연산하는 것과 같다.
    1. ()
    2.  ___ 괄호안에 있는 사칙연산을 수행주엥 증감연사자를 만나면 증감연산자를 우선적으로 연산한다.
        ___ 하지만, 후행연산자는 이미연산하였지만, 특성상 사칙연산을 끝나고 감소증가를 하게된다.
    2. 증감연산자 ++ --
    3.  ___ 기본적으로 ()안의 사칙연산 수행
    3. 사칙연산
    4.  ___ 이미 계산이 끝난 값들에 대하서 비교한다.
    4. 비교연산자

    5. 대입연산자
    
    */
}


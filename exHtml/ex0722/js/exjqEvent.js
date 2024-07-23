$(function () {
    $('.wrap1 p').click(function () { 
        $(this).hide();
        
    });


    $('.wrap2 p').dblclick(function () { 
        $(this).hide();
        
    });


    $('#p1').mouseenter(function () { 
        alert('You entered p1');
    });

    $('#p2').mouseleave(function () { 
        alert('Bye! You now leave p2!');
    });

    $('#p3').mousedown(function () { 
        alert('Mouse down over p3!');
    });

    $('#p4').mouseup(function () { 
        alert('Mouse up over p4!');
    });

    $('#p5').hover(function () { 
        alert('you entered p5!');
    },
    function() {
        alert('bye you now leave p5!');
    });



    $('input').focus(function () { 
        $(this).css('background-color','yellow');
        
    });
    $('input').blur(function () { 
        $(this).css('background-color','green');
        
    });
});

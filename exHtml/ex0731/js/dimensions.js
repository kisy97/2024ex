$('button').click(function (e) { 
    e.preventDefault();
    let w = $('#div1').width();
    let h = $('#div1').height();
    let iw = $('#div1').innerWidth();
    let ih =$('#div1').innerHeight();
    let ow = $('#div1').outerWidth();
    let oh = $('#div1').outerHeight();

    $('.div1').html(w + '<br>' +h);
    $('.div1').append('<br>'+iw + '<br>' +ih);
    $('.div1').append('<br>'+ow + '<br>' +oh);


});
$(document).ready(function(){
    $("#botao").click(function(){
    $("html,body").animate({scrollTop: $("#secao-2").offset().top}, 800);
        return false;

    });

});

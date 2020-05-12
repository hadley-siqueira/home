var slideAtivo = 0;
var numSlides = 3;

function mudarPara(id) {
    slideAtivo = id;
    mostrarSlide();
}

function mostrarSlide() {
    for (var i = 0; i < numSlides; ++i) {
        var d = document.getElementById('slide' + i); //

        if (i == slideAtivo) {
            d.style.display = 'block'; //
        } else {
            d.style.display = 'none'; //
        }
    }
}

var tamanho = 12;
var flag = true;

function rodar() {
    flag = true;
    rodar2();
}

function rodar2() {
    if (flag) {
        aumentar();
        window.requestAnimationFrame(rodar2); //
    }
}

function parar() {
    flag = false;
}

function aumentar() {
    var a = document.getElementById('meup'); //
    a.style.fontSize = tamanho + 'px'; //
    tamanho = tamanho + 1;
    var b = document.getElementById('tam'); //
    b.innerHTML = 'O tamanho esta em ' + tamanho + ' pixels'; //
}

function mudarOpacidade() {
    var e = document.getElementById('myRange');
    var valor = e.value;

    var o = document.getElementById('cab');

    o.style.opacity = '' + (valor / 100.0);
}

function prev() {
    --slideAtivo;

    if (slideAtivo < 0) {
        slideAtivo = numSlides - 1;
    }

    mostrarSlide();
}

function prox() {
    ++slideAtivo;

    if (slideAtivo >= numSlides) {
        slideAtivo = 0;
    }

    mostrarSlide();
}

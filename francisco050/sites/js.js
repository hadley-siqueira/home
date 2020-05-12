
var a = document.getElementById('paragrafo2');
var b = document.getElementById('gato');

function vermelho(){
    a.style.color = "#f00";
}
 function verde(){
    a.style.color = "#2f0";

}

function aparecer(){
    b.style.display = "block";
    animar();
}

function desaparecer(){
    animar2();   
//    b.style.display = "none";
    
}

var tam = 0;

function animar() {
    var img = document.getElementById('gato');
    img.style.width = tam + 'px';
    tam++;

    if (tam < 300) {
        setTimeout(animar, 10);
    }
}

function animar2(){
    var img2=document.getElementById('gato');

    img2.style.width = tam + 'px';
    tam--;
    if(tam >0){
        setTimeout(animar2, 10);
    }
}

pos = 0;

function animar3() {
    var img = document.getElementById('gato');
    var img2 = document.getElementById('gato2');

    img.style.position = 'relative';
    img.style.left = pos + 'px';
    img.style.opacity = pos / 250.0;

    img2.style.position = 'relative';
    img2.style.right = pos + 'px';
    img2.style.opacity = pos / 250.0;

    pos += 10;

    if (pos < 250) {
        setTimeout(animar3, 10);
    }
}

function v() {
    window.alert(window.pageYOffset);
}

document.addEventListener('scroll', function() {
    var img = document.getElementById('gato');
    var p = window.pageYOffset;

    if (p < 250) {
        img.style.opacity = 0;
    } else if (p >= 200 && p < 250) {
        img.style.opacity = (300 - p) / 50.0
    } else {
        img.style.opacity = 1.0;
    }
});

var total = 3;
var slideAtivo = 0;
function mostrarSlide(){
    for(var i=0; i< total; i++){

        var d = document.getElementById('slide' + i);

        if(i == slideAtivo){
            d.style.display= "block";
        } else
         {
            d.style.display = "none"; 
         }
    }
}

function proximo(){
    slideAtivo ++;
    if(slideAtivo > 2){
        slideAtivo = 0;
    }
    mostrarSlide();
    
}

function anterior(){
    slideAtivo --;

    if(slideAtivo < 0){
        slideAtivo = 2;
    }
     mostrarSlide();
}

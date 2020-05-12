
   var x = document.getElementById("caixa-imagem").onclick = function() {mudarImg()};
    function mudarImg() {
        x.style.opacity = 0.5;
    }  


var posicao = 0;
      var mensagem = "Sua mensagem aqui      <br>É incrível, não é? :)      <br>Chame a atenção do usuário      <br>Indique <a href='#'>links</a> para ele.                  "; 

      function rola() {
        document.getElementById("lugar").innerHTML = mensagem.substring(posicao,mensagem,length);
        posicao++;
        if (posicao == mensagem.length) {
      posicao = 0;
        }
        setTimeout("rola()", 130);
      }
function teste(){
    alert("aa");
}

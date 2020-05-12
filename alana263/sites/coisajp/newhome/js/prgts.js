function verificar(q){
      if (q == "1") {
        qst("#q11","se");
        qst("#q12",">");
        qst("#q13","entao");
        qst("#q14","escreva");
        qst("#q15","fimse");
      }
      if (q == "2") {
        qst("#q21","leia(n1)");
        qst("#q22","leia(n2)");
        qst("#q23","leia(n3)");
        qst("#q24","leia(n4)");
        qst("#q25","<-");
        qst("#q26","n1");
        qst("#q27","n2");
        qst("#q28","n3");
        qst("#q29","n4");
        qst("#q210","se");
        qst("#q211","entao");
        qst("#q212","escreva(\"aprovado\")");
        qst("#q213","fimse");
        qst("#q214","se");
        qst("#q215","entao");
        qst("#q216","escreva(\"reprovado\")");
        qst("#q217","fimse");

      }
      if (q == "3") {
        qst("#q31","leia(produzidas)");
        qst("#q32","leia(defeito)");
        qst("#q33","<-");
        qst("#q34","produzidas");
        qst("#q35","se");
        qst("#q36","entao");
        qst("#q37","senao");
        qst("#q38","fimse");

      }
      if (q == "4") {
        qst("#q41","escreva");
        qst("#q42","leia(valor)");
        qst("#q43","enquanto");
        qst("#q44","faca");
        qst("#q45","fat * i");
        qst("#q46","fimenquanto");

      }
      if (q == "5") {
        qst("#q51","para");
        qst("#q52","2");
        qst("#q53","100");
        qst("#q54","passo 2");
        qst("#q55","escreva");
        qst("#q56","fimpara");

      }

}

function qst(id, resp){
  if($(id).val() == resp){
    $(id).addClass("certo").removeClass("errado");
  }else {
    $(id).addClass("errado");
  }
}

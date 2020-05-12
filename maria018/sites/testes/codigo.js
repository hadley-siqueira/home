function media(n1, n2, n3, n4) {
    var m = (n1 + n2 + n3 + n4) / 4.0;
    return m;
}

function lf(msg) {
    return parseFloat(window.prompt(msg));
}

function ls(msg) {
    return window.prompt(msg);
}

function lerNota(msg) {
    return lf('Por favor, digite a ' + msg + ' nota (entre 0 e 100)');
}

function mediaAluno(nome) {
    var nota1 = lerNota('primeira');
    var n2 = lerNota('segunda');
    var n3 = lerNota('terceira');
    var n4 = lerNota('quarta');

    console.log('A media de ' + nome + ' foi ' + media(nota1, n2, n3, n4));
}

function mostrarMediaAluno() {
    var nome = window.prompt('Digite o nome do aluno');
    mediaAluno(nome);
}

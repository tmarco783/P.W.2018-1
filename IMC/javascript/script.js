function CalcularIMC(){
    var peso = document.getElementById("inputPeso").value;
    var altura = document.getElementById("inputAltura").value;

    var imc = parseFloat(peso / (altura * 2)).toFixed(2);
    
    var botao = document.getElementById("botaCalcular");
}
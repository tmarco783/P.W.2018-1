<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>IMC com JSP</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- CSS do Bootstrap -->
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
</head>

<body>

    <div class="card">
        <div class="card-header">
            <h3>Calcular o IMC</h3>
        </div>
        <div class="card-body">
          <blockquote class="blockquote mb-0">

            <!-- Form do IMC -->
            <form>
                <!-- Peso -->
                <div class="form-group" id="peso">
                  <label for="peso">Peso</label>
                  <input type="text" class="form-control" name="inputPeso" aria-describedby="entrar com o peso" placeholder="Digite o peso">
                </div>

                <!-- Altura -->
                <div class="form-group">
                  <label for="altura">Altura</label>
                  <input type="text" class="form-control" name="inputAltura" placeholder="Digite a altura">
                </div>

                <% 
                
                String peso = request.getParameter("inputPeso");
                String altura = request.getParameter("inputAltura");
                
                float imc = Float.parseFloat(inputPeso) / (Float.parseFloat(inputAltura) * Float.parseFloat(inputAltura));
                String condicaoAtual;
                
                if(imc < 18){
                    condicaoAtual = "Você está abaixo do peso.";
                }else if(imc >= 18 && imc < 25){
                    condicaoAtual = "Seu peso está normal.";
                }else if(imc >= 25 && imc < 30){
                    condicaoAtual = "Você está acima do normal.";
                }else{
                    condicaoAtual = "Você está obeso.";
                }

                %>
                
                
                <!-- Botão calcular -->
                <button type="submit" class="btn btn-primary">Calcular</button>

            </form>

          </blockquote>
        </div>
    </div>

    <!-- Javascript do Bootstrap -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
</body>
</html>

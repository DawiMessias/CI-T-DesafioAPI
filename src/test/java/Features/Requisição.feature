#language: pt

  @GET
  Funcionalidade: Requisição

    Cenario: Verifico a funcionalidade da API
    Dado realizar uma requisição get na url
    Então valido a requisição bem sucedida


    Cenario: Verifico a funcionalidade da API
    Dado não consiga realizar requisição que não seja get
    Então valido a falha na requisição
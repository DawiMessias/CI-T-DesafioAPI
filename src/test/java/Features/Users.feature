#language: pt

@GET
Funcionalidade: Coleção Users

  Cenario: Verifico a funcionalidade da API
    Dado realizo uma requisição na API
    Então valido o tamanho da coleção users


  Cenario: Verifico valores dos campos
    Dado realizo uma requisição na API
    Então valido os campos da coleção users
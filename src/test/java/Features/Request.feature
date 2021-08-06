#language: pt

  @GET
  Funcionalidade: request

    Cenario: I check the functionality of the API
    Dado perform a get request at the url
    Então valid successful request


    Cenario: I check the functionality of the API bad request
    Dado cannot perform requisition other than get
    Então valid the failure in the request
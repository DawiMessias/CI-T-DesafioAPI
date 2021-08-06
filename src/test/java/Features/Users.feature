#language: pt

@GET
Funcionalidade: Users Collection

  Cenario: I check api functionality
    Dado I make a request in the API
    Então valid the size of the users collection


  Cenario: I check field values
    Dado I make a request in the API
    Então valid the fields of the users collection
package Steps;

import Utilities.Methods;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;

public class UsersSteps {

  Methods methods = new Methods();

  @Dado("realizo uma requisição na API")
  public void realizo_uma_requisição_na_api() {
    methods.realizaGetNaUrl();

  }
  @Então("valido o tamanho da coleção users")
  public void valido_o_tamanho_da_coleção_users() {
    methods.validoTamanhoColeçãoUsers();
  }

  @Então("valido os campos da coleção users")
  public void valido_os_campos_da_coleção_users() {
//    methods.validaCamposUsers();
    methods.validaValoresPrimeiroObjeto();
    methods.validaValoresSegundoObjeto();
  }


}

package Steps;

import Utilities.Methods;
import io.cucumber.java.pt.Então;

public class AddressSteps {

  Methods methods = new Methods();

  @Então("valido todos os valores e campos")
  public void valido_todos_os_valores_e_campos() {
    methods.validoValoresAddress();
  }
}

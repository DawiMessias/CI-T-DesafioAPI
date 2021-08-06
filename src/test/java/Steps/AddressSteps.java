package Steps;

import Utilities.Methods;
import io.cucumber.java.pt.Então;

public class AddressSteps {

  Methods methods = new Methods();

  @Então("valid all values and fields")
  public void valid_all_values_and_fields() {
//    methods.validoTamanhoAddress();
    methods.validatesValuesAddress();
  }
}

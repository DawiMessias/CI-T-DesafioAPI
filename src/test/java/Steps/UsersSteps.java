package Steps;

import Utilities.Methods;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;

public class UsersSteps {

  Methods methods = new Methods();

  @Dado("I make a request in the API")
  public void i_make_a_request_in_the_api() {
    methods.get();

  }
  @Então("valid the size of the users collection")
  public void valid_the_size_of_the_users_collection() {
    methods.validSizeCollectionUsers();
  }

  @Então("valid the fields of the users collection")
  public void valid_the_fields_of_the_users_collection() {
//    methods.validaCamposUsers();
    methods.validatesValuesFirstObject();
    methods.validatesValuesSecondObject();
  }


}

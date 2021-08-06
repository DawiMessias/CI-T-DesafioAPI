package Steps;

import Utilities.Methods;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class RequestSteps {

  Methods methods = new Methods();

  @Dado("perform a get request at the url")
  public void perform_a_get_request_at_the_url(){
    methods.get();
  }


  @Então("valid successful request")
  public void valid_successful_request() {
    methods.get();
  }
}

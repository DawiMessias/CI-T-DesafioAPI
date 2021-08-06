package Steps;

import Utilities.Methods;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class GetSteps {

  Methods methods = new Methods();

  @Dado("realizar uma requisição get na url")
  public void realizar_a_requisicao_na_API(){
    methods.realizaGetNaUrl();
  }


  @Então("valido a requisição bem sucedida")
  public void valido_a_requisicao_bem_sucedida() {
    given().when().get("https://g1lru963f9.api.quickmocker.com/")
            .then()
            .statusCode(200).
            body("users[0].name", containsString("Michael"));
  }
}

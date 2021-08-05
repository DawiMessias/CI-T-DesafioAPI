package Steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class GetSteps {

  private static ResponseOptions<Response> response;

  @Dado("realizar uma requisição get na url")
  public void realizar_a_requisicao_na_API(){
    given().contentType(ContentType.JSON);
    given().when().get("https://g1lru963f9.api.quickmocker.com/");
  }


  @Então("valido a requisição bem sucedida")
  public void valido_a_requisicao_bem_sucedida() {
    given().when().get("https://g1lru963f9.api.quickmocker.com/")
            .then()
            .statusCode(200).
            body("users[0].name", containsString("Michael"));
  }
}

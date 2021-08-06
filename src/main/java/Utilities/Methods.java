package Utilities;

import io.restassured.http.ContentType;
import org.hamcrest.xml.HasXPath;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Methods {

  public void realizaGetNaUrl() {
    given().contentType(ContentType.JSON);
    given().when().get("https://g1lru963f9.api.quickmocker.com/")
            .then()
            .statusCode(200);
  }

  public void validoTamanhoColeçãoUsers() {
    given().contentType(ContentType.JSON);
    given().when().get("https://g1lru963f9.api.quickmocker.com/").then()
            .body("users", hasSize(2));
  }

  public void validaCamposUsers() {
    given().contentType(ContentType.JSON);
    given().when().get("https://g1lru963f9.api.quickmocker.com/")
            .then().log().body(HasXPath("users/name")).c;

  }


  public void validaValoresPrimeiroObjeto() {
    given().contentType(ContentType.JSON);
    given().when().get("https://g1lru963f9.api.quickmocker.com/").then()
            .body("users[0].name", is("Michael"))
    .body("users[0].last_name", is("Jackson"))
    .body("users[0].age", is(33))
    .body("users[0].date_nasc", is("10/07/1988"));

  }

  public void validaValoresSegundoObjeto() {
    given().contentType(ContentType.JSON);
    given().when().get("https://g1lru963f9.api.quickmocker.com/").then()
            .body("users[1].name", is("Margareth"))
            .body("users[1].last_name", is("Thatcher"))
            .body("users[1].age", is(50))
            .body("users[1].date_nasc", is("10/12/1968"));
  }

}

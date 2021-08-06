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

//  public void validaCamposUsers() {
//    given().contentType(ContentType.JSON);
//    given().when().get("https://g1lru963f9.api.quickmocker.com/")
//            .then().log().body().log().all()
//            .header("content-type", is("application/json"))
//            .body("name", hasXPath("users[0].name"));
//
  //Tentativa para validar existência dos campos, name, age, date_nasc...
//  }


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

  public void validoValoresAddress() {
    given().contentType(ContentType.JSON);
    given().when().get("https://g1lru963f9.api.quickmocker.com/").then()
            .body("address.city", is("São Paulo"))
            .body("address.street", is("Avenida das Oliveiras"))
            .body("address.number", is(99))
            .body("address.UF", is("SP"))
            .body("address.geo[0].state.lat", is(4514.13515f))
            .body("address.geo[0].state.long", is(15132534))
            .body("address.geo[0].state.planet[0]", is("Earth"))
            .body("address.others[0]", is("AP401"));
  }

}

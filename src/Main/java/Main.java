import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;

public class Main {
    public static void main(String[] args) {

        // Создание карточки CardForAPI

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("key", "6f6bba134c8ce0b69b3467261781eddd");
        params.put("token", "6690f2c89ca23f834939fd7c3b753e0e1c12cff5b3ca5696e11e8f40ca0cfb92");
        params.put("name", "CardForAPI");
        params.put("idList", "5fdcf8a58bddba0e6bf843fb");
        String cardID = given().baseUri("https://api.trello.com").queryParams(params).contentType("application/json; charset=utf-8")
                .when().post("/1/cards")
                .then().statusCode(200).extract().path("id");
        System.out.println(cardID);

    }
}
/*
Создание карточки CardForDelete

params.put("key", "6f6bba134c8ce0b69b3467261781eddd");
params.put("token", "6690f2c89ca23f834939fd7c3b753e0e1c12cff5b3ca5696e11e8f40ca0cfb92");
params.put("name", "CardForDelete");
params.put("idList", "5fdcf8a58bddba0e6bf843fb");
String cardID = given().baseUri("https://api.trello.com").queryParams(params).contentType("application/json; charset=utf-8")
        .when().post("/1/cards")
        .then().statusCode(200).extract().path("id");
System.out.println(cardID);
*/



/*
Добавление текста в карточку CardForAPI

params.put("id", "5fdcfda7f6afae6f5e72b96e");
params.put("key", "6f6bba134c8ce0b69b3467261781eddd");
params.put("token", "6690f2c89ca23f834939fd7c3b753e0e1c12cff5b3ca5696e11e8f40ca0cfb92");
params.put("desc", "CardForAPI");
given().baseUri("https://api.trello.com").queryParams(params).contentType("application/json; charset=utf-8")
        .when().put("/1/cards/{id}", "5fdcfda7f6afae6f5e72b96e")
        .then().statusCode(200);
*/




/*
Создание еще одного листа ApiList

params.put("key", "6f6bba134c8ce0b69b3467261781eddd");
params.put("token", "6690f2c89ca23f834939fd7c3b753e0e1c12cff5b3ca5696e11e8f40ca0cfb92");
params.put("name", "ApiList");
params.put("idBoard", "5fdcd53518636d1fdce70407");
given().baseUri("https://api.trello.com").queryParams(params).contentType("application/json; charset=utf-8")
        .when().post("/1/lists")
        .then().statusCode(200);
*/



/*
Перемещение карточки CardForAPI в лист ApiList

params.put("id", "5fd32bb060773288c5a82610");
params.put("key", "6f6bba134c8ce0b69b3467261781eddd");
params.put("token", "6690f2c89ca23f834939fd7c3b753e0e1c12cff5b3ca5696e11e8f40ca0cfb92");
params.put("idList", "5fd32d70d3da050cbe28f917");
given().baseUri("https://api.trello.com").queryParams(params).contentType("application/json; charset=utf-8")
        .when().put("/1/cards/{id}", "5fd32bb060773288c5a82610")
        .then().statusCode(200);
*/



/*
Удаление карточки CardForDelete

params.put("id", "5fdcfcae66132c838dfe7c3e");
params.put("key", "6f6bba134c8ce0b69b3467261781eddd");
params.put("token", "6690f2c89ca23f834939fd7c3b753e0e1c12cff5b3ca5696e11e8f40ca0cfb92");
given().baseUri("https://api.trello.com").queryParams(params).contentType("application/json; charset=utf-8")
        .when().delete("/1/cards/{id}", "5fdcfcae66132c838dfe7c3e")
        .then().statusCode(200);
*/
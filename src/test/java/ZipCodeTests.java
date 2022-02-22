import io.restassured.RestAssured;
import models.Location;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ZipCodeTests {

    @Test
    public void testBeverlyHills(){
        Location location = given()
                .get(" http://api.zippopotam.us/us/90210")
                .as(Location.class);
    }
}

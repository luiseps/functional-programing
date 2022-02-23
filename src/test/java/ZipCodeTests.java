import models.Location;
import models.Place;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZipCodeTests {

    @Test
    public void testBeverlyHills(){

        Location expectedLocation = new Location(
                "90210",
                "United States",
                "US",
                List.of(new Place(
                        "Beverly Hills",
                        "-118.4065",
                        "California",
                        "CA",
                        "34.0901")));

        Location location = given()
                .get(" http://api.zippopotam.us/us/90210")
                .as(Location.class);

        assertEquals(location, expectedLocation);

    }
}

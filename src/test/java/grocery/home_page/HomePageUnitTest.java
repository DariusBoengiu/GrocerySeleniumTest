package grocery.home_page;

import org.example.grocery.home_page.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HomePageUnitTest {

    @BeforeAll
    static void goToURL() {
        HomePage.goTo();
    }

    @Test
    public  void canGoToSpecifiedURL() {
        Assertions.assertEquals("http://localhost:4200/welcome", HomePage.isAt());
    }
}

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class GradleTest {



    @Test
    public void  test(){

        open("https://www.google.com/");
        closeWebDriver();
    }
}

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class GradleTest {



    @Test
    public void  test(){

        open("https://www.google.com/");
        closeWebDriver();
    }

    @Test
    public void  test2(){

        open("https://www.google.com/");
        closeWebDriver();
    }

    @Test
    public void  test3(){

        open("https://www.google.com/");
        closeWebDriver();
    }
}

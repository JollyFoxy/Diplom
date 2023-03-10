package Tests.tosts;

import Tests.BaseTest;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test1 extends BaseTest {
    @Test
    @Link(name = "Buttons",url="https://demoqa.com/buttons")
    @DisplayName("Тест кнопок")
    public void testButtons(){
        step1();
        step2();
        step3();
        step4();
    }
    @Step("Перезод на страницу \"Buttons\"")
    public void step1(){
        buttons.transition.transitionAll();
    }
    @Step("Один клик")
    public void step2(){
        buttons.clickBtn.click();
        buttons.dynamicClickMessage.checkTextP("dynamic click");
    }
    @Step("Двойной клик")
    public void step3(){
        buttons.doubleClickBtn.doubleClickBtn();
        buttons.doubleClickMessage.checkTextP("double click");
    }
    @Step("Тройной клик")
    public void step4(){
        buttons.rightClickBtn.rightClickBtn();
        buttons.rightClickMessage.checkTextP("right click");
    }
}

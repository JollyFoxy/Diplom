package tools.Elements;

import com.codeborne.selenide.SelenideElement;

public class Li extends BaseElement{
    public Li(SelenideElement container){
        super(container);
    }
    public void clickLi(){
        container.click();
    }
}

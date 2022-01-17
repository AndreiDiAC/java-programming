package day59_polymorphism_exceptions.WebElem;

public class ElementsTest {
    public static void main(String[] args) {
        Link link = new Link();
        link.click();
        link.getText();
        link.sendKeys("hi");
        link.getLinkHref();

        WebElement loginLink = new Link();
        loginLink.click();
        String txt = loginLink.getText();
        System.out.println("txt = " + txt);

        WebElement username = new InputField();
        username.sendKeys("wooden spoon");
        username.click();
        WebElementUtil.clickElement(username);
        WebElementUtil.clickElement(loginLink);
        //WebElementUtil.clickElement(new String("hello")); String is not child of WebElement

        WebElement login = WebElementUtil.getLinkWithText("login");
        login.click();


    }
}

package $$interviewTasks;

import day55_abstraction_interface.WebDriver.ChromeDriver;
import day55_abstraction_interface.WebDriver.WebDriver;
import day59_polymorphism_exceptions.WebElem.WebElement;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class asd {

//    @Test
//    public void test2() throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html%22);
//                Map<String, String> map = new HashMap<>();
//        map.put("Rome", "Italy");
//        map.put("Madrid", "Spain");
//        map.put("Oslo", "Norway");
//        map.put("Copenhagen", "Denmark");
//        map.put("Seoul", "South Korea");
//        map.put("Stockholm", "Sweden");
//        map.put("Washington", "United States");
//        Actions actions = new Actions(driver);
//
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            Thread.sleep(1000);
//            WebElement source = driver.findElement(By.xpath("//div[.='" + entry.getKey() + "' and contains(@id, 'box') ]"));
//            WebElement target = driver.findElement(By.xpath("//div[.='" + entry.getValue() + "' and @class='dragableBoxRight']"));
//            actions.dragAndDrop(source, target).perform();
//            Thread.sleep(1000);
//            WebElement result = driver.findElement(By.xpath("//div[.='" + entry.getKey() + "' and contains(@id, 'box') ]"));
//            Assert.assertTrue(result.getAttribute("style").contains("background-color: rgb(0, 255, 0)"));
//        }
//        Thread.sleep(3000);
//        driver.quit();
//    }
}

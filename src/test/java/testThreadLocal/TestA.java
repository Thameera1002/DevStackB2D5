package testThreadLocal;

import org.testng.annotations.Test;

public class TestA extends BaseTest{

    @Test
    public void testA1() throws InterruptedException {
        driver.get("https://example.com/");
        System.out.println(driver.getTitle());
        Thread.sleep(1500);
    }
    @Test
    public void testA2() throws InterruptedException {
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        Thread.sleep(1500);
    }
}

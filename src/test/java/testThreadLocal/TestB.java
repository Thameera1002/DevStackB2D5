package testThreadLocal;

import org.testng.annotations.Test;

public class TestB extends BaseTest{
    @Test
    public void testB1() throws InterruptedException {
        driver.get("https://github.com/");
        System.out.println(driver.getTitle());
        Thread.sleep(1500);
    }
    @Test
    public void testB2() throws InterruptedException {
        driver.get("http://stackoverflow.com/questions");
        System.out.println(driver.getTitle());
        Thread.sleep(1500);
    }
}

package testThreadLocal;

import org.testng.annotations.Test;

public class TestA extends BaseTest{

    @Test
    public void testA1() throws InterruptedException {
        ThreadLocalWebDriverManager.getDriver().get("https://example.com/");
        System.out.println(ThreadLocalWebDriverManager.getDriver().getTitle());
        Thread.sleep(1500);
    }
    @Test
    public void testA2() throws InterruptedException {
        ThreadLocalWebDriverManager.getDriver().get("https://www.google.com/");
        System.out.println(ThreadLocalWebDriverManager.getDriver().getTitle());
        Thread.sleep(1500);
    }
}

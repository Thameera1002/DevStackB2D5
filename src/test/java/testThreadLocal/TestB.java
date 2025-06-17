package testThreadLocal;

import org.testng.annotations.Test;

public class TestB extends BaseTest{
    @Test
    public void testB1() throws InterruptedException {
        ThreadLocalWebDriverManager.getDriver().get("https://github.com/");
        System.out.println(ThreadLocalWebDriverManager.getDriver().getTitle());
        Thread.sleep(1500);
    }
    @Test
    public void testB2() throws InterruptedException {
        ThreadLocalWebDriverManager.getDriver().get("http://stackoverflow.com/questions");
        System.out.println(ThreadLocalWebDriverManager.getDriver().getTitle());
        Thread.sleep(1500);
    }
}

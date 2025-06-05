import org.testng.annotations.Test;

public class TestNGGroups {
    @Test(groups = {"smoke"})
    public void testMethod1() {
        System.out.println("TestMethod1");
    }

    @Test(groups = {"regression"})
    public void testMethod2() {
        System.out.println("TestMethod2");
    }

    @Test(groups = {"smoke"})
    public void testMethod3() {
        System.out.println("TestMethod3");
    }
    @Test(groups = {"regression"})
    public void testMethod4() {
        System.out.println("TestMethod4");
    }

    @Test(groups = {"smoke","regression"})
    public void testMethod5() {
        System.out.println("TestMethod5");
    }
}

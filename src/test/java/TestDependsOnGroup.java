import org.testng.annotations.Test;

public class TestDependsOnGroup {
    @Test(groups = "login")
    public void login1(){
        System.out.println("login1");
    }

    @Test(groups = "login")
    public void login2(){
        System.out.println("login2");
    }

    @Test(dependsOnGroups = {"login"})
    public void dashboard(){
        System.out.println("dashboard");
    }
}

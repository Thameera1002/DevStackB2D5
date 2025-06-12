import org.testng.annotations.Test;

public class CombinedEx{
    @Test(groups = {"smoke"}, priority = 1)
    public void loginTest() {
        System.out.println("Executing Smoke: Login Test");
    }
    @Test(groups = {"smoke"}, priority = 2)
    public void searchTest() {
        System.out.println("Executing Smoke: Search Test");
    }
    @Test(groups = {"regression"}, priority = 1)
    public void updateProfileTest() {
        System.out.println("Executing Regression: Update Profile Test");
    }
    @Test(groups = {"regression"}, priority = 2)
    public void logoutTest() {
        System.out.println("Executing Regression: Logout Test");
    }
}

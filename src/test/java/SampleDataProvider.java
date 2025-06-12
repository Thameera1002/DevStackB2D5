import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleDataProvider {

    @Test(dataProvider="feedData")
    public void printMyDetails(String name,int age) {
        System.out.printf("My name is %s and my age is %d . \n",name,age);
    }

    @DataProvider
    public Object[][] feedData() {
        return new Object[][]{
                new Object[]{"Sahan", 20},
                new Object[]{"Bimsara", 21},
                new Object[]{"Charith", 22},
        };
    }
}

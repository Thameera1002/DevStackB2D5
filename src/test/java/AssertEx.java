import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEx {

    @Test
    public void hardAssertion1(){
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        Assert.assertTrue(false);
        System.out.println("D");
        System.out.println("E");
        System.out.println("F");
    }
    @Test
    public void hardAssertion2(){
        String actual = "John";
        String expected = "Jane";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void softAssertion1(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        softAssert.assertTrue(false);
        System.out.println("D");
        System.out.println("E");
        System.out.println("F");
        softAssert.assertAll();
    }
    @Test
    public void softAssertion2(){
        String actual = "John";
        String expected = "Jane";
        System.out.println("Expected name is : "+expected);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actual, expected);
        System.out.println("Actual name is : "+actual);
        softAssert.assertAll();


    }
}

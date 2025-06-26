import org.testng.annotations.Test;

public class SkipTestEx {
    @Test
    public void testA(){
        System.out.println("This is testA");
    }

    @Test(enabled = false)
    public void testB(){
        System.out.println("This is testB");
    }

    @Test
    public void testC(){
        System.out.println("This is testC");
    }
}

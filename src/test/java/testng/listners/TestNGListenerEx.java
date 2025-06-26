package testng.listners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class TestNGListenerEx {
    @Test
    public void testA(){
        System.out.println("This is testA");
    }

    @Test
    public void testB(){
        Assert.fail("This is testB failed");
    }
    @Test
    public void testC(){
        System.out.println("This is testC");
    }

    @Test
    public void testD(){
        boolean test = false;
        if(!test){
            throw new SkipException("This is testD skip exception.");
        }
    }
}

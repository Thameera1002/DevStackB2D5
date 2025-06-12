import org.testng.annotations.Test;

public class PriorityEx {
    @Test(priority = 1)
    public void method1(){
        System.out.println("method1");
    }
    @Test(priority = 2)
    public void method2(){
        System.out.println("method2");
    }
    @Test(priority = 3)
    public void method3(){
        System.out.println("method3");
    }
    @Test
    public void method4(){
        System.out.println("method4");
    }
    @Test
    public void method5(){
        System.out.println("method5");
    }

    @Test(priority = -1)
    public void method6(){
        System.out.println("method6");
    }
}

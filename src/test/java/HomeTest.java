import org.testng.annotations.Test;

public class HomeTest {
    @Test
    public void makeFoundation() {
        System.out.println("Making foundation. Foundation created.");
    }

    @Test(dependsOnMethods = {"makeFoundation"})
    public void makeWalls(){
        System.out.println("Making walls. Walls created.");
    }

    @Test(dependsOnMethods = {"makeWalls"})
    public void supplyWater(){
        System.out.println("Supply water. Water supply granted.");
    }

    @Test(dependsOnMethods = {"makeWalls"})
    public void makeRoof(){
        System.out.println("Making roof. Roof created.");
    }

    @Test(dependsOnMethods = {"makeWalls", "makeRoof"})
    public void fixDoorsAndWindows(){
        System.out.println("Fixing doors and windows. Doors & windows added.");
    }

    @Test(dependsOnMethods = {"makeWalls", "makeRoof"})
    public void supplyElectricity(){
        System.out.println("Supply electricity. Electricity granted.");
    }
}

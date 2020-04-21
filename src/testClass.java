import Interface.AfterSuite;
import Interface.BeforeSuite;
import Interface.Test;

public class testClass {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite");
    }

    @Test(priority = 3)
    public void test3() {
        System.out.println("Test5");
    }

    @Test(priority = 1)
    public void test1() {
        System.out.println("Test12");
    }

    @Test(priority = 2)
    public void test2() {
        System.out.println("Test1");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite");
    }
}
import org.testng.annotations.Test;

public class TestNGGroupXML {

    @Test(groups = { "badass" })
    public void test1() {
        System.out.println("Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }

    @Test(groups = { "kickass"})
    public void test3() {
        System.out.println("Test 3");


    }
}

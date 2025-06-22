import org.testng.annotations.*;

public class TestNGBeforeAfter {

    @BeforeSuite
    public void test4() {
        System.out.println("Test 4");
    }

    @BeforeClass
    public void test5() {
        System.out.println("Test 5");
    }

    @AfterSuite
    public void test6() {
        System.out.println("Test 6");
    }

    @BeforeTest
    public void test1() {
        System.out.println("Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }

    @AfterTest
    public void test3() {
        System.out.println("Test 3");
    }
}

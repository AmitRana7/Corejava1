package ex_09_Inheritance;

public class TestCase1 extends CommonToAllTest {
    void runningTC1(){
        startBrowser();
        System.out.println("Running TC1");
        closeBrowser();
    }
}

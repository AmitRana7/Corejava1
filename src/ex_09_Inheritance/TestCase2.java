package ex_09_Inheritance;

public class TestCase2 extends CommonToAllTest {
    void runningTC2(){
        startBrowser();
        readExcelFile();
        readDatabaseFile();
        System.out.println();
        closeBrowser();
        System.out.println("Running TC2");
    }

}

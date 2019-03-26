package parallel.execution;

import org.pmw.tinylog.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//To launch in parallel use src\test\resources\xml\parallel.xml
@Listeners({LoggerListener.class, ConfigurationListener.class})
public class SimpleTest {

    @Test
    public void test1(){
        Logger.info("This is test1");
    }

    @Test()
    public void test2(){
        Logger.info("This is test2");
    }

    @Test
    public void test3(){
        Logger.info("This is test3");
    }

}

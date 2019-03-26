package method.in.group;

import org.extendng.BeforeMethodInGroups;
import org.extendng.MethodInGroupsListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static java.util.Arrays.asList;

@Listeners(MethodInGroupsListener.class)
public class SimpleTest {

    //TestNG 6 style
    /*@BeforeMethod
    public void beforeSpecial(ITestResult result){
        boolean shouldRun =
                asList(result.getMethod().getGroups()).contains("special");

        if(shouldRun)
            System.out.println("Before special");
    }*/

    //TestNG 7 style
    /*@BeforeMethod(onlyForGroups = "special")
    public void beforeSpecial(){
        System.out.println("Before special");
    }*/

    //ExtendNG style
    @BeforeMethodInGroups(groups = "special")
    public void beforeSpecial(){
        System.out.println("Before Special");
    }

    @Test
    public void test1(){
        System.out.println("Ordinary1");
    }

    @Test(groups = "special")
    public void test2(){
        System.out.println("Special1");
    }

    @Test(groups = "special")
    public void test3(){
        System.out.println("Special2");
    }

    @Test
    public void test4(){
        System.out.println("Ordinary2");
    }

}

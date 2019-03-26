package test.data.supplier;

import io.github.sskorol.core.DataSupplier;
import org.testng.annotations.Test;

import java.util.List;

import static java.util.Arrays.asList;

public class SimpleTest {

    @DataSupplier
    public List<Integer> numbers(){
        return asList(1, 3, 5, 7);
    }

    @Test(dataProvider = "numbers", dataProviderClass = SimpleTest.class)
    public void test1(Integer number) {
        System.out.println(number);
    }
}

package multiple.transformers;

import com.nordstrom.automation.testng.LinkedListener;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Transformer1 implements IAnnotationTransformer, LinkedListener {

    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        //NOP
    }
}

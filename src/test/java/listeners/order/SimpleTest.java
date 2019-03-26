package listeners.order;

import com.nordstrom.automation.testng.LinkedListeners;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners({Listener1.class, Listener2.class, Listener3.class}) // Random Order
@LinkedListeners({Listener1.class, Listener2.class, Listener3.class}) // Intended order
public class SimpleTest {

    @Test
    public void test1() {
        System.out.println("test1");
    }
}

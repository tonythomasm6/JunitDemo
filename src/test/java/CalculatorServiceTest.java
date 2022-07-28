import com.CalculatorService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorServiceTest {

    CalculatorService cal ;

    @Before
    public void setUp(){
        cal = new CalculatorService();;
    }

    @Test
    public void testMultiply(){

        assertEquals(2, cal.multiply(1,2));
    }

}

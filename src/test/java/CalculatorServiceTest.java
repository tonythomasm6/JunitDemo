import com.Calculator;
import com.CalculatorService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CalculatorServiceTest {

//    CalculatorService cal ;
    Calculator calculator;

    //If MockBean is used it will replace the existing bean in the spring context.
    @Mock
    CalculatorService calculatorService;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
//        cal = new CalculatorService();
        calculator = new Calculator(calculatorService);
    }



    @Test
    public void testWithMock(){
        when(calculatorService.multiply(2 , 3)).thenReturn(60);
        assertEquals(6, calculator.perform(2,3));
//        verify(calculatorService).multiply(2,3);

    }


//    @Test
//    public void testMultiply(){
//        assertEquals(2, cal.multiply(1,2));
//    }

}

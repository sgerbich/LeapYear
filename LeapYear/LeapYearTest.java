package LeapYear;

import org.junit.Assert;
import org.junit.Test;


public class LeapYearTest {

    
    
    @Test
    public final void checkIfItsAMultipleOf4(){
        Assert.assertTrue(LeapYear.multipleFour(1996));
    }

    

}
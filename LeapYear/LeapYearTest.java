package LeapYear;

import org.junit.Assert;
import org.junit.Test;


public class LeapYearTest {

    
    
    @Test
    public final void checkIfItsAMultipleOf4(){
        Assert.assertTrue(LeapYear.multipleFour(1996));
    }

    @Test
    public final void checkIfItsAMultipleOf400(){
        Assert.assertTrue(LeapYear.multipleFourhundred(2000));
    }

    @Test
    public final void checkIfItsAMultipleOf100(){
        Assert.assertTrue(LeapYear.multipleOnehundred(1400));
    }

    @Test
    public final void checkIfItsLeapYear(){
        Assert.assertTrue(LeapYear.isLeapYear(2000));
    }

}
package LeapYear;

public class LeapYear{


    public static boolean multipleFour(int year){
        if (year%4==0){
            return true;
        }else{
            return false;
        }

    }

    public static boolean multipleFourhundred(int year){
        if (year%400==0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean multipleOnehundred(int year){
        if (year%100==0){
            return true;
        }else{
            return false;
        }
    }

}
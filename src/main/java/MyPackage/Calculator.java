package MyPackage;

public class Calculator {

    static double summ = 0;
    static int countGuest = 0;

    public static void setCountGuest(int count){
        countGuest =  count;
    }

    public static double getSumGuest(){
        return summ/countGuest;
    }

    public static void calc(double number){
        summ = summ + number;
    }

    public  static double getSum(){
        return  summ;
    }

    public static int getCountGuest(){
        return countGuest;
    }
}

package MyPackage;

public class Formater {

    public static String getRouble(int roubles) {
        if (Math.floor(roubles)%10==1)
            return "рубль";
        else if (roubles%10==2 || roubles%10==3 || roubles%10==4)
            return "рубля";
        else
            return "рублей";
    }
}

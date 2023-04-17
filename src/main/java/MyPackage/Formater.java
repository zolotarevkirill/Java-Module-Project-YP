package MyPackage;

public class Formater {

    public static String getRouble(int roubles) {

        // определяем остаток от деления числа на 10
        int lastDigit = Math.abs(roubles) % 10;

        // определяем остаток от деления числа на 100
        int lastTwoDigits = Math.abs(roubles) % 100;

        // проверяем условия для правильного падежа слова "рубль"
        if (lastTwoDigits > 10 && lastTwoDigits < 20) {
            return "рублей";
        } else if (lastDigit == 1) {
            return "рубль";
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            return "рубля";
        } else {
            return "рублей";
        }

    }
}

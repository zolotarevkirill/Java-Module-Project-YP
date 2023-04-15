import MyPackage.Product;
import MyPackage.Calculator;
import MyPackage.Formater;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        int countGuests = 0;
        String nameProduct;
        double priceProduct;
        List <Product> cart = new ArrayList();


        for (; ;) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число человек на скольких необходимо разделить счёт:");
            try {
                countGuests = scanner.nextInt();
            }catch (Exception e){
                System.out.println("Вы ввели не число! Попробуйте снова.");
                continue;
            }
            if(countGuests > 1){
                break;
            }else{
                System.out.println("Вы ввели не число! Попробуйте снова.");
            }
        }

        Calculator.setCountGuest(countGuests);
        System.out.println("Вы ввели "+Calculator.getCountGuest()+" человек.");

        for (; ;) {
            System.out.println("Введите название товара:");
            Scanner scanner = new Scanner(System.in);
            nameProduct = scanner.next();
            if(nameProduct.equalsIgnoreCase("завершить")) {break;}

            for (; ;) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите стоимость товара:");
                try {
                    priceProduct = sc.nextDouble();
                    Product product = new Product(nameProduct, priceProduct);
                    cart.add(0, product);
                    break;
                }catch (Exception e){
                    System.out.println("Вы ввели не число! Попробуйте снова.");
                    continue;
                }
            }
        }

        //Считаем сумму всю
        System.out.println("Добавленные товары:");
        for(int i = 0; i< cart.size(); i++) {
            String name = cart.get(i).getName();
            double price = cart.get(i).getPrice();
            String productString = String.format("Товар:" + name +" Стоимость: %.2f ",price);
            System.out.println(productString + Formater.getRouble((int) price));
            Calculator.calc(price);
        }
        String allSumm  = String.format("Общая стоимость: %.2f ", Calculator.getSum());
        String allSummGuest = String.format("Итого на "+Calculator.getCountGuest()+" человек, сумма на каждого = %.2f ", Calculator.getSumGuest());
        System.out.println(allSumm + Formater.getRouble((int) Calculator.getSum()));
        System.out.println(allSummGuest + Formater.getRouble((int) Calculator.getSumGuest()));
    }
}


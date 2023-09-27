package SEM_2;

import java.util.Scanner;

public class Metod1 {

    public void metod() {
        int x = 0;
        while (x != 1) {
            System.out.println("Введите число: ");
            Scanner scan = new Scanner(System.in);
            String num = scan.nextLine();

            try {
                float number = Float.parseFloat(num);
                System.out.println("Ваше дробное число: " + number);
                x = 1;

            } catch (Exception FormatException) {
                System.out.println("Буквы вводить нельзя, попробуйте ещё раз!");
                // throw new NumberFormatException("Индекс не может быть за пределами массива!");
            }
        }
    }
}

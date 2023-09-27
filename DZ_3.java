package SEM_2;

import java.util.Scanner;

public class DZ_3 {

    public static void dz_3() {
        int x = 0;
        while (x != 1) {

            System.out.println("Введите текст:"); // на английском работает
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();

            try {
                if (str.equals("")) {
                    throw new Exception();
                }
                System.out.println("Вы ввели: " + str);
                x = 1;
            } catch (Exception e) {
                {
                    System.out.println("Строка не должна быть пустой");
                }

            }
        }
    }
}

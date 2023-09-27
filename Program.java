package SEM_2;

import java.io.FileNotFoundException;

public class Program {

    public static void main(String[] args) {
        // Metod1 z1 = new Metod1();
        // z1.metod();

        // DZ_2();

        // DZ_3();

        DZ_3 z3 = new DZ_3();
        z3.dz_3();

    }

    private static void DZ_2() {

        // Размерность массива есть и состоит он из нулей
        // Нужно заполнить массив

        int[] intArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };

        try {
            // int d = 0;
            // на 0 делить нельзя
            int d = 1;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

    private static void DZ_3() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2, 3, 4 }; // Нужно удлинить массив
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) { // Поменять общий эксепшон местами
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b)
            throws ArithmeticException {
        System.out.println(a + b);
    } // Поменять на правильный эксепшн

}

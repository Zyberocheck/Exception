package SEM_2;

public class DZ_2 {

    public void dz_2() {

        // Размерность массива есть и состоит он из нулей
        // Нужно заполнить массив

        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8};

        try {
            // int d = 0;
            // на 0 делить нельзя
            int d = 2;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }
         
    }
    
}

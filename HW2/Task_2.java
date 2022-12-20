package org.example;

/**
 * Если необходимо, исправьте данный код
 */
public class Task_2 {
    private static void divisionEighthElement(int[] intArray) {
        try {
            int d = 0;
            double caughtRes1 = intArray[8] / d;
            System.out.println("caughtRes1 = " + caughtRes1);
        } catch (NullPointerException | ArrayIndexOutOfBoundsException | ArithmeticException exception) {
            System.err.println("Catching exception: " + exception);
        }
    }
}

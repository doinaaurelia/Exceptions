package org.example;

import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
 * Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 * В этом задании не используем try catch. Пишем регулярное выражение и используем на строке метод matches.
 */
public class Task_1 {
    public static void main(String[] args) {
        System.out.println(getNumber());
    }
    private static float getNumber() {
        Scanner scanner = new Scanner(System.in);
        String number;
        while (true) {
            System.out.print("Enter float number: ");
            number = scanner.nextLine();
            if (number.matches("-?\\d*.?\\d+")) {
                return Float.parseFloat(number);
            }

            System.out.println("Entered value can't float number");
        }
    }
}

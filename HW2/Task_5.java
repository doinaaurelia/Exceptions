package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.List;

/**
 * Придумайте структуру класса.
 * Опишите класс в программе,
 * создайте json с несколькими экземплярами.
 * В программе с помощью objectMapper преобразуйте json в массив объектов.
 * implementation("com.fasterxml.jackson.core:jackson-databind:2.14.0")
 */
public class Task_5 {
    public static String json = """
            [
              {
                "x": 1,
                "y": 1
              },
              {
                "x": 2,
                "y": 2
              },
              {
                "x": 3,
                "y": 3
              }
            ]""";

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<Point> list = Arrays.asList(objectMapper.readValue(json, Point[].class));
            System.out.println(list);
        } catch (Exception exception) {
            System.err.println("In json can only be fields: x & y");
        }
    }

    public static class Point {
        public int x;
        public int y;

        public Point() {
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }
}

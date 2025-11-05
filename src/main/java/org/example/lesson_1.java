package org.example;

import java.util.Arrays;

public class lesson_1 {
    public static void main (String[] args) {
        System.out.println("Задание 1:");
        printThreeWords("Orange", "Banana", "Apple");

        System.out.println("\nЗадание 2:");
        checkSumSign(-2, 1);

        System.out.println("\nЗадание 3:");
        printColor();

        System.out.println("\nЗадание 4:");
        compareNumbers();

        System.out.println("\nЗадание 5:");
        compareSum(10, 20);

        System.out.println("\nЗадание 6:");
        signOfNum(0);

        System.out.println("\nЗадание 7:");
        booleanSignOfNum(-10);

        System.out.println("\nЗадание 8:");
        stringMultiplyNum("I love Java", 3);

        System.out.println("\nЗадание 9:");
        isYearLeap(100);

        System.out.println("\nЗадание 10:");
        changeZeroOne();

        System.out.println("\nЗадание 11:");
        hundredArr();

        System.out.println("\nЗадание 12:");
        cycleArr();

        System.out.println("\nЗадание 13:");
        squareArray();

        System.out.println("\nЗадание 14:");
        createArr(3, 0);
    }
        // 1. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple

    public static void printThreeWords(String firstWord, String secondWord, String thirdWord) {
        System.out.println(firstWord + "\n" + secondWord + "\n" + thirdWord);
    }

        // 2. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”

    public static void checkSumSign(int a, int b) {
        System.out.println((a + b) > 0 ? "Сумма положительная": "Сумма отрицательная");

        /*
        или таким способом:
        if ((a + b) > 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
         */
    }

        // 3. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением. Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”

    public static void printColor() {
        int color;
        color = 110;
        System.out.println(color <= 0 ? "Красный" : color <= 100 ? "Желтый" : "Зеленый");

        /*
        или таким способом:
        if (color <= 0) {
            System.out.println("Красный");
        } else if (color <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
         */
    }

        // 4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”

    public static void compareNumbers() {
        int a = 3;
        int b = 3;
        System.out.println(a >= b ? a + " >= " + b : a + " < " + b);
    }

        // 5. Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false

    public static void compareSum(int a, int b) {
        System.out.println((a + b) >= 10 & (a + b) <= 20);
    }

        // 6. Напишите метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом

    public static void signOfNum(int num) {
        System.out.println(num >= 0 ? "Число " + num + " - положительное" : "Число " + num + " - отрицательное");
    }

        // 7. Напишите метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное. Замечание: ноль считаем положительным числом

    public static void booleanSignOfNum(int num) {
        System.out.println(!(num >= 0));
    }

        // 8. Напишите метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз

    public static void stringMultiplyNum(String line, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(line);
        }
    }

        // 9. Напишите метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный

    public static void isYearLeap(int year) {
        System.out.println((year % 4 == 0 & year % 100 != 0) | year == 400);
    }

        // 10. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0
    public static void changeZeroOne() {
        int[] arr = {1, 1, 0, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
            arr[i] = 0;
            } else {
            arr[i] = 1;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

        // 11. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100

    public static void hundredArr() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println("[" + arr[0] + ", " + arr[1] + ", ... " + arr[98] + ", " + arr[99] + "]");
    }

        // 12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2

    public static void cycleArr() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

        // 13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n]

    public static void squareArray() {
        int[][] squareArr = new int[5][5];

        for (int i = 0; i < squareArr.length; i++) {
            for (int j = 0; j < squareArr.length; j++) {
                if (i == j | (i + j) == (squareArr.length - 1)) {
                    squareArr[i][j] = 1;
                }
                System.out.print(squareArr[i][j] + " ");
            }
            System.out.println();
        }
    }

        // 14. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue

    public static void createArr(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);

        /* или таким способом:
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        } */

        System.out.println(Arrays.toString(arr));
    }
}
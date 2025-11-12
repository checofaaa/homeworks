package org.example;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] correctArray = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        String[][] incorrectLength = {
                {"1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        String[][] incorrectValue = {
                {"1", "1", "1", "1"},
                {"1", "1", "a", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        try {
            int s = sumArray(correctArray);
            System.out.println("Сумма всех элементов массива: " + s + "\n---------");
        } catch(MyArraySizeException e) {
            System.out.println("Поймана ошибка MyArraySizeException. " + e.getMessage() + "\n---------");
        } catch(MyArrayDataException e) {
            System.out.println("Поймана ошибка MyArrayDataException. " + e.getMessage() + "\n---------");
        }

        try {
            int s = sumArray(incorrectLength);
            System.out.println("Сумма всех элементов массива: " + s + "\n---------");
        } catch(MyArraySizeException e) {
            System.out.println("Поймана ошибка MyArraySizeException. " + e.getMessage() + "\n---------");
        } catch(MyArrayDataException e) {
            System.out.println("Поймана ошибка MyArrayDataException. " + e.getMessage() + "\n---------");
        }

        try {
            int s = sumArray(incorrectValue);
            System.out.println("Сумма всех элементов массива: " + s + "\n---------");
        } catch(MyArraySizeException e) {
            System.out.println("Поймана ошибка MyArraySizeException. " + e.getMessage() + "\n---------");
        } catch(MyArrayDataException e) {
            System.out.println("Поймана ошибка MyArrayDataException. " + e.getMessage() + "\n---------");
        }

        int[] arr = {1, 2};
        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println((i + 1) + "-й элемент массива: " + arr[i]);
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймана ошибка ArrayIndexOutOfBoundsException." + e.getMessage() + "\n---------");
        }
    }

    public static int sumArray(String[][] array) throws MyArrayDataException, MyArraySizeException {
        if (array.length != 4) {
            throw new MyArraySizeException("Ожидается массив размером 4х4");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Ожидается массив размером 4х4");
            }
        }


        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                String value = array[i][j];
                try {
                    int v = Integer.parseInt(value);
                    sum += v;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]: '" + value + "'. Не удалось преобразовать в число.");
                }
            }
        }
        return sum;
    }
}

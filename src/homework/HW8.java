package homework;

import java.util.Arrays;

public class HW8 {
    static int numTask = 1;
    //******************************************* Part 1.1

    public static void taskOfNumber() {

        System.out.println("Task: " + numTask++);
    }

    //1. Написать алгоритм OddIndices, который принимает массив целых чисел, и возвращает массив значений нечетных индексов
    public static int[] oddIndices(int[] array) {
        int[] oddArray = new int[array.length / 2]; //созд массив в 2 раза меньше
        int j = 0;
        for (int i = 1; i < array.length; i += 2) {

            oddArray[j] = array[i];
            j++;
        }
        System.out.println("Принимает массив целых чисел, "
                + "и возвращает массив значений нечетных индексов: " + Arrays.toString(oddArray));
        return oddArray;
    }

    //2. Написать метод multiplуArrayByNumber(), который принимает на вход массив целых чисел и число int number.
    // Метод возвращает массив тех же чисел, умноженных на number

    public static int[] toDoubleArray(int[] array2, int number) {

        for (int i = 0; i < array2.length; i++) {

            array2[i] = array2[i] * number;
        }
        System.out.println("возвращает массив тех же чисел, умноженных на number: " + Arrays.toString(array2));
        return array2;
    }

    //3.принимает на вход массив типа double[],  и возвращает массив типа int[] из тех же чисел

    public static int[] toIntArray(double[] array3) {

        int[] arr3 = new int[array3.length];
        for (int i = 0; i < array3.length; i++) {

            arr3[i] = (int) (array3[i]);
        }
        System.out.println("Возвращает массив типа int[] из тех же чисел: " + Arrays.toString(arr3));
        return arr3;
    }

    //4.принимает на вход массив целых чисел,  и возвращает массив типа double[] из тех же чисел
    public static double[] toDoubleArray(int[] array4) {

        double[] arr4 = new double[array4.length];
        for (int i = 0; i < array4.length; i++) {

            arr4[i] = (double) array4[i];
        }
        System.out.println("возвращает массив типа double[] из тех же чисел: " + Arrays.toString(arr4));
        return arr4;
    }

    //5.принимает на вход массив целых чисел,  и возвращает массив типа String[] из тех же чисел
    public static String[] toStringArray(int[] array5) {

        String[] arr5 = new String[array5.length];
        for (int i = 0; i < array5.length; i++) {

            arr5[i] = "" + array5[i];
        }
        System.out.println("возвращает массив типа String[] из тех же чисел: " + Arrays.toString(arr5));
        return arr5;
    }

    //6.принимает на вход массив целых чисел,  и возвращает количество четных чисел в этом массиве
    public static int countEvenValuesInArray(int[] array6) {

        int count = 0;
        for (int i = 0; i < array6.length; i++) {

            if (array6[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Количество четных чисел в массиве: " + count);
        return count;
    }

    //7.принимает на вход массив целых чисел,  и возвращает количество нечетных чисел в этом массиве

    public static int countOddValuesInArray(int[] array7) {

        int count = 0;

        for (int i = 0; i < array7.length; i++) {

            if (array7[i] % 2 == 1) {

                count++;
            }
        }
        System.out.println("нечетных чисел в этом массиве: " + count);
        return count;
    }

    //8.принимает на вход массив целых чисел и число number. Возвращает значение true, если все элементы массива
    // больше number, иначе возвращает false
    public static boolean areValuesGreaterThanNumber(int[] array8, int number1) {

        int count = 0;
        for (int i = 0; i < array8.length; i++) {

            if (array8[i] > number1) {
                count++;
            }
        }
        if (count == array8.length) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }
    // ************************************ Part 2

    //9.принимает массив чисел int[]  и 2 значения индексов. Алгоритм возвращает массив, который содержит минимальное значение,
    // максимальное значение,  и среднее среди всех значений между 2-мя индексами.
    //({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
    public static int[] MinMaxAve(int[] array9, int firstIndex, int secondIndex) {

        int min = array9[firstIndex];
        int max = array9[firstIndex];
        int sum = 0;
        int count = 0;
        int avg = 0;

        for (int i = firstIndex; i <= secondIndex; i++) {

            if (array9[i] < min) {
                min = array9[i];
            }
            if (array9[i] > max) {
                max = array9[i];
            }

            sum = sum + array9[i];
            count++;
            avg = sum / count;
        }
        System.out.println("массив, который содержит минимальное значение,\n"
                + "максимальное значение,  и среднее среди всех значений между 2-мя индексами: "
                + Arrays.toString(new int[]{min, max, avg}));
        return new int[]{min, max, avg};
    }

    //10.Принимает на вход 2 массива целых чисел и возвращает массив общих элементов.
    //{1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
    //{1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
    //{1, 2, 4, 5, 89}, {8, 9, 45} → {}
    public static int[] Intersection(int[] array101, int[] array102) {

        int count = 0;

        for (int i = 0; i < array101.length; i++) {

            for (int j = 0; j < array102.length; j++) {

                if (array101[i] == array102[j]) {
                    count++;
                }
            }
        }

        if (count == 0) {
            System.out.println(Arrays.toString(new int[]{}));
            return new int[]{};
        } else {
            int[] arr10 = new int[count];
            count = 0;

            for (int i = 0; i < array101.length; i++) {

                for (int j = 0; j < array102.length; j++) {

                    if (array101[i] == array102[j]) {
                        arr10[count] = array101[i];
                        count++;
                    }
                }
            }
            System.out.println("Массив общих элементов: " + Arrays.toString(arr10));
            return arr10;
        }
    }
    //11.принимает на вход массив целых чисел, и возвращает “перевернутый” массив. {2, 7, 3, 10} → {10, 3, 7, 2}
    public static int[] ReverseArray (int[] array11) {

        int[] arr11 = new int[array11.length];
        for (int i = 0; i < array11.length; i++) {

            arr11[i] = array11[array11.length-1-i];
        }
        System.out.println("Возвращает “перевернутый” массив: " + Arrays.toString(arr11));
        return arr11;
    }
    //12.принимает на вход массив целых чисел и возвращает значения пиковых элементов (элементы, которые больше своих соседей).
    //{3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
    public static int[] PeakElement(int[] array12) {

        int count = 0;

        if (array12[0] > array12[1]) {
            count++;
        }
        for (int i = 1; i < array12.length - 1; i++) {
            if ((array12[i] > array12[i - 1]) && (array12[i] > array12[i + 1])) {
                count++;
            }
        }
        if (array12[array12.length - 1] > array12[array12.length - 2]) {
            count++;
        }
        System.out.println(count);
        int[] arr12 = new int[count];
        count = 0;
        if (array12[0] > array12[1]) {
            arr12[0] = array12[0];
            count++;
        }
        for (int i = 1; i < array12.length - 1; i++) {
            if ((array12[i] > array12[i - 1]) && (array12[i] > array12[i + 1])) {
                arr12[count] = array12[i];
                count++;
            }
        }
        if (array12[array12.length - 1] > array12[array12.length - 2]) {
            arr12[count] = array12[array12.length - 1];
        }

        System.out.println(Arrays.toString(arr12));
        return arr12;
    }

    //13.Написать алгоритм SortArray, который принимает на вход массив целых чисел, и сортирует элементы массива в порядке возрастания.
    //{4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}
    public static int[] SortArray (int[] array13) {

        for (int j = 0; ; ) { // запускаем бесконечный цикл

            int buf = 0;
            int count = 0;
            for (int i = 0; i < array13.length - 1; i++) {

                if (array13[i] > array13[i + 1]) {

                    buf = array13[i];
                    array13[i] = array13[i + 1];
                    array13[i + 1] = buf;
                    count++; //считает количество замен
                }
            }
            if (count ==0) { // когда замен уже нет - выходит избесконечного цикла
                break;
            }

        }
        System.out.println("Сортирует элементы массива в порядке возрастания: " + Arrays.toString(array13));
        return array13;
    }
    //14.принимает на вход массив целых чисел и число k, и возвращает k-тый максимальный элемент.
    //({4, 3, 7, 13, 5, 2, 9, 4, 12}, 3) → 9
    // (13 и 12 - первый и второй самые большие элементы, а метод возвращает 9, как третий самый большой элемент)
    public static int kthLargest (int[] array14, int k) {

          for(int j = 0; ; ) {
              int count = 0;
              int buf1 = 0;
              for (int i = 0;  i < array14.length-1; i++) {

                  if (array14[i] < array14[i+1]) {
                      buf1 = array14[i];
                      array14[i] = array14[i+1];
                      array14[i+1] = buf1;
                      count++;
                  }
              }
              if (count ==0) {
                  break;
              }
          }
        System.out.println(Arrays.toString(array14));
        System.out.println("возвращает k-тый максимальный элемент: " + array14[k-1]);
        return array14[k-1];
    }
    //15.принимает на вход массив целых чисел, и возвращает массив,  в котором все негативные числа находятся во второй
    // половине массива (массив не должен быть отсортирован)
    //{4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}
    public static int[] negativeOnTheRight (int[] array15) {

        for(int j = 0; ; ) {
            int count = 0;
            int buf2 = 0;
            for (int i = 0;  i < array15.length-1; i++) {

                if (array15[i] < 0 && array15[i+1] > 0) {
                    buf2 = array15[i];
                    array15[i] = array15[i+1];
                    array15[i+1] = buf2;
                    count++;
                }
            }
            if (count ==0) {
                break;
            }
        }
        System.out.println(Arrays.toString(array15));
        System.out.println("возвращает массив,  в котором все негативные числа находятся во второй\n"
                + "половине массива: " + Arrays.toString(array15));
        return array15;
    }
    //16.принимает на вход строку чисел (н-р, “3 4 1 8 10 12.3”) и возвращает массив типа int[] из этих чисел.
    // (Можно использовать split() или toCharArray())

    public static void createIntArrayFromText(String abc) {

        char[] arr16 = abc.toCharArray();
        System.out.println(Arrays.toString(arr16));
       // return (int)arr16;
    }

    public static void main(String[] args) {
    // Task 1
        taskOfNumber ();
        int[] array = {-45, 590, 234, 985, 12, 68};
        oddIndices(array);
    // Task 2
        taskOfNumber ();
        int[] array2 = {25, 2, 3, 4, 5, 6};
        int number = 2;
        toDoubleArray(array2, number);
    // Task 3
        taskOfNumber ();
        double[] array3 = {1.1, 2.5, 3.7, 4.0, 5.5};
        toIntArray(array3);
    // Task 4
        taskOfNumber ();
        int[] array4 = {1, 2, 3, 4, 5};
        toDoubleArray(array4);
    // Task 5
        taskOfNumber ();
        int[] array5 = {1, 2, 3, 4, 5};
        toStringArray(array5);
    // Task 6
        taskOfNumber ();
        int[] array6 = {1, 2, 3, 4, 5, 2, 3, 4, 5};
        countEvenValuesInArray(array6);
    // Task 7
        taskOfNumber ();
        int[] array7 = {1, 2, 3, 4, 5, 2, 3, 4, 5};
        countOddValuesInArray(array7);
    // Task 8
        taskOfNumber ();
        int[] array8 = {1, 2, 3, 4, 5, 2, 3, 4, 5};
        int number1 =2;
        areValuesGreaterThanNumber(array8, number1);
    // Task 9
        taskOfNumber ();
        int[] array9 = {1, 2, 3, 4, 5, 6, 7, 8};
        int firstIndex = 2;
        int secondIndex = 6;
        MinMaxAve(array9, firstIndex, secondIndex);
    // Task 10
        taskOfNumber ();
//        int[] array101 = {1, 2, 4, 5, 89};
//        int[] array102 = {8, 9, 4, 2};
//        Intersection (array101, array102);
        int[] array101 = {1, 2, 4, 5, 81, 91};
        int[] array102 = {8, 9, -4, -2};
        Intersection (array101, array102);
    // Task 11
        taskOfNumber ();
        int[] array11 = {1, 2, 3, 4, 5, 2, 3, 4, 5};
        ReverseArray(array11);
    // Task 12
        taskOfNumber ();
        int[] array12 = {3, 2, 7, 5, 1, 9, 23, 1};
        PeakElement(array12);
    // Task 13
        taskOfNumber ();
        int[] array13 = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        SortArray(array13);
    // Task 14
        taskOfNumber ();
        int[] array14 = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 3;
        kthLargest(array14, k);
    // Task 15
        taskOfNumber ();
        int[] array15 = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        negativeOnTheRight(array15);
    // Task 16
        taskOfNumber ();
        String abc = "3 4 1 8 10 12.3";
        createIntArrayFromText(abc);
    }
}


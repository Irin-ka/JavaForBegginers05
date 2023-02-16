package homework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HW7 {
   static int numTask = 3;
 public static void numOfTask () {
     System.out.println("*********** Task " + numTask++ + "*************");

 }
//        21. Написать метод, который создает и печатает массив четных положительных чисел, значения которых не больше 6.
//        Заполняем значения и печатаем с помощью цикла for. Длина массива - l.
 public static void printArray (int l) {
     int[] arr2 = new int[l];
     if (l > 0) {
         for (int i = 0; i < l;){
             int number =(int)(Math.random() * (6 + 1));
             if (number % 2 == 0) {
                 arr2[i] = number;
                 i++;
             }
         }
         System.out.println(Arrays.toString(arr2));
     }
 }

// }

//        22. Написать метод, который принимает на вход массив int, и печатает  среднее значение всех элементов массива.
//        Проверить работу метода, если параметр на вход - массив catsAges
 public static void createArr (int[] arr1) {
     int sum = 0;
     for (int i = 0; i < arr1.length; i++) {
         sum += arr1[i];
     }
     System.out.println("Среднее значение всех элементов массива: " + sum / arr1.length);
 }

//        23. Создать массив всех нечетных отрицательных чисел в промежутке от (-1000 до -900).


//        24. Создать массив из 10 случайных положительных целых чисел в промежутке от 100 до 200 включительно.


//        25.Написать метод, который принимает на вход массив int[] array и число int number.
//        Метод проверяет, содержится ли число number в массиве array.
//        При первом нахождении числа number, метод печатает “yes”.
//        При каждом нахождении чисел на 1 больше числа number,  или на 1 меньше числа number, метод печатает “maybe”.
//        Метод печатает “no”, если не находит ни одного числа, соответствующего условиям.
public static void includeNumber(int[] arr25, int number) {
    int count = 0;
    for (int i = 0; i < arr25.length; i++) {
        if (arr25[i] == number) {
            count++;
        }
    }
    System.out.println(count);

    if (count == 1) {
        System.out.println("yes");
    } else if ((count - number == 1) || (count - number == -1)) {
        System.out.println("maybe");
    } else {
        System.out.println("no");
    }
}
//    26.Создать массив четных чисел и массив нечетных чисел из элементов массива из задания 24.


//    27.Создать двумерный массив, который состоит из имен, возрастов, цветов котов:
//    Распечатать все данные котов в коробках с четными индексами, используя двумерный массив.

//    28.Создать двумерный массив целых случайных чисел от 1 до 10 включительно, размерность массива 4*8.

//    29.Вывести сумму всех четных чисел массива из задания 28.




    public static void main(String[] args) {

        //    PART 1
//    3. Создать массив catsNames[], заполнить его любыми своими значениями (не такими, как были на уроке).
      String[] catsNames = new String[]{"Пыжик", "Черныш", "Мурка", "Васька", "Рыжик", "Снежок", "Бантик", "Эш"};
      numOfTask();
        System.out.println(Arrays.toString(catsNames));

//    4. В массиве catsNames[] изменить значение элемента с индексом 4 на “Рыжик”,  а значение элемента с индексом 1 на “Черныш”.
        for (int i = 0; i < catsNames.length; i++) {
            if (i ==4) {
                catsNames[4] = "Рыжик2";
            } else if (i == 1) {
                catsNames[1] = "Черныш2";
            }
        }
        numOfTask();
        System.out.println(Arrays.toString(catsNames));

//    5. Создать массив catsColors[] и заполнить его значениями (см картинку в презентации).
        String[] catsColors = new String[] {"Grey", "Black", "Grey", "Brown", "Red","Grey","Red","Grey"};
        numOfTask();
        System.out.println(Arrays.toString(catsColors));

//    6. Создать массив catsAges[] и заполнить его любыми целочисленными валидными значениями.
        int[] catsAges = new int[]{5, 7, 2, 0, 1, 6, 9, 4};
        numOfTask();
        System.out.println(Arrays.toString(catsAges));

//    7. Создать массив isCatRed[] и заполнить его соответствующими значениями (см картинку в презентации. Red = рыжий)
        boolean[] isCatRed = new boolean[]{false, false, false, false, true, false, true, false};
        numOfTask();
        System.out.println(Arrays.toString(isCatRed));

////  8.Распечатать для массивов catsNames[] и catsColors[]:
        numOfTask();
//    имя кота в коробке с номером 6
        for (int i = 6; i< catsNames.length-1; i++) {

            System.out.println("в коробке с номером 6: " + catsNames[6]);
        }
        System.out.print("Имена котов из коробок с четными индексами: ");

//    имена котов из коробок с четными индексами
        for (int i = 0; i< catsNames.length; i++) {

            if (i % 2 ==0){

                System.out.print( catsNames[i] + " ");
            }
        }
//    имена котов из коробок, чьи индексы кратны 4
        System.out.println();
        System.out.print("Имена котов из коробок, чьи индексы кратны 4: ");
        for (int i = 0; i< catsNames.length; i++) {

            if (i % 4 ==0){

                System.out.print( catsNames[i] + " ");
            }
        }
//    цвет котов из коробок с нечетными индексами
        System.out.println();
        System.out.print("цвет котов из коробок с нечетными индексами: ");
        for (int i = 0; i< catsColors.length; i++) {

            if (i % 2 !=0){

                System.out.print( catsColors[i] + " ");
            }
        }
//    цвет котов из коробок, чьи индексы кратны 3, но не кратны 2
        System.out.println();
        System.out.print("цвет котов из коробок, чьи индексы кратны 3, но не кратны 2: ");
        for (int i = 0; i< catsColors.length; i++) {

            if (i % 2 !=0 && i % 3 ==0){

                System.out.print( catsColors[i] + " ");
            }
        }
//    9.Распечатать “Накорми кота!” для всех серых котов
        System.out.println();
        numOfTask();
        for (int i = 0; i< catsColors.length; i++) {

            if (catsColors[i].equals("Grey")){

                System.out.println(i + " - " + catsColors[i] + " Накорми кота!");
            }
        }
//    10.Распечатать “Дай коту воды!” для всех котов со значениями true из массива isCatRed[]
        System.out.println();
        numOfTask();
        for (int i = 0; i < isCatRed.length; i++) {
            if (isCatRed[i]) {
                System.out.println(i + " - Дай коту воды");
            }
        }
//    11.Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
        System.out.println();
        numOfTask();
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < 2) {
                System.out.println(i + " - Отнеси кота на прививку!");
            }
        }
//    12.Для кота в последней коробке распечатать имя, цвет, возраст
        System.out.println();
        numOfTask();
        int ll = catsNames.length -1;
        if ((catsNames.length == catsColors.length) && (catsColors.length == catsAges.length)) {
            System.out.print("Имя: " + catsNames[ll] + ", цвет: " + catsColors[ll] + ", возраст: " + catsAges[ll]);
        }
//    13.Распечатать имя, цвет, возраст котов в двух серединных коробках
        System.out.println();
        numOfTask();
        if ((catsNames.length == catsColors.length) && (catsColors.length == catsAges.length)) {
            System.out.println("3-я коробка - Имя: " + catsNames[catsNames.length / 2 - 1] + ", цвет: " +
                    catsColors[catsColors.length / 2 - 1] + ", возраст: " + catsAges[catsAges.length / 2 - 1]);
            System.out.println("4-я коробка - Имя: " + catsNames[catsNames.length / 2] + ", цвет: " +
                    catsColors[catsColors.length / 2] + ", возраст: " + catsAges[catsAges.length / 2]);
        }
//    14.Распечатать имена всех котов, чей возраст больше 2 лет
        numOfTask();
        if (catsAges.length == catsNames.length) {
            for (int i = 0; i < catsAges.length; i++) {
                if (catsAges[i] > 2) {
                    System.out.print(catsNames[i] + " ");
                }
            }
        }
//    15.Распечатать “Накорми … !” , где … - имя кота, а значение isCatRed == true
        System.out.println();
        numOfTask();
        if (isCatRed.length == catsNames.length) {
            for (int i = 0; i < isCatRed.length; i++) {
                if (isCatRed[i]) {
                    System.out.println("Накорми " + catsNames[i] + "a!");
                }
            }
        }
//    16.Распечатать средний возраст котов из массива catsAges[]
        numOfTask();
        int sum = 0;
        for (int i = 0; i < catsAges.length; i++) {
            sum = sum + catsAges[i];
        }
        int avg = sum / catsAges.length;
        System.out.println("Средний возраст котов: " + avg + " лет.");

//    17.Распечатать возраст самого молодого кота
        numOfTask();
        int young = catsAges[0];
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < young) {
                young = catsAges[i];
            }
        }
        System.out.print("Самому молодому коту " + young + " лет");

//    18.Распечатать возраст самого старого кота
        System.out.println();
        numOfTask();
        int old = catsAges[0];
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] > old) {
                old = catsAges[i];
            }
        }
        System.out.print("Самому старому коту " + old + " лет");

//    19.Распечатать количество серых котов и количество рыжих котов
        System.out.println();
        numOfTask();
        int countGrey = 0;
        int countRed = 0;
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Grey")) {
                countGrey++;
            } else if (catsColors[i].equals("Red")) {
                countRed++;
            }
        }
        System.out.print("Серых котов: " + countGrey + ", рыжих котов: " + countRed);

//    20.Распечатать имя кота, если кот находится в коробке с нечетным индексом и его возраст не больше 2 лет
        System.out.println();
        numOfTask();
        if (catsAges.length == catsNames.length) {
            for (int i = 1; i < catsAges.length; i+=2) {
                if (catsAges[i] <= 2) {
                    System.out.println("Имя кота, возраст которого не более 2 лет и коробка с нечетным индексом: "
                            + catsNames[i]);
                }
            }
        }
//Part 2
//        21. Написать метод, который создает и печатает массив четных положительных чисел, значения которых не больше 6.
//        Заполняем значения и печатаем с помощью цикла for. Длина массива - l.
        System.out.println();
        numOfTask();
        printArray(8);

//        22. Написать метод, который принимает на вход массив int, и печатает  среднее значение всех элементов массива.
//        Проверить работу метода, если параметр на вход - массив catsAges
        System.out.println();
        numOfTask();
        int[] arr1 = {1, 2, 3, 6, 5, 2, 7, 1};
        createArr(arr1);
        createArr(catsAges);

//        23. Создать массив всех нечетных отрицательных чисел в промежутке от (-1000 до -900).
        System.out.println();
        numOfTask();
        int count = 0;
        for (int i = -1000; i <= -900; i++) {
            if (i % 2 !=0) {
                count++;
            }
        }
        int[] arr23;
        arr23 = new int[count];
        int a = 0;
        for (int i = -1000; i <= -900; i++) {
            if (i % 2 !=0) {
                arr23[a] = i;
                a++;
            }
        }
        System.out.println(Arrays.toString(arr23));


//        24. Создать массив из 10 случайных положительных целых чисел в промежутке от 100 до 200 включительно.
        System.out.println();
        numOfTask();


            int[] arr24 = new int[10];
            int b = 0;
            int l = 10;
            int k = 0;
            for (int i = 0; i < l; l--) {
             k = (int)((Math.random()*(200-100+1) +100));
                    arr24[b] = k;
                    b++;
            }
            // упрощенный вариант цикла:
        // for (int i = 0; i < l; l--) {
        // arr24[i]  = (int)(Math.random()*101 +100);
        // }
        System.out.println(Arrays.toString(arr24));
        System.out.println("K: " + k);

//        25.Написать метод, который принимает на вход массив int[] array и число int number.
//        Метод проверяет, содержится ли число number в массиве array.
//        При первом нахождении числа number, метод печатает “yes”.
//        При каждом нахождении чисел на 1 больше числа number,  или на 1 меньше числа number, метод печатает “maybe”.
//        Метод печатает “no”, если не находит ни одного числа, соответствующего условиям.
        System.out.println();
        numOfTask();
        int[] arr25 = {2, 4, 8, 9, 4, 7, 7, 1, 0, 2, 7};
        includeNumber(arr25, 5);

//    26.Создать массив четных чисел и массив нечетных чисел из элементов массива из задания 24.
        System.out.println();
        numOfTask();
        int chetn = 0;
        int nechetn = 0;
        int f = 0;
        int d = 0;

        for (int i = 0; i < arr24.length; i++) {
            if (arr24[i] % 2 == 0) {
                chetn++;
            } else {
                nechetn++;
            }
        }
        int[] arr261 = new int[chetn];
        int[] arr262 = new int[nechetn];
        for (int i = 0; i < arr24.length; i++) {
            if (arr24[i] % 2 == 0) {
                arr261[f] = arr24[i];
                f++;
            } else {
                arr262[d] = arr24[i];
               d++;
            }
        }
        System.out.println(Arrays.toString(arr24));
        System.out.println("Массив четных чисел: " + Arrays.toString(arr261));
        System.out.println("Массив нечетных чисел: " + Arrays.toString(arr262));

//    27.Создать двумерный массив, который состоит из имен, возрастов, цветов котов:
//    Распечатать все данные котов в коробках с четными индексами, используя двумерный массив.
        System.out.println();
        numOfTask();

        String[][] arrOfCats = {{"Мурзик", "Черныш", "Мурка", "Васька", "Рыжик","Дымка","Патрик","Зорро"},
        {"2", "3", "4", "1", "5","6","9","10"}, {"Grey", "Black", "Grey", "Brown", "Red","Grey","Red","Grey"}};

        // вывести список элементов двумерного массива на экран — deepToString
        System.out.println(Arrays.deepToString(arrOfCats));

        for(int i =0; i < arrOfCats.length; i++) {
            for (int j = 0; j < arrOfCats.length; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.println(arrOfCats[i][j]);
                }
            }
        }
        for(int i =0; i < arrOfCats.length; i++) {
            for (int j = 0; j < arrOfCats.length; j++) {
                if ((i) % 2 == 0) {
                    System.out.println(arrOfCats[i][j]);
                }
            }
        }

//    28.Создать двумерный массив целых случайных чисел от 1 до 10 включительно, размерность массива 4*8.
        System.out.println();
        numOfTask();
        int[][] arr28 = new int[4][8];
        int start = 1;
        int end = 10;
        int range = (end + 1 - start);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                arr28[i][j] = (int) (Math.random() * range) + start;

            }
        }
        System.out.println(Arrays.deepToString(arr28));


//    29.Вывести сумму всех четных чисел массива из задания 28.
        System.out.println();
        numOfTask();
        int sum29 = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                if (arr28[i][j] % 2 ==0) {
                    sum29 += arr28[i][j];
                    System.out.print(arr28[i][j] + "\t");
                }
            }
        }
        System.out.println("Cумма всех четных чисел массива: " + sum29 );
    }
}

package homework;

import static homework.HW5.numberTask;

public class HW6 {

    static int numberOfTask = 1;

    public static void numberOfTask() {
        System.out.println("------------ Task " + numberOfTask++ + "-------------");
    }
    public static void line() {
        System.out.println("_________________________");
    }

    public static void doubleSequence(double start, double end, double step) {
        if (step != 0) {
            if (end > start) {
                for (double i = start; i <= end; i += step) {
                    i = Math.ceil(i*100) / 100;
                    System.out.print(i + " ");
                }
            } else {

                for (double i = start; i >= end; i -= step) {
                    i = Math.ceil(i*100) / 100;
                    System.out.print(i + " ");
                }

            }
        } else {
            System.out.print("Шаг равен 0");
        }
    }
    public static void letterSequence (char x, char y) {
        if ((x >= 97 && x <= 122) && (y >= 97 && y <= 122) || (x >= 65 && x <= 90) && (y >= 65 && y <= 90)) {
            if (y >= x) {
                for (char i = x; i <= y; i++) {
                    System.out.print(i);
                }
            } else if (x >= y) {
                for (char i = x; i >= y; i--) {
                    System.out.print(i + " ");
                }
            }
        }else {
            System.out.print("Error");
        }
        System.out.println();
    }
//PART 2
    //************12*********
//    Написать метод, который принимает параметр l и печатает  последовательность четных
//    чисел от нуля. Длина последовательности = l.

public static void task12Equals (int l) {
        if (l >0) {
            for (int i = 0; l > 0; i += 2) {

                    System.out.print(i + " ");
                    l--;
            }
        }
}
 //**************13************
// Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно
 public static void task13Equals (int n) {

     for (int i=1; i <= n; i++) {

             System.out.println((int) Math.pow (2, i));
     }
 }

    //************* 14 *************
//    Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.
    public static void task14Equals () {

        for (int i=0; i < 5; i++) {

        for (int j = 0; j < 10; j++) {
            if (i==1) {
                System.out.print(j);
            } else if (i == 2) {
                System.out.print(j + "" + j);
            }  else if (i == 3) {
                System.out.print(j + "" + j+ "" + j );
            }else if (i == 4) {
                System.out.print(j + "" + j+ "" + j + "" + j);
            }
        }
        }
        System.out.println();
    }

    //*************** 15 ************
//    Написать метод, который генерирует  последовательность чисел:
//            0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
//    Метод формирует строку из сгенерированных значений, и выводит результат единожды на печать.
//    ПРотестировать этот метод.

    public static String task15Equals () {
    String st = "0, ";
        for (int i=1; i <= 5; i++) {
            if (i <5 ) {
          st = st + i + ", ";
          st = st + "-"+ i + ", ";
       } else if (i == 5) {
               st = st + i + ", ";
               st = st + "-" +i;
            }
        }
        return st;
    }

    // ************* 16 *************
//    Распечатать последовательность чисел:
//    0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25

//    public static void task16Equals () {
//
//        for (int i=0; i <= 25; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                if (i % 3 == 0) {
//                    System.out.println(i + ", ");
//                }
//            }
//        }
//    }


// PART 3
 // ******************* 17 ***************
//Написать метод, который принимает параметры n, m,l, и печатает
// последовательность нечетных чисел,  начиная с числа n, с шагом m,  длина последовательности  l.

    public static void task17Equals(int n, int m, int l) {
        if (l > 0) {
            for (int i = n; l > 0; i = i + m, l--) {
                  if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
    // ******************* 18 ***************
//    Написать метод, который принимает на вход параметры n, m, l и
//    генерирует последовательность случайных целых чисел в промежутке от n до m  включительно.
//    Длина последовательности - l. Вывести результат на печать

    public static void task18Equals(int n, int m, int l) {
        if (l > 0) {
            for (int i = n; l >0 ; l--) {
                 i = (int) ((Math.random() * (m - n + 1) + n));
                System.out.print(i + " ");
            }
            System.out.println();
    }
    }
    // ******************* 19 ***************
//    Сгенерируйте и распечатайте последовательность чисел,
//    где для каждого положительного или отрицательного значения n
//    выводится на печать значение, рассчитанное по формуле:

//   Для n = 0 и невалидных ситуаций  выводится значение 0

public static void task19Equals (int n, int l) {
    if (n > 1) {
        for (int i = n; l > 0; i++, l--) {
            double y = Math.ceil((Math.pow(i, 2) + 1) / (2 * n - 1) * 100) / 100;
            System.out.println(y);
        }
    }
}
    // ******************* 20 ***************
//    Написать метод, который принимает параметры l, n, и печатает последовательность чисел по формуле
//    Длина последовательности l.
public static void task20Equals (int n) {
      int  x1 = 1;
      int x2 = 2;
      int xn;
    System.out.print(x1 + ", " + x2 + ", ");
    if (n >= 3) {
        for (int i = 3; i <= n; i++) {
            xn = (2 * x2 + x1);
            System.out.print(xn + ", ");
            x1 = x2;
            x2 = xn;
        }
    }
    else {
        System.out.println(" n должно быть 3 и больше");
    }
    System.out.println();
}

    // ******************* 21 ***************
//    Сгенерируйте последовательность целых положительных  двузначных чисел,
//    в которых разница между первой цифрой (десятки) и второй цифрой (единицы) не превышает 3.
    public static void task21Equals(int n, int m, int l) {
        if (l > 0) {
            for (int i = n; l > 0; l--) {
                int k = (int) ((Math.random() * (m - n + 1) + n));
                if (((k / 10) - (k % 10) <= 3) && ((k / 10) - (k % 10) >= -3)) {
                    System.out.println(k);
                } else {
                    System.out.println(k + " херня");
                }
            }
        }
    }


    // ******************* 22 ***************
   // Написать метод, который вычислит значение функции:
  public static void task22Equals(int x) {
        if (x > 1.5) {
            System.out.println("y =  " + (2.5 * Math.pow(x, 3) + 6 * Math.pow(x, 2) - 30));
           
        } else if (x >=0 && x <= 1.5) {

            System.out.println("y =  " + (x + 1));
        } else if (x < 0) {
            System.out.println("y =  " + x);
        }
  }

    // ******************* 23 ***************
//    Написать метод, который генерирует последовательность простых положительных чисел и
//    выводит последовательность на печать
//
    public static void task23Equals(int x) {

        for (int i = 2; i <= x; i++) {

            int count;
            count = 0;

            for (int j = 2; j <= 100; j++) {
                if (i % j == 0 && i != j) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(i + " ");
            }
        }

    }
    // ******************* 24 ***************
//    Написать метод, который принимает на вход параметры day = “Sun”, month = 10, date = 2,
//    и выводит на печать  последовательность:
//    public static void task24Equals(int n, int m, int l) {
//        if (l > 0) {
//            for (int i = n; l > 0; l--) {
//                int k = (int) ((Math.random() * (m - n + 1) + n));
//                if ( k % ) {
//                    System.out.println(k);
//                }
//            }
//        }
//    }

    public static void main(String[] args) {

//********************Task 1*********
        numberOfTask();
        for (int i = 0; i <= 9; i++) {
            System.out.println(i);
        }
//********************Task 2*********
        numberOfTask();
        for (int i = 9; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
//********************Task 3*********
        numberOfTask();
        for (int i = 50; i <= 55; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        //********************Task 4*********
        numberOfTask();
        for (int i = 327; i >= 300; i--) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        /*
        int begin = 327-1;
        int end = 300+1;
        int start = begin - (begin % 7);
        for  (int i = start; i >= end; i -=7)
        */
        System.out.println();
        //******************* Task 5*********
        numberOfTask();
        for (double i = 12; i <= 13; i += 0.1) {
            i = Math.round(i * 100) / 100.0; // при делении ровно на 100 зацикливает на 12.0
            //   i = Math.сeil(i * 100) / 100;
            System.out.print(i + " ");
        }
        System.out.println();
        //********************Task 6 *********
        numberOfTask();
        int number1 = 215;
        int number2 = 237;
        int start = number1 + number1 % 2;
        for (int i = start; i <= number2; i += 2) {
            System.out.println(i);
        }
        System.out.println();
        //********************Task 7 *********
        numberOfTask();
        for (int i = 8; i < 14; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
        //********************Task 8 *********
        numberOfTask();
//        for (int i = -32768; i <=32767 ; i++) {
//            if (i % 15001 == 0) {
//                System.out.println(i);
//            }
//        }
        int a = Short.MIN_VALUE;
        int b = Short.MAX_VALUE;
        int c = a % 15001;
        int d = a - c;
        for (int i = d; i <= b; i += 15001) {
            System.out.println(i + " ");
        }
        System.out.println();
        //********************Task 9 *********
        numberOfTask();
        for (int i = -10; i <= 34; i++) {
            if (i == 0) {
                System.out.print("Zero");
            } else {
                if (i % 11 == 0 && i != 0) {
                    System.out.print("\u001B[34m" + i + "\u001B[0m");
                } else if (i % 12 == 0 && i != 0) {
                    System.out.print("\u001B[31m" + i + "\u001B[0m");
                } else {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
        //********************Task 10 *********
        numberOfTask();
        doubleSequence(5, 6.5, 0.2);
        doubleSequence(5, 55, 0);

        //********************Task 11 *********
        numberOfTask();
        letterSequence('a', 'd');
        line();
        letterSequence('z', 'd');
        line();
        letterSequence('!', 'd');
        line();
        letterSequence('F', 'P');

        System.out.println();
        //********************Task 12 *********
        numberOfTask();
        task12Equals(5);
        System.out.println();
        //********************Task 13 *********
        numberOfTask();
        task13Equals(3);
        //********************Task 14 *********
        numberOfTask();
        task14Equals();
        //********************Task 15 *********
        numberOfTask();
        String strk = task15Equals();
        System.out.println(strk);

        //********************Task 16 *********
        numberOfTask();
        for (int i = 0; i <= 25; i++) {
            if (i == 25) {
                System.out.println(i);
            } else if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
        //********************Task 17 *********
        numberOfTask();
        task17Equals(-11, 2, 10);
        System.out.println();
        //********************Task 18 *********
        numberOfTask();
        task18Equals(2, 200, 15);
        //********************Task 19 *********
        numberOfTask();
        task19Equals(2,10);
        //********************Task 20 *********
        numberOfTask();
        task20Equals(5);
        //********************Task 21 *********
        numberOfTask();
        task21Equals(10, 100, 6);

        //********************Task 22 *********
        numberOfTask();
        task22Equals(5);
        //********************Task 23 *********
        numberOfTask();
        task23Equals(200);
        System.out.println();
        //********************Task 24 *********
        numberOfTask();

    }
}




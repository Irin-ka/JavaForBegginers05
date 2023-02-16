package homework;

import java.sql.SQLOutput;

public class HW3 {
    public static void main(String[] args) {

        int taskNumber = 2;
        String line = "____________________________________________________";
/*
Создать переменные a и b типа byte, присвоить им значения из допустимого диапазона.
 */
        System.out.println(line);
        System.out.println("Task " + taskNumber++);
        byte a = 13;
        byte b = -52;
        System.out.println(a);
        System.out.println(b);
        System.out.println();
  /*
Создать переменные s и t типа short, присвоить им значения с разницей 60000
 */
        System.out.println(line);
        System.out.println("Task " + taskNumber++);
        short s = -30000;
        short t = 30000;
        System.out.println(s);
        System.out.println(t);
        System.out.println(t-s);
        System.out.println();
     /*
Создать переменную i типа int и присвоить ей минимально возможное значение этого типа.
Затем присвоить максимально возможное значение этого типа.
Распечатать оба значения в виде таблицы:
 */
        System.out.println(line);
        System.out.println("Task " + taskNumber++);

        int i;
        i= - 2147483648;
        System.out.println(line);
        System.out.println("| " + "int min              | " + i + "               |" );
        System.out.println(line);
        i = 2147483647;
        System.out.println("| " + "int max              |  " + i + "               |" );
        System.out.println(line);
        System.out.println();

/*
5.Создать переменную phoneNumber и присвоить ей значение номера телефона
с кодом страны и города (можно ненастоящий номер телефона, например, 18009998877)
 */
        System.out.println(line);
        System.out.println("Task " + taskNumber++);
         long phoneNumber = 375447214507L;
        System.out.println(phoneNumber);
        System.out.println();

/*
6.Создать переменную f типа float и присвоить ей значение 100.101101.
Создать переменную d типа double и присвоить ей значение 100.101101.
Распечатать результат в виде таблицы:
 */
        System.out.println(line);
        System.out.println("Task " + taskNumber++);

        float f = 100.101101F;
        double d = 100.101101;
        System.out.println(line);
        System.out.println("| " + "float f = 100.101101            | " + f + "     |" );
        System.out.println(line);
        System.out.println("| " + "double d = 100.101101           | " + d + "     |" );
        System.out.println(line);
        System.out.println();

/*
7.Создать переменную типа Double с именем dd  и инициализировать её результатом
суммы чисел 10.09999 и 20.099999.
Создать переменную типа Float с именем ff  и инициализировать её результатом
суммы чисел 10.09999 и 20.099999.
Распечатать результаты.
 */
        {
            System.out.println(line);
            System.out.println("Task " + taskNumber++);
            Double dd;
            dd = 10.09999 + 20.099999;
            Float ff;
            ff = 10.09999F + 20.099999F;
            System.out.println(dd);
            System.out.println(ff);
            System.out.println();
        }
/*
8.Создать переменную float ff и присвоить ей значение выражения 10 / 3.
Создать переменную double dd и присвоить ей значение выражения 10 / 3.
Добиться максимальной точности значений вычислений и распечатать результаты.
 */
        System.out.println(line);
        System.out.println("Task " + taskNumber++);

        //ff = F;
        double dr = 10/3;
       // dd = Double.valueOf(10/3);
      //  ff = Float.valueOf(10/3);
        float ff = 10F/3;
        double dd = 10/(double)3;
        System.out.println(dr);
        System.out.println(dd);
        System.out.println(ff);
        System.out.println();
/*
9.Создать переменные типа Float:
floatSum
floatSub (substraction)
floatProduct
floatQuotient
floatRemainder
и  присвоить им значения, вычисленные с помощью переменных f и ff.
 */
        System.out.println(line);
        System.out.println("Task " + taskNumber++);

        Float floatSum = f+ff;
        Float floatSub = f-ff;
        Float floatProduct = f*ff;
        Float floatQuotient = f/ff;
        Float floatRemainder = f%ff;
        System.out.println("floatSum = " + floatSum);
        System.out.println("floatSub = " +floatSub);
        System.out.println("floatProduct = " +floatProduct);
        System.out.println("floatQuotient = " +floatQuotient);
        System.out.println("floatRemainder = " + floatRemainder);
        System.out.println();
/*
10.Создать переменные типа double:
doubleSum
doubleSub
doubleProduct
doubleQuotient
doubleRemainder
 и  присвоить им значения, вычисленные с помощью переменных d и dd.
 */

        System.out.println(line);
        System.out.println("Task " + taskNumber++);

        double doubleSum = d+dd;
        double doubleSub = d-dd;
        double doubleProduct = d*dd;
        double doubleQuotient = d/dd;
        double doubleRemainder = d%dd;
        System.out.println("doubleSum = " + doubleSum);
        System.out.println("doubleSub = " + doubleSub);
        System.out.println("doubleProduct = " + doubleProduct);
        System.out.println("doubleQuotient = " + doubleQuotient);
        System.out.println("doubleRemainder = " + doubleRemainder);
        System.out.println();
 /*
 11. Распечатать результаты вычислений заданий 8 - 10 в виде таблицы:
  */
        System.out.println("Task " + taskNumber++);
        System.out.println(line + "_______________");
        System.out.println("| f = " + f+  "  | ff = " + ff + " | d = " + d + " | dd = " + dd + "     |" );
        System.out.println(line + "_______________");
        System.out.println("|  floatSum = " + floatSum  + "            | doubleSum = "
                + doubleSum + "             |");
        System.out.println(line + "_______________");
        System.out.println("|  floatSub = " + floatSub  + "             | doubleSub = "
                + doubleSub + "              |");
        System.out.println(line + "_______________");
        System.out.println("|  floatProduct = " + floatProduct  + "        | doubleProduct  = "
                + doubleProduct  + "        |");
        System.out.println(line + "_______________");
        System.out.println("|  floatQuotient = " + floatQuotient  + "       |doubleQuotient = "
                + doubleQuotient + " |");
        System.out.println(line + "_______________");
        System.out.println("|  floatRemainder = " + floatRemainder  + "     |doubleRemainder = "
                + doubleRemainder + "|");
        System.out.println(line + "_______________");

/*
12. Распечатать слова HELLO JAVA точками (чтобы получился рисунок точками)
 */
        System.out.println("Task " + taskNumber++);

        System.out.println(line);
        System.out.println(".  . ... .   .   .        .   .    .  .   .");
        System.out.println(".  . .   .   .  .  .      .  .  .  .  .  . .");
        System.out.println(".... ... .   . .    .     . ...... .  .  ...");
        System.out.println(".  . .   .   .  .  .     . .     .  ..  .   .");
        System.out.println(".  . ... ... ...  .    .  .      .   . .     .");
        System.out.println();
/*
Part 2
 */
/*
13. Создать переменные подходящего ссылочного типа данных(выбирать минимально достаточный диапазон значений):
t1 = 0;
t2 = 150;
t3 = -120;
t4 = - 505.505;
t5 = 100100;
t6 = 100010001000;
t7 = 2.66666666666666;
t8 = - 1000000.001;
 */
        System.out.println(line);
        System.out.println("Task " + taskNumber++);

        Character t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Float t4 = -505.505F;
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Double t7 = 2.66666666666666;
        Float t8 = - 1000000.001F;
        System.out.println("Character t1 =" + t1);
        System.out.println("Short t2 =" + t2);
        System.out.println("Byte t3 =" + t3);
        System.out.println("Float t4 =" + t4);
        System.out.println("Integer t5 =" + t5);
        System.out.println("Long t6 =" + t6);
        System.out.println("Double t7 =" + t7);
        System.out.println("Float t8 =" + t8);
        System.out.println();
/*
14. С помощью полей классов ссылочного типа распечатать таблицу:
 */
        System.out.println(line);
        System.out.println("Task " + taskNumber++);

        System.out.println(line);
        System.out.println("|    Type   | bits |     min       |    max        |" );
        System.out.println(line);
        System.out.println("|    byte   |   8  |   -128        |   127         |" );
        System.out.println(line);
        System.out.println("|    short  |  16  |   -32 768     |   32767       |" );
        System.out.println(line);
        System.out.println("|    int    |  32  |   -2147483648 |   -2147483648 |" );
        System.out.println(line);
        System.out.println("|    long   |  64  |-92233720368.. |92233720368..  |" );
        System.out.println(line);
        System.out.println("|    float  |  32  |   -3.4E+38    |   3.4E+38     |" );
        System.out.println(line);
        System.out.println("|    double |  64  |   -1.7E+308   |   1.7E+308    |" );
        System.out.println(line);
        System.out.println();
 /*
 15. Создать 2 переменные референсного типа Integer - num1 и num2, присвоить им одинаковые значения, сравнить 2 переменные друг с другом с помощью метода .equals(). Вывести результат сравнения на печать в виде выражения:
“Если num1 равно  num2, то результат сравнения методом .equals() = …”
Присвоить переменным разные значения, сравнить,  и вывести результат на печать:
“Если num1 не равно num2, то результат сравнения методом .equals() = …”
  */
        System.out.println(line);
        System.out.println("Task " + taskNumber++);

        Integer num1;
        Integer num2;
        num1 = 10;
        num2 = 10;
        System.out.println("Если num1 равно  num2, то результат сравнения методом .equals() = "
                + num1.equals(num2));
        num2 = 20;
        System.out.println("Если num1 не равно  num2, то результат сравнения методом .equals() = "
                + num1.equals(num2));
        System.out.println();
/*
16. Создать 2 переменные примитивного типа int - number1 and number2. Инициализаровать их
а) одинаковыми значениями
b) number1 < number2
c) number1 > number2
сравнить их подходящим методом класса Integer (посмотрите, какой метод подойдет - не equals() !), и вывести результаты сравнения на печать в виде выражений:
“Если number1 = number2, то результат сравнения методом … = …”
“Если number1 < number2, то результат сравнения методом … = …”
“Если number1 > number2, то результат сравнения методом … = …”
 */
        System.out.println(line);
        System.out.println("Task " + taskNumber++);
        int number1,  number2;

        number1 = 10;
        number2 = 10;
        System.out.println("Если number1 = number2, то результат сравнения методом compare = "
                + Integer.compare(number1, number2));

        number1 = 10;
        number2 = 20;
        System.out.println("Если number1 < number2, то результат сравнения методом compare = "
                + Integer.compare(number1, number2));

        number1 = 20;
        number2 = 10;
        System.out.println("Если number1 > number2, то результат сравнения методом compare = "
                + Integer.compare(number1, number2));
        System.out.println();
/*
17. Создать переменную типа Float, присвоить ей значение 234.9999, распечатать значение переменной в int
 */
        System.out.println(line);
        System.out.println("Task " + taskNumber++);
        Float fl = 234.9999F;
        int r = fl.intValue();
        System.out.println(r);
        System.out.println();


/*
18. С помощью метода sum() класса Double посчитать сумму двух переменных типа double.
 */
        System.out.println(line);
        System.out.println("Task " + taskNumber++);
        double d1 = 22.33;
        double d2 = 33.22;
        System.out.println("сумма двух переменных типа double = " + Double.sum(d1, d2));
        System.out.println();
/*
19. С помощью метода sum() класса Integer посчитать сумму двух переменных типа Float.
 */
        System.out.println(line);
        System.out.println("Task " + taskNumber++);
        Float in1 = 33.22F;
        Float in2 = 22.33F;
        Float in3 = Float.sum(in1, in2);
        System.out.println("сумма двух переменных типа Float = " + in3.intValue());
        System.out.println();
 /*
 20.Создать 2 переменные типа Short:
short1 = 12000
short2 = 12300
Распечатать фразу:
“12000 - 12300 = -300”
где значение -300 выведено с помощью метода класса Short, а не операцией вычисления
Присвоить переменной short1 значение 12500, вывести фразу:
“12500 - 12300 = 200”
где значение 200 выведено с помощью метода класса Short, а не операцией вычисления
  */
        System.out.println(line);
        System.out.println("Task " + taskNumber++);
        Short short1;
        Short short2;
        short1 = 12000;
        short2 = 12300;
        System.out.println("12000 - 12300 =" + Short.compareUnsigned(short1, short2));
        short1 = 12500;
        System.out.println("12500 - 12300 = " + Short.compareUnsigned(short1, short2));
        System.out.println();

/*
21. Создать переменные:
String str1 = "123.56";
String str2 = "123.55";
Double doub1 = 123.56;
Double doub2 = 123.55;
Распечатать результат doub1 - doub2
Используя методы ссылочного типа данных, посчитать и распечатать результат str1 - str2
Сравнить полученные результаты doub1 - doub2 и str1 - str2
 */

        System.out.println(line);
        System.out.println("Task " + taskNumber++);
        String str1 = "123.56";
        String str2 = "123.55";
        double i1 = Double.valueOf(str1);
        double i2 = Double.valueOf(str2);
        double i3 = i1-i2;
        Double doub1 = 123.56;
        Double doub2 = 123.55;
        Double doub3 = doub1-doub2;
        System.out.println("doub1 - doub2 = " + doub3);
        System.out.println("str1 - str2 = " + i3);
        System.out.println();
/*
22.Создать переменную подходящего типа данных для хранения результатов измерения температуры тела кота
(значения температуры в Цельсиях). Присвоить этой переменной сначала максимальное значение, затем
минимальное значение. Посчитать и распечатать среднее значение. Распечатать результат среднего
значения температуры тела кота.
 */
        System.out.println(line);
        System.out.println("Task " + taskNumber++);
        Double tmp;
        tmp = 39.2;
        System.out.println(tmp);
        tmp = 37.5;

        System.out.println();

/*
Part 3
 */
/*
23. Создать переменную n типа Number, присвоить ей максимально возможное значение.
Присвоить n значение 10,
затем присвоить n значение 10.999999999

Распечатать результаты в виде выражения:
“Переменная n может принимать значения:
 n =  …
 n =  …
 n =  …
 Это возможно, потому что …”
 */
        System.out.println(line);
        System.out.println("Task " + taskNumber++);
        Number nb;
        nb = 2147483647;
        System.out.println("“Переменная n может принимать значения: ");
        System.out.println("n = " + nb);
        nb = 10;
        System.out.println("n = " + nb);
        nb = 10.999999999;
        System.out.println("n = " + nb);
        System.out.println("Это возможно, потому что Number это родительский объект над всеми примитивными");

        System.out.println();
/*
24. Создать переменную Integer numberInteger = 100.
Доказать, что numberInteger имеет тип Integer,
а numberInteger.toString() имеет тип String.

 */
        System.out.println(line);
        System.out.println("Task " + taskNumber++);
        Integer numberInteger = 100;
        System.out.println("Integer имеет тип - " + numberInteger.getClass());
        String str = numberInteger.toString();
     System.out.println("numberInteger.toString() имеет тип - " + str.getClass());

        System.out.println();

 /*
25. Вывести на экран следующие выражения, используя для печати только переменные:
“50 kilogram = … lbs,  50 lb = … kg”, где значения должны быть вычислены по формулам

“100 meters = … miles,  100 miles = … meters”, где значения должны быть вычислены по формулам

  */

        System.out.println(line);
        System.out.println("Task " + taskNumber++);


        System.out.println();

/*
26. На сайте погоды https://openweathermap.org/ найти в документации и распечатать, какие коды соответствуют следующим состояниям погоды:
… - thunderstorm with heavy rain
… - overcast clouds: 85-100%
… - Shower sleet
 */
        System.out.println(line);
        System.out.println("Task " + taskNumber++);


        System.out.println();
    }
}

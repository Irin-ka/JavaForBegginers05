package homework;

import java.sql.SQLOutput;

public class HW5 {

    static int numberTask = 2;

    public static String verifyEquals(int expectedResult, int actualResult){
        if(expectedResult == actualResult) {

            return "Pass";
        }

        return "Fail";
    }
    public static String verifyEquals(double expectedResult, double actualResult){
        if(expectedResult == actualResult) {

            return "Pass";
        }

        return "Fail";
    }
    public static String verifyEquals(String expectedResult, String actualResult){
        if(expectedResult.equals(actualResult)) {

            return "Pass";
        }

        return "Fail";
    }
    public static void numberTask(){

        System.out.println("Task " + numberTask++);
    }

    public static void printTestResult(String value) {
        System.out.print(value);
        System.out.println();
    }
    /*2. метод принимает на вход число от 1 до 7 и возвращает денб недели.
    В случае невалидных значений метод возвращает “Error”. Протестировать.*/

    public static String dayOfWeek(int numberOneOfSeven){
        if (numberOneOfSeven > 0 && numberOneOfSeven < 8) {
            if (numberOneOfSeven == 1) {

                return "Понедельник";
            } else if (numberOneOfSeven == 2) {

                return "Вторник";
            } else if (numberOneOfSeven == 3) {

                return "Среда";
            } else if (numberOneOfSeven == 4) {

                return "Четверг";
            } else if (numberOneOfSeven == 5) {

                return "Пятница";
            } else if (numberOneOfSeven == 6) {

                return "Суббота";
            } else if (numberOneOfSeven == 7) {

                return "Воскресенье";
            }
        }
            return "Error";

    }
/* 3. Написать алгоритм вычисления среднего возраста (int) в семье из 3х человек.
Например, int age1 = 20,  int age2 = 40,  int age3 = 60
Average = 40.
или  age1 = -5;  age2 = -30;  age3 = -3;  должно вернуть  Integer.MIN_VALUE;
Протестируйте алгоритм на позитивные и негативные сценарии.
*/
    public static int averageAge (int age1, int age2, int age3) {

        if ((age1 > 0 && age1 < 101) && (age2 > 0 && age2 < 101) && (age3 > 0 && age3 < 101)) {

            return ((age1 + age2 + age3) / 3);
        }
        return Integer.MIN_VALUE;
    }

    /* 4.Найти минимальное  значение, используя переменные (по одному методу на каждый вариант)
k и l
k, l, m
k, l, m, n
Переменные должны быть типа int
Happy path test data:
if k = 3, l = 30, m = 300, n = 3000
expected results:
a) 3
b) 3
c) 3
Написать тесты на каждый метод.
    */
    //---a---
    public static int minValue (int k, int l) {
        int minValue1 = Math.min(k, l);
        return minValue1;
    }
    //---b---
    public static int minValueOfTree (int k, int l, int m) {
        int min;
        if (k < l){
            min = k;
        } else min = l;
        if (min < m){
            min = min;
        } else min = m;
        return min;
    }
    //---c---
    public static int minValueFromFour (int k, int l, int m, int n){

        return Math.min(k, Math.min(l, Math.min(m, n)));
    }
    /* 5. Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.
    Метод принимает и возвращает значения типа double. Например,
t1 = 39
t2 = 39
t3 = 39
t4 = 39
t5 = 39
TempAverage = 39
Не забудьте, что температура тела ЖИВОГО кота имеет определенные границы.
Значения, которые не входят в эти границы считаем невалидными и выдаем ошибку. В случае невалидного
значения хотя бы одной из входящих температур, метод возвращает -1.
    */

    public static double tempAverage (double t1, double t2, double t3, double t4, double t5) {
        if ((t1 > 25 && t1 < 45) &&(t2 > 25 && t2 < 45) &&(t3 > 25 && t3 < 45) &&(t4 > 25 && t4 < 45)
                &&(t5 > 25 && t5 < 45)){

            return ((t1 + t2 + t3 + t4 + t5) / 5);
        }
        return -1;
    }

    /* 6.Написать метод, который принимает на вход количество часов (int) работы в день,
стоимость одного часа работы в десятичном числе, и возвращает заработную плату в месяц в целых единицах.
При невалидных значениях метод возвращает -1. Уточнения:
Стоимость одного часа для разных сотрудников может быть разная. Данные о зарплате сотрудников мы не разглашаем.
НО наши сотрудники не работают бесплатно и не выплачивают компании долги за право работать.
Зарплата сотрудников рассчитывается согласно законодательства штата.
Страна = RedRover.school
Штат = Java for beginers
По законодательству нашего штата минимальная оплата рабочего часа - 12.
В организации нет сотрудников у которых  сокращенная рабочая неделя ( несовершеннолетние, инвалиды,
вредные условия труда  ) , но сотрудники могут выбирать, сколько часов в день они могут работать.
Овертайм оплачивается по обычной ставке.
ПО уточненным требованиям:
Будем считать, что в нашей организации вот этот документ определяет      Среднемесячную норму рабочего времени
 https://clubtk.ru/srednee-kolichestvo-rabochikh-dney-v-mesyatse
Но среднемесячная норма не означает, что нельзя работать больше 8 часов в день.
Протестируйте метод на позитивные и негативные сценарии.
  */
    public static int costInMonth(int hours, double costHours, int days){
        if (costHours >= 12 && costHours < 100) {
            if (hours > 0 && hours < 24) {
                return (int) (hours * costHours * days);
            }
            return -1;
        }
        return -1;
    }
/*
7. Написать метод, который принимает на вход 2 параметра -  цену и количество товара (количество в штуках).
Алгоритм возвращает сумму покупки в виде десятичного числа.
Например,
price for 1 = 25 руб 50 коп (25.5)
amount = 5
expected total = 127 руб 50 коп (127.5)
При невалидных значениях метод возвращает -1
ПРоверьте метод на позитивный и негативный сценарий.
 */
    public static double sumOrder(double price, int amount) {
        if (price > 0 && amount > 0){
            return (price * amount);
        }
        return -1;
    }
 /*
 8.Написать метод, который принимает на вход необходимые параметры и возвращает строку ведомости
 выдачи зарплаты сотрудникам.
Например:
“Смирнова Мария Ивановна 		70000 руб 00 коп”
если имя сотрудника придет в виде пустой строки или в виде null (String -  это референсный тип данных и
может принимать значение null), то в ведомости должна быть распечатана пустая строка "".
Если же на вход придет невалидное данное по зарплате, или зарплата будет рассчитана, как 0, то в
ведомости тоже должна быть распечатана пустая строка ""
Протестировать метод.
  */
    public static String valueForSalary(String fio, double salary) {
        int rub = (int) salary;
        int kop = (int)((salary-rub)*100);
        if ((fio != "") || (fio != null)) {   //if ((fio == nul) || (fio.equals("")) || (salary <=0)
            if (salary > 0) {
                return fio + rub + " руб " + kop + " коп";
            }
            else return ("");
        }
        else return ("");
    }
/*
9. Создать метод, который печатает ведомость для нескольких сотрудников, используя метод из задачи 8,
например:
Смирнова Мария Ивановна 		70000 руб 00 коп
Серебров Иван Петрович 		128059 руб 00 коп
Метод в задании 9 может принимать разные параметры, в зависимости от того, что вам нужно для печати ведомости.
Смысл этого метода - распечатать несколько строк ведомости одновременно. Каждая из строк должна формироваться
с помощью метода, написанного в задании 8.
На этот метод писать тесты не нужно, просто распечатать ведомость.
 */
// МЕТОД ВЗЯТ ИЗ ПРЕДЫДУЩЕЙ ЗАДАЧИ
    /*
   10. Записать в виде метода и протестировать:
дано int x (схема)
     */
    public static String whatIsX (int x) {
        if ((x == 0) || (x > 0)) {
            if (x > 0) {
                return "" + x + " is positive";
            } else return "" + x + " is zero";
        }
        return "" + x + " is negative";
    }

    /*
    11. Написать метод, который принимает на вход десятичное число (например, 10.75),
    и возвращает строку “10 руб 75 коп”.
     */
    public static String rubKop (double rubKop) {
        int rub = (int) rubKop;
        int kop = (int) ((rubKop - rub) * 100);
        if (rubKop > 0) {
            return "" + rub + " руб 0" + kop + " коп";
        } else return "Error";
    }
    /*
    12. Написать метод, который принимает на вход десятичное число
    (например, 10,075) и возвращает строку “10 кг 75 гр”
     */
    public static String kgGr (double kgGr) {
        int kg = (int) kgGr;
        int gr = (int) ((kgGr - kg) * 1000);
        if (kgGr > 0) {
            return "" + kg + " кг " + gr + " гр";
        } else return "Error";
    }
    /*
    13. Написать метод, который принимает на вход необходимые параметры, и печатает чек.
    Этот метод тестировать не нужно, но необходимо использовать все раннее написанные методы
    (в задачах из Part 1 тоже могут пригодиться некоторые методы)
Пример чека:
Яблоки
Цена за 1 кг			50 руб 13 коп
Количество товара	         3 кг 400 гр
_______________________________________
Сумма к оплате		170 руб 44 коп

или
Хлеб
Цена за 1 шт		30 руб 50 коп
Количество товара	5 шт
_______________________________________
Сумма к оплате		152 руб 50 коп
     */
    public static String evaluateAmount(String fruit, String priceForOne, double price1, String quantity, double weight, String line,
                                        String sum) {
        int rubl = (int) price1;
        int kopeek = (int)((price1-rubl)*100);
        int kilo = (int) weight;
        int gramm = (int)((weight-kilo)*1000);
        double amount = price1 * weight;
        int itogRub = (int) amount;
        int itogKop = (int) ((amount-itogRub)* 100);

        if (price1 > 0 && weight > 0) {
            return "" + fruit + "\n" + priceForOne + rubl + " рублей " + kopeek + " копеек \n"
            + quantity + kilo + " кг " + gramm + " гр \n"
                    + line + "\n" + sum + itogRub + " руб " + itogKop + " коп";
        } else return "Error";
    }

/*
   14.Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число.
   Счастливое число рассчитывается по формуле: сумма всех чисел, если результат больше 9, снова
   считается сумма всех чисел.
Например:
год рождения 1999
1 + 9 + 9 + 9 = 28
2 + 8 = 10
1 + 0 = 1
Счастливое число - 1
 */
    public static int happyNumber (int yearNumber) {

        if (yearNumber > 1000 && yearNumber < 2550) {

            int numberTys = (int)(yearNumber/1000) *1000;
            int numberTysEd = (int)(yearNumber/1000);
            int numberSot = (int)((yearNumber-numberTys) / 100)* 100;
            int numberSotEd = (int)((yearNumber-numberTys) / 100);
            int numberDes = (int)((yearNumber-numberTys - numberSot) / 10) * 10;
            int numberDesEd = (int)((yearNumber-numberTys - numberSot) / 10);
            int numberEd = yearNumber-numberTys - numberSot - numberDes;
            int itog = numberTysEd + numberSotEd + numberDesEd + numberEd;

            if (itog > 9) {
                int numDes = (int)(itog / 10) * 10;
                int numDes1 = (int)(itog / 10);
                int numDesEd = itog - numDes;
                return  numDesEd + numDes1;
            } else return  itog;
        } else return -1;
    }
    /*
15.    а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.
b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать
*Медиана - это серединное число в отсортированном наборе чисел.
1, 3, 9 → медиана 3
12, 13, 101 → медиана 13
14, 2, 12 → медиана 12
ВСе параметры приходят в int, расчеты производим в int
Протестировать оба метода - a) и b)
     */
 public static String raznicaMezhdu (int a, int b, int c) {
     int d = (a + b + c) / 3;
     if ((a >b && a < c) || (a > c && a <b)) {
         int f = a - d;
         if (f >= 2 && f <= -2) {
             return "Cреднее значение " + d + " отличается от медианы на " + f;
         } else {
             return "Cреднее значение = " + d + " медиана = " + a;
         }
     } else {
         if ((b >a && b < c) || (b > c && b <a)) {
         int k = b - d;
         if (k >= 2 && -k >= 2 ) {
             return "Cреднее значение " + d + " отличается от медианы на " + k;
         } else {
             return "Cреднее значение = " + d + " медиана = " + b;
         }
     } else {
             int f = c - d;
             if (f >= 2 && f <= -2) {
                 return "Cреднее значение " + d + " отличается от медианы на " + f;
             } else {
                 return "Cреднее значение = " + d + " медиана = " + c;
             }
         }
     }
 }
 /*
 16. Написать метод, который использует методы класса Math, принимает на вход сумму к оплате
 (например, 10.75) и округляет сумму в пользу покупателя.
 Метод возвращает новую сумму к оплате в виде строки, например “10 руб 00 коп”.
  */
   public static String sumForUser (double cost) {
       int sumForUser = (int)Math.floor(cost);
       return ""+ sumForUser + " руб 00 коп.";
   }
   /*
 17.  Посчитать с помощью методов класса Math
int a = 3
int b = 4
int c = 20
((a * b + c) * ab)
Вернуть значение с округлением в бОльшую сторону.
    */
    public static int okruglenie (int a1, int b1, int c1) {
       // double k1 = (Math.sqrt((a1 * b1 + c1) * Math.pow(a1, b1) ))/ Math.PI;
        int d1 = (int)Math.ceil((Math.sqrt((a1 * b1 + c1) * Math.pow(a1, b1) ))/ Math.PI);
        return d1;
    }

    /*
    19. Написать метод, который с помощью методов класса Math высчитывает случайно сгенерированную
    степень сгенерированного случайного числа. Метод возвращает значение и выводит на экран:
    “Число … в степени … = …”
Число может быть в пределах от 0 до 1 исключительно.
Степень числа может быть от 0 до 10 включительно
     */
    public static String stepen (int a2, int b2) {
         a2 = 0;
         b2 = 10;
         double c2 = Math.random();
         int d2 = (int) (Math.random() * ((b2 - a2) + 1)) + a2;
        return  "Число " + c2 + " в степени " + d2 + " = " + Math.pow(c2,d2);
    }
    /*
    20.Написать метод, который возвращает целочисленное случайное число в пределах от 1 до 99 включительно.
    Затем написать метод, который возвращает случайное число в пределах от -1 до -99 включительно
     */
    public static int randomNumber (int min, int max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }
    public static int randomNumber1 (int min1, int max1) {
        return (int) (Math.random() * ((max1 - min1) + 1)) + min1;
    }

    public static void main(String[] args) {

        //******************  Task 2 ***************
        // //A - arrange (объявить все данные, которые нам известны)
        int number = 6;
         String expectedResult = "Суббота";
        //Act - произвести какие-то действия (н-р, вызвать метод) для получения actual result
         String actualResult = dayOfWeek(number);
        //A = assert  - сравнение expectedResult с actualResult и вывод о том, прошел тест или упал
         verifyEquals(expectedResult, actualResult);
         //отчет (report)
        numberTask();
        printTestResult(verifyEquals(expectedResult, actualResult));

        //******************   Task 3  ***********************
        // Средний возраст
        int age1 = -5;
        int age2 = 40;
        int age3 = 60;
        int expectedResult1 = 40;
        int actualResult1 = averageAge(age1, age2, age3);
        verifyEquals(expectedResult1, actualResult1);

        numberTask();
        System.out.println(actualResult1);
        printTestResult(verifyEquals(expectedResult1, actualResult1));

        //***************** Task 4 **********************
        int k = 3;
        int l = 30;
        int m = 300;
        int n = 3000;
        int expectedResult2 = 3;
        int actualResult2 = minValue (k, l);
        verifyEquals(expectedResult2, actualResult2);

        numberTask();
        System.out.println(actualResult2);
        printTestResult(verifyEquals(expectedResult2, actualResult2));

        int expectedResult3 = 3;
        int actualResult3 = minValueOfTree (k, l, m);
        verifyEquals(expectedResult3, actualResult3);
        System.out.println(actualResult3);
        printTestResult(verifyEquals(expectedResult3, actualResult3));

        int expectedResult4 = 3;
        int actualResult4 = minValueFromFour (k, l, m, n);
        verifyEquals(expectedResult4, actualResult4);
        System.out.println(actualResult4);
        printTestResult(verifyEquals(expectedResult4, actualResult4));

        //*********************** Task 5 *********************
        numberTask();
        double t1 = 19;
        double t2 = 39;
        double t3 = 39;
        double t4 = 39;
        double t5 = 39;
        double expectedResult5 = 39;
        double actualResult5 = tempAverage (t1, t2, t3, t4, t5);
        verifyEquals(expectedResult5, actualResult5);
        System.out.println(actualResult5);
        printTestResult(verifyEquals(expectedResult5, actualResult5));
        //*********************** Task 6 ************************
        numberTask();
        int days = 20;
        int hours = 10;
        double costHours = 95.95;
        int expectedResult6 = 19190;
        int actualResult6 = costInMonth(hours, costHours, days);
        verifyEquals(expectedResult6, actualResult6);
        System.out.println(actualResult6);
        printTestResult(verifyEquals(expectedResult6, actualResult6));
        //*************************  Task 7 ********************
        numberTask();
        double price = 3.44;
        int amount = 1;
        double expectedResult7 = 3.44;
        double actualResult7 = sumOrder(price, amount);
        verifyEquals(expectedResult7, actualResult7);
        System.out.println(actualResult7);
        printTestResult(verifyEquals(expectedResult7, actualResult7));
        //********************** Task 8 ************************
        numberTask();
        String fio = "Смирнова Мария Ивановна     ";
        double salary = 70000.55;
       // String rub = " руб 00 коп";
        String expectedResult8 = "Смирнова Мария Ивановна     70000 руб 55 коп";
        String actualResult8 = valueForSalary(fio, salary);
        System.out.println(actualResult8);
        printTestResult(verifyEquals(expectedResult8, actualResult8));
        //********************** Task 9 **************************
        numberTask();
        fio = "Смирнова Мария Ивановна     ";
        salary = 70000.55;
        actualResult8 = valueForSalary(fio, salary);
        System.out.println(actualResult8);
        fio = "Серебров Иван Петрович      ";
        salary = 128059.66;
        actualResult8 = valueForSalary(fio, salary);
        System.out.println(actualResult8);
        //********************** Task 10 **************************
        numberTask();
        int x = -2;
        String expectedResult10 = "-2 is negative";
        String actualResult10 = whatIsX(x);
        verifyEquals(expectedResult10, actualResult10);
        System.out.println(actualResult10);
        printTestResult(verifyEquals(expectedResult10, actualResult10));
        //********************** Task 11 **************************
        numberTask();
        double rubKop = 10.05;
        String expectedResult11 = "10 руб 71 коп";
        String actualResult11 = rubKop(rubKop);
        verifyEquals(expectedResult11, actualResult11);
        System.out.println(actualResult11);
        printTestResult(verifyEquals(expectedResult11, actualResult11));
        //********************** Task 12 **************************
        numberTask();
        double kgGr = 10.077;   // 76 гр в ответе  - ???
        String expectedResult12 = "10 кг 75 гр";
        String actualResult12 = kgGr(kgGr);
        verifyEquals(expectedResult12, actualResult12);
        System.out.println(actualResult12);
        printTestResult(verifyEquals(expectedResult12, actualResult12));
        //********************** Task 13 **************************
        numberTask();
        String fruit = "Яблоки";
        String priceForOne = "Цена за 1 кг   ";
        double price1 = 50.13;
        String quantity = "Количество товара   ";
        double weight = 3.400;
        String line = "------------------------------------------";
        String sum = "Сумма к оплате    ";
        String actualResult13 = evaluateAmount(fruit, priceForOne, price1, quantity, weight, line, sum);
        System.out.println(actualResult13);
        //********************** Task 14 **************************
        numberTask();
        int yearNumber = 2345;
        int actualResult14 = happyNumber (yearNumber);
        int expectedResult14 = 5;
        verifyEquals(expectedResult14, actualResult14);
        System.out.println(actualResult14);
        printTestResult(verifyEquals(expectedResult14, actualResult14));
        //********************** Task 15 **************************
        numberTask();
        int a = 12;
        int b = 13;
        int c = 101;
        String expectedResult15 = "Cреднее значение = 4 медиана = 3";
        String actualResult15 = raznicaMezhdu (a, b, c);
        verifyEquals(expectedResult15, actualResult15);
        System.out.println(actualResult15);
        printTestResult(verifyEquals(expectedResult15, actualResult15));
        //********************** Task 16 **************************
        numberTask();
        double cost = 10.75;
        String expectedResult16 = "10 руб 00 коп.";
        String actualResult16 = sumForUser(cost);
        verifyEquals(expectedResult16, actualResult16);
        System.out.println(actualResult16);
        printTestResult(verifyEquals(expectedResult16, actualResult16));
        //********************** Task 17 **************************
        numberTask();
        int a1 = 3;
        int b1 = 4;
        int c1 = 20;
        int actualResult17 = okruglenie(a1, b1, c1);
        System.out.println(actualResult17);
        //********************** Task 18 **************************
        numberTask();

        //********************** Task 19 **************************
        numberTask();
        String actualResult19 = stepen(0, 10);
        System.out.println(actualResult19);
       //********************** Task 20 **************************
        numberTask();
        int actualResult20 = randomNumber(1, 99);
        System.out.println(actualResult20);
        int actualResult201 = randomNumber(-99, -1);
        System.out.println(actualResult201);
    }


}

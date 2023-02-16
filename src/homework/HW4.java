package homework;

import java.sql.SQLOutput;

public class HW4 {

    /*
  2. Написать метод, который будет печатать номер задания перед каждым ответом. Придумайте свой дизайн.
     */
    static String line = "----------------------------------------------------------------------";
    static int n = 2;

    //метод для печати номера задания
    public static void taskNumber(int n) {
        System.out.println(line);
        System.out.println("Task № " + n);
    }
    // который примет на вход температуру в Цельсиях, и распечатает результат температуры в Цельсиях и в Фаренгейтах
    public static void checkTemp (double temp) {
        System.out.println("В цельсиях - " + temp
        + ", а в Фаринейтах это - " + (temp*1.8+32));
    }
    //Метод "результат деления" и параметры к, l, m
    public static void resultDevide (int k, int l, int m) {
        System.out.println("Результат деления k на l = " + k/l +", а остаток от деления  = " + k%l);
        System.out.println("Результат деления k на m = " + k/m +", а остаток от деления  = " + k%m);
        System.out.println("Результат деления l на m = " + l/m +", а остаток от деления  = " + l%m);
        System.out.println("Результат деления m на k = " + m/k +", а остаток от деления  = " + m%k);
    }
    //Метод для расчета яблок на количество учеников
    public static void costApple (int apple, int student) {
        if (apple==1){

        }


    }
    //алгоритм программы, которая проверяет число типа short на количество разрядов, и выводит результат проверки.
    public static void quantity(short num) {

            if (((num / 10000 >= 1) && (num / 10000 < 10)) || ((num / 10000 < -1) && (num / 10000 > -10))) {
                System.out.println("В числе 5 разрядов");
            } else if (((num / 1000 >= 1) && (num / 1000 < 10)) || ((num / 1000 < -1) && (num / 1000 > -10))) {
                System.out.println("В числе 4 разряда");
            } else if (((num / 100 >= 1) && (num / 100 < 10)) || ((num / 100 < -1) && (num / 100 > -10))) {
                System.out.println("В числе 3 разряда");
            } else if (((num / 10 >= 1) && (num / 10 < 10)) || ((num / 10 < -1) && (num / 10 > -10))) {
                System.out.println("В числе 2 разряда");
            } else  {
                System.out.println("В числе 1 разряд");
            }
    }


    public static void main(String[] args) {
        taskNumber(n++);
        taskNumber(n++);
/*
3. Записать в виде кода следующие логические выражения:
 */
            System.out.println("(2==2) && (7==7)");
            System.out.println("!(15<3)");
            System.out.println("('Сосна' == 'Дуб')||('Вишня' == 'Клён')");
            System.out.println("!(\"Сосна\" == \"Дуб\")");
            System.out.println("(!(15 < 3)) && (10 > 20)");
            System.out.println("(\"Глаза даны, чтобы видеть\") && (\"Под третьим этажом находится второй этаж\")");
            System.out.println("(6/2 = 3) || (7*5 = 20)");
/*
4.Записать в виде кода следующие выражения:
а) Света младше Андрея и Наташи
б) На полке стоят учебники, а на столе лежат справочники.
в) БОльшая часть детей — девочки. Остальные - мальчики.
 */
        taskNumber(n++);
        System.out.println("(Света < Андрей)&&(Света < Наташа)");
        System.out.println("Если a>b, то а - это девочки, а b - это мальчики");


/*
5.“Водительские права можно получить, только когда исполнится 16 лет.”
 */
        taskNumber(n++);
        int age=15;
        if (age < 16) {
            System.out.println("Водительские права можно получить, только когда исполнится 16 лет.");
        }
        else System.out.println("Уже можно получить права");


/*
6.”Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно”
 */
        taskNumber(n++);
        System.out.println("Петя !(ехать в автобусе) && ((читать книгу)|| !(смотреть в окно))");
/*
7.Записать выражения в виде условий if-else:
“Если с другом ты, это хорошо, а когда наоборот - плохо”
 */
        taskNumber(n++);
        System.out.println(" if (если с другом ты) \n { то это хорошо } \n else if (наоборот){ \nплохо }");
/*
8. Проверить число x, которое может принимать значения 10, 12, -3, 5 и 0.
Если x больше 10, то вывести на печать “x больше 10”.
Если x меньше нуля, то вывести на печать “x - отрицательное число”
Если x = 5, то вывести на печать “Разность x и 5 равна 0”
Иначе вывести на печать “Число x меньше 11, больше или равно 0, но не равно 5”.
Проверить, соответствует ли последнее утверждение всем предыдущим утверждениям.
 */
        taskNumber(n++);
        int x=9;
        if (x>10) {
            System.out.println("X больше 10");
        } else if (x<0) {
            System.out.println("Х - отрицательное число");
        } else if (x==5) {
            System.out.println("Разность x и 5 равна 0");
        } else {
            System.out.println("Число x меньше 11, больше или равно 0, но не равно 5”");
        }
/*
9.Проверьте число на четность. Если число четное, удвойте это число,
иначе возведите число в квадрат. Выведите результат работы алгоритма на печать.
Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
 */
        taskNumber(n++);
        int y;
        if (x%2==0) {
            y = x*2;
            System.out.println(y);
        } else {
            y = x*x;
            System.out.println(y);
        }

/*
10.Напишите алгоритм проверки возраста на соответствие условиям (if-else):
Голосовать можно с 18 лет
Машину можно водить с 16 лет
В школу можно идти с 5 лет
Выведите результат работы алгоритма на печать.
 */
        taskNumber(n++);
        int age1=18;
        if ((age1>=5) &&(age1<16)) {
            System.out.println("Можно идти в школу");
        } else if ((age1>=16) && (age1<18)) {
            System.out.println("Машину можно водить");
        } else if (age1>=18) {
            System.out.println("Голосовать можно");
        } else {
            System.out.println("Надо подрасти");
        }

/*
11.Напишите алгоритм программы, которая проверяет оценку ученика и выполняет следующие действия:
5 - выдать похвальную грамоту и перевести в следующий класс
4 - перевести в следующий класс
3 - дать задание на лето и перевести в следующий класс
2 - вызвать родителей и оставить в текущем классе на второй год
Выведите результат работы алгоритма на печать.
 */
        taskNumber(n++);
        int mark=3;
        if (mark==5) {
            System.out.println("выдать похвальную грамоту и перевести в следующий класс");
        } else if (mark==4) {
            System.out.println("перевести в следующий класс");
        } else if (mark==3) {
            System.out.println("дать задание на лето и перевести в следующий класс");
        } else if (mark==2) {
            System.out.println("вызвать родителей и оставить в текущем классе на второй год");
        } else System.out.println("Это не оценка");

/*
Part 2
 */
/*
12. Напишите метод, который примет на вход температуру в Цельсиях,
и распечатает результат температуры в Цельсиях и в Фаренгейтах.
 */
        taskNumber(n++);
        checkTemp(9);

/*
13.Напишите алгоритм программы, которая проверяет 2 числа. Программа складывает числа,
которые делятся на 3 без остатка, и вычитает числа, которые делятся на 5 без остатка.
ПРограмма выводит на печать результат вычислений.
Программа умножает числа, которые делятся на 2 без остатка, но если хотя бы одно число отрицательное,
программа умножает результат действия на (-1). ПРограмма выводит на печать результат вычислений.
Если числа не прошли ни одну проверку, программа выводит на печать ошибку о невозможности произвести действия.
 */
        taskNumber(n++);
        int a = 3;
        int b = -2;
        int res;
        if ((a % 3 == 0) && (b % 3 == 0)) {
            res = a + b;
            System.out.println(res);
        } else if (((a % 5 == 0) && (b % 5 == 0))) {
            res = a - b;
            System.out.println(res);
        } else if (((a % 2 == 0) && (b % 2 == 0))) {
            res = a * b;
            if ((a < 0) || (b < 0)) {
                res = -1 * res;
            }
            System.out.println(res);

        } else System.out.println("Невозможно произвести действия");
/*
14. Распечатать следующие выражения, используя метод и параметры k, l, m:
Результат деления k на l = …, а остаток от деления  = …
Результат деления k на m = …, а остаток от деления  = …
Результат деления l на m = …, а остаток от деления  = …
Результат деления m на k = …, а остаток от деления  = …
 */
        taskNumber(n++);
        resultDevide(15, 6, 73);
/*
Part 3
 */
/*
15. Решить задачу
В клетке находятся фазаны и кролики. Известно, что у них 35 голов и 94 ноги.
Узнайте число фазанов и число кроликов.
Проверить работу вашего алгоритма тестом.
 */

  taskNumber(n++);
        int g = 35;
        int leg = 94;

        int faz = (140-94) / 2;
        int krol = 35 - faz;
        System.out.println(faz + "\n" + krol);

/*
16.Написать метод, который рассчитывает среднюю скорость движения (speedAverage) транспортного
средства или живого существа с разными параметрами distance и  time.
Протестировать метод.
Тестовые данные:
distance	time
12			20 min
150		2,5 hours
300		1¾ hours
 */
        taskNumber(n++);
/*
17. Выполнить задание 7 и 8 из HW2 с помощью метода и параметров:
Написать метод так, чтобы правильные склонения слов (н-р, яблок, яблоко или яблока; ученики - учеников…)
печатались автоматически в зависимости от значений параметров.
Распечатать выражение с параметрами:
apple = 42, 55, 1
student = 42, 5, 2
 */
        taskNumber(n++);

/*
18.Распечатать таблицу из HW3,  задание 11 с помощью методов и параметров (значения f, ff, d, dd могут быть любыми).
Обратите внимание на то, что левая часть таблицы у вас почти такая же, как правая часть таблицы.
 */
        taskNumber(n++);
/*
19.Напишите алгоритм программы, которая проверяет число типа short на количество разрядов,
и выводит результат проверки.
( Например, “It’s a two-digit number.”, “It’s a five-digit number.”, etc)
Выведите результат проверки на печать.
 */
        taskNumber(n++);
        quantity((short) -320);
/*
20.На сайте https://openweathermap.org/ зарегистрироваться и получить ключ (key).
Найти в документации пример запроса с параметрами “Название города” (а не с географическими координатами).
Сформировать и отправить запрос на сервер (manually). В полученном ответе найти географические координаты
для следующих городов
London
Paris
Rome
(См окончание разбора HW3 - там было показано, как отправлять запрос)
 */
        taskNumber(n++);
    }
}
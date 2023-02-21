package homework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HW9 {

    public static int numTask = 1;

    public static void taskOfNumber() {

        System.out.println("Task: " + numTask++);
    }

    //1. принимает на вход строку.
    //Если строка не пустая (проверить методом класса String), то примените метод по удалению пробелов в начале и в конце строки.
    //Догадаться, каким методом из видео можно проверить, были ли пробелы в строке.
    //Если пробелы были, то метод должен удалить их и вернуть сообщение: “Лишние пробелы удалены”.
    //Если пробелов не было, вернуть сообщение “Пробелов не было”.
    //Если строка пустая (проверить методом класса String), вернуть сообщение “Строка пустая”.
    //“    Red Rover School   “ → “Лишние пробелы удалены”
    //“Red Rover School“ → “Пробелов не было”
    //“” → “Строка пустая”
    public static String removeSpaces(String str1) {

        String string1 = "Лишние пробелы удалены";
        String string2 = "Пробелов не было";
        String string3 = "Строка пустая";

        if (str1.isEmpty() != true) {
            if (str1.charAt(0) == ' ' || str1.charAt(str1.length() - 1) == ' ') {
                str1 = str1.trim();
                System.out.println(str1);
                System.out.println(string1);
                return string1;
            } else {
                //  System.out.println(str1);
                System.out.println(string2);
                return string2;
            }
        } else {
            System.out.println(string3);
            return string3;
        }
    }
    //2.принимает на вход строку. Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
    // Метод возвращает обработанную строку.
    // “    Red Rover School   “ →  “Red Rover School“
    //“panda   “ → “pnd”
    //“taramasalata” → “trmslt”

    public static String removeAllAs(String str2) {

        String string3 = "Строка пустая";

        if (str2.isEmpty() != true) {

            str2 = str2.trim().replace(String.valueOf("a"), "");
            System.out.println(str2);
            ;
            return str2;
        } else {

            System.out.println(string3);
            return string3;
        }
    }

    //3.Принимает на вход строку, состоящую из цифр. Если строка валидная, то метод удаляет все пробелы из строки,
    // если таковые имеются. Метод возвращает обработанную строку, в которой нет нулей. Если в строке не было нулей,
    // метод возвращает сообщение “This is a valid string”.
    // “3504209706040000 “ →  “35429764“
    //“0000000111“ → “111”
    public static String removeAllZeros(String str3) {

        String string3 = "Строка пустая";
        String string2 = "This is a valid string";

        if (str3.isEmpty() != true) {

            if (str3.contains("0")) {

                str3 = str3.trim().replace(String.valueOf("0"), "").replace(String.valueOf(" "), "");
                System.out.println(str3);
                return str3;
            } else {

                System.out.println(string2);
                return string2;
            }
        } else {

            System.out.println(string3);
            return string3;
        }
    }

    //4.принимает на вход строку. Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
    // Метод возвращает обработанную строку.
    // “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
    //“p a     n   d a   “ → “panda”
    public static String removeAllSpaces(String str4) {

        String string3 = "Строка пустая";

        if (str4.isEmpty() != true) {

            if (str4.contains(" ")) {

                str4 = str4.trim().replace(String.valueOf(" "), "");
                System.out.println(str4);
                return str4;
            }
        }

        System.out.println(string3);
        return string3;
    }
    //5.принимает на вход строку и считает, сколько букв а или А содержится в строке. Метод возвращает количество
    // букв a/A,  и количество букв/знаков в слове без букв a/A. Итоговый результат должен строится с помощью метода из видео 2.
    //“Abracadabra” → “5, 6”
    //“Homenum Revelio” → “0, 15”
    //“3 tarAmasAlatA” → “6, 8”

    public static int countAs(String str5) {

        String string3 = "Строка пустая";

        if (str5.isEmpty() != true) {

            int countA = 0;
            int countLetters = 0;
            for (int i = 0; i < str5.length(); i++) {

                if ((str5.charAt(i) == 'a') || (str5.charAt(i) == 'A')) {
                    countA++;
                } else {
                    countLetters++;
                }
            }
            if (countA != 0) {
                System.out.println(countA);
                return countA;
            } else {
                System.out.println(countLetters);
                return countLetters;
            }
        }
        System.out.println(string3);
        return 0;
    }
    //6.Принимает на вход текст и проверяет, содержится ли в тексте хотя бы одно слово Java.
    //Test Data:
    //“As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term support (LTS)
    // versions. Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January 2019 for
    // commercial use, although it will otherwise still support Java 8 with public updates for personal use indefinitely.
    // Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.” → true
    //“99 little bugs in a code.
    //99 little bugs in a code.
    //Take one down, and patch it around.
    //235 critical bugs in the code.” → false

    public static boolean countJava(String str6) {

        if (str6.contains("Java")) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }

    //7.принимает на вход название города и исправляет написание:
    //“ташкент” → “Ташкент”
    //“ЧикаГО” → “Чикаго”
    public static String changeTown(String str7) {
        str7 = str7.toLowerCase();
        str7 = str7.substring(0, 1).toUpperCase() + str7.substring(1);
        System.out.println(str7);
        return str7;
    }

    //8.принимает на вход две строки, и добавляет знак :  после слова “писал”,  и оборачивает в кавычки вторую строку
    //(результат строится с помощью метода concat())
    //“Федор Достоевский писал”, “Надо любить жизнь больше, чем смысл жизни.” →
    //“Федор Достоевский писал: "Надо любить жизнь больше, чем смысл жизни."”
    //Задание со звездочкой:
    //“Наполеон Бонапарт писал”, “В моем словаре нет слова «невозможно».” →
    //"Наполеон Бонапарт писал: "В моем словаре нет слова "невозможно".""
    public static String insertQuotes(String str81, String str82) {

        String str83 = ": ";
        String str84 = "\"";
        String str86 = str81 + str83 + str84 + str82 + str84;
        System.out.println(str86);
        return str86;
    }
    //9.принимает на вход строку и букву-параметр, и возвращает все, что находится между первой и последней буквой-параметром:
    //“Abracadabra”, “b” → “bracadab”
    //“Whippersnapper”, “p” → “ppersnapp”
    public static String betweenTheFirstAndTheLast(String str9, char a) {

        int firsiIndex = str9.indexOf(a);
        int lastIndex = str9.lastIndexOf(a);
        str9 = str9.substring(firsiIndex, lastIndex+1);
        System.out.println(str9);
        return str9;
    }

    //10.принимает на вход слово, и возвращает true, если слово начинается и заканчивается на одинаковую букву, и false иначе
    //	“Abracadabra” → true
    //	“Whippersnapper” → false
    public static boolean identicalLetters(String str10) {

        str10 = str10.toLowerCase();

        if (str10.charAt(0) == str10.charAt(str10.length()-1)) {

            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;
    }
    //11.принимает на вход строку из двух слов, разделенных пробелом, и возвращает последнее слово
    //	“Red Rover” → “Rover”
    public static String returnLastWorld (String str11) {

        int index = str11.indexOf(" ");
        str11 = str11.substring(index+1);
        System.out.println(str11);
        return str11;
    }
    //12.принимает строку, и 2 индекса. Метод удаляет все, что находится между двумя индексами включительно
    //	“Red rover”, 1, 4 → “Rover”
    public static String deleteBetweenIndexes(String str12, int index1, int index2) {

        str12 = str12.substring(0, index1) + str12.substring(index2+1);
        System.out.println(str12);
        return str12;
    }
    //13.Принимает на вход предложение и возвращает слова из этого предложения в виде массива слов
    //“QA for Everyone” → {“QA”, “for”, “Everyone”}
    //“Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}
    public static String[] arrayWords(String str13) {

          String[] words = str13.split(" ");
          System.out.println(Arrays.toString(words));
          return words;
    }
    //14.принимает на вход предложение, которое состоит из имени, фамилии, отчества и возвращает текст:
    //“Александр Сергеевич Пушкин” →
    //“Имя: Александр
    //Отчество: Сергеевич
    //Фамилия: Пушкин”
    public static String firstNameLastName(String str14) {

        String[] words = str14.split(" ");
        System.out.println("Имя: " + words[0]+ "\n" + "Отчество: " + words[1]+ "\n" + "Фамилия: " + words[2]);
        return ("Имя: " + words[0]+ "\n" + "Отчество: " + words[1]+ "\n" + "Фамилия: " + words[2]);
    }
    //15. принимает на вход слово и число n,  и возвращает строку, где слово повторяется n раз.
    //Test Data:
    //“one”, 5 → “oneoneoneoneone”
    public static String repeatN(String str15, int n) {

        str15 = str15.repeat(n);
        System.out.println(str15);
        return str15;
    }

    //16.принимает строку и index, и возвращает численное значение буквы, которая находится на позиции index
    // (использовать только один метод класса String)
//    public static int numberOfLetter(String str16, int index) {
//
//    }


    //17.принимает 3 слова, и сравнивает их методом, который считает, что прописные и заглавные буквы -
    // это одни и те же буквы. Метод возвращает true, если все слова одинаковы, и метод возвращает false,
    // если слова не одинаковы:
    //“one”, “One”, “ONE”  → true
    //“one”, “Один”, “ONE” → false
    public static boolean equalsString(String str171, String str172,String str173) {

        if (str171.equalsIgnoreCase(str172) && (str171.equalsIgnoreCase(str173))) {

            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }

    public static void main(String[] args) {
        //1.
        taskOfNumber();
        String str1 = "   panda   ";
        removeSpaces(str1);
        //2.
        taskOfNumber();
        String str2 = " panda   ";
        removeAllAs(str2);
        //3.
        taskOfNumber();
        String str3 = "3504209706040000 ";
        removeAllZeros(str3);
        //4.
        taskOfNumber();
        String str4 = "    R e d     Ro ve    r Sc   h ool   ";
        removeAllSpaces(str4);
        //5.
        taskOfNumber();
        String str5 = "Homenum Revelio";
        countAs(str5);
        //6.
        taskOfNumber();
        String str6 = "99 little bugs Java code.";
        countJava(str5);
        //7.
        taskOfNumber();
        String str7 = "ЧикаГО";
        changeTown(str7);
        //8.
        taskOfNumber();
        String str81 = "Федор Достоевский писал";
        String str82 = "Надо любить жизнь больше, чем смысл жизни.";
        insertQuotes(str81, str82);
        //9.
        taskOfNumber();
        String str9 = "Abracadabra";
        char a = 'b';
        betweenTheFirstAndTheLast(str9, a);
        //10.
        taskOfNumber();
        String str10 = "Abracadabra";
        identicalLetters(str10);
        //11.
        taskOfNumber();
        String str11 = "Red Rover";
        returnLastWorld(str11);
        //12.
        taskOfNumber();
        String str12 = "Red Rover";
        deleteBetweenIndexes(str12, 1, 4);
        //13.
        taskOfNumber();
        String str13 = "Александр Сергеевич Пушкин";
        arrayWords(str13);
        //14.
        taskOfNumber();
        String str14 = "Александр Сергеевич Пушкин";
        firstNameLastName(str14);
        //15.
        taskOfNumber();
        String str15 = "one";
        int n = 5;
        repeatN(str15, n);
        //16.

        //17.
        taskOfNumber();
        String str171 = "one";
        String str172 = "Один";
        String str173 = "ONE";
        equalsString(str171, str172, str173);

    }

}
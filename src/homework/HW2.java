package homework;

public class HW2 {

    public static void main(String[] args) {

        int number = 3;
        char subTask = 'a';
        int x = 5;
        int y = 10;
        int z = 15;

        int sum = x+y;
        int umn = x*z;
        int raz = y-z;

        int apple = 40;
        int student = 6;

        int peace = 100;
        int people = 21;

        int lemon = 6;
        int apple1 = lemon+24;
        int peach = apple1 -12;
        int fruits = lemon + apple1 + peach;

        System.out.println("_________________________________");
        System.out.println("Task " + number++);

        System.out.println("_________________________________");
        System.out.println("Task " + number++);
        System.out.println(subTask++ + ")");
        System.out.println(x + ", \n" + y + ", \n" + z);

        System.out.println(subTask++ + ")");
        System.out.println(x + ", " + y + ", " + z);

        System.out.println(subTask++ + ")");
        System.out.println("х = " + x + ", y = " + y + ", z = " + z);

        System.out.println("_________________________________");
        System.out.println("Task " + number++);
        System.out.println(x + ", " + y + ", " + z);

        System.out.println("_________________________________");
        System.out.println("Task " + number++);
        System.out.println("Sum of x and y = " + sum);
        System.out.println("x*z = " + umn);
        System.out.println("Разность переменнных y и z = " + raz);

        System.out.println("_________________________________");
        System.out.println("Task " + number++);
        System.out.println("Если " + apple + " яблок поделить на " + student
                + " учеников, то каждый ученик получит по " + apple/student + " яблок, и "
                + apple%student + " яблок(а) останется учителю");

        System.out.println("_________________________________");
        System.out.println("Task " + number++);
        System.out.println("Если " + peace + " яблок поделить на " + people
                + " учеников, то каждый ученик получит по " + peace/people + " яблок, и "
                + peace%people + " яблок(а) останется учителю");

        System.out.println("_________________________________");
        System.out.println("Task " + number++);
        System.out.println("Всего в ашкольную столовиую привезли " + fruits + " килограмм фруктов");

        int nout = 8;
        int gudat = 5;
        int hrom = 7;
        int bolat = 2;
        int vsegoBol = nout+gudat+hrom+bolat;
        int vsegoZdor = 40;
        int otvet = vsegoZdor-vsegoBol;

        System.out.println("_________________________________");
        System.out.println("Task " + number++);
        System.out.println("У сороконожки заболели ножки: \n" + nout + " ноют, " + gudat + " гудят, \n"
        + hrom + " хромают, " + bolat + " болят. \nПомоги сороканожке \nПосчитать здоровые ножки. \n" +
                "Ответ: " + otvet);

        int thityFive = 35;
        int seven = 7;
        int eight = 8;
        int fortyEight = 48;
        int fiftyFour = 54;
        int six = 6;
        int itog = fiftyFour-six;

        System.out.println("_________________________________");
        System.out.println("Task " + number++);
        System.out.println(thityFive + " больше чем " + seven + " в " + thityFive/seven + " раз.");
        System.out.println(eight + " меньше чем " + fortyEight + " в " + fortyEight/eight + " раз.");
        System.out.println(fiftyFour + " больше чем " + six + " на " + itog + ".");

        System.out.println("_________________________________");
        System.out.println("Task " + number++);

        int k = 5;
        int l = 6;
        int m =7;

        System.out.println("_________________________________");
        System.out.println("Task " + number++);

        System.out.println("----------------------------------------------------");
        System.out.println("| \t\t" + "|" + " +10 " + "|" + " -5 " + "|" + " *100 " + "|" + " /2 "
                + "|" + " %2 " + "|" + " ^2 " + "|" + " ++ " + "|" + " -- " + "|");
        System.out.println("-----------------------------------------------------");
        System.out.println("| " + "k = " + k + " | " + (k+10) + "  | " + (k-5) + "  | " + (k*100) + "  | " + (k/2)
                + "  | " + (k%2) + "  | " + (k*k)+ " | " + (++k) + "  | " + (--k) + "  |");
        System.out.println("| " + "l = " + l + " | " + (l+10) + "  | " + (l-5) + "  | " + (l*100) + "  | " + (l/2)
                + "  | " + (l%2) + "  | " + (l*l)+ " | " + (++l) + "  | " + (--l) + "  |");
        System.out.println("| " + "m = " + m + " | " + (m+10) + "  | " + (m-5) + "  | " + (m*100) + "  | " + (m/2)
                + "  | " + (m%2) + "  | " + Math.round(Math.pow(m,2)) + " | " + (++m) + "  | " + (--m) + "  |");

        System.out.println("_________________________________");
        System.out.println("Task " + number++);
        int x1 = 7;
        int y1 = 18;
        int n = 7*7*7;
       // double k1 = Math.round(Math.pow(x1,n));
      // double p = ((5*x1 + 7*y1)/(8*x1 + 10*y1)) / ((3*x1-y1)/(x1+y1));
      //  float p = ((5*x1) + (7*y1));
       System.out.println("x*x*x*((5x+7y)/(8x+10y))/((3x-y)/(x+y))="
               + (n*((5*x1 + 7*y1)*(x1+y1))/((8*x1 + 10*y1) * (3*x1-y1))));

        System.out.println("_________________________________");
        System.out.println("Task " + number++);


    }
}



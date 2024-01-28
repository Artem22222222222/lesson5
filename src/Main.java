public class Main {

    public static void main(String[] args) {
//        Task1(0);
//        Task1(100);
//        Task1(102);
//        Task1(125);
//        Task1(800017);
//        Task1(19125);
//        Task1(985111);
//        Task1(18219);
//          Task2_1();
//          Task2_2();
//        Task2_3();
//        Task2_4();
    }

    public static void Task1(int num) {
        String s = "";
        String and;
        String and2;
        String hundred;
        String[] base1 = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] base2 = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] base3 = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        if (num % 100 == 0)
            and = " ";
        else
            and = " and ";
        if (num % 100000 == 0) {
            and2 = " and ";
        } else {
            and2 = " ";
        }
        if (num % 100000 == 0 && num % 1000 != 0) {
            hundred = "";
        } else {
            hundred = "hundred";
        }
        if (num == 0)
            s = "zero";

        else if (num > 0 && num < 10)
            s = base1[num];

        else if (num > 9 && num < 20)
            s = base3[num % 10];

        else if (num > 19 && num < 100)
            s = base2[num / 10] + " " + base1[num % 10];

        else if (num / 10 % 10 == 1 && num < 1000) {
            s = base1[num / 100] + " hundred" + and + base3[num % 10];

        } else if (num < 1000) {
            s = base1[num / 100] + " hundred" + and + base2[num / 10 % 10] + " " + base1[num % 10];

        } else if (num / 10 % 10 == 1 && num / 10000 % 10 == 1 && num < 20000) {
            s = base3[num / 1000 % 10] + " thousand " + base1[num / 100 % 10] + " hundred" + and + base3[num % 10];

        } else if (num / 10 % 10 == 1 && num < 10000) {
            s = base1[num / 1000] + " thousand " + base1[num / 100 % 10] + " hundred" + and + base3[num % 10];

        } else if (num / 10000 % 10 == 1 && num < 20000) {
            s = base3[num / 1000 % 10] + " thousand " + base1[num / 100 % 10] + " hundred" + and + base2[num / 10 % 10] + " " + base1[num % 10];

        } else if (num < 10000) {
            s = base1[num / 10000] + " thousand " + base1[num / 100 % 10] + " hundred" + and + base2[num / 10 % 10] + " " + base1[num % 10];

        } else if (num / 10 % 10 == 1 && num < 100000) {
            s = base2[num / 10000] + " " + base1[num / 1000 % 10] + " thousand " + base1[num / 100 % 10] + " hundred" + and + base3[num % 10];

        } else if (num < 100000) {
            s = base2[num / 10000] + " " + base1[num / 1000 % 10] + " thousand " + base1[num / 100 % 10] + " hundred" + and + base2[num / 10 % 10] + " " + base1[num % 10];

        } else if (num < 1000000 && num / 10 % 10 == 1) {
            s = base1[num / 100000] + " hundred" + and2 + base2[num / 10000 % 10] + " " + base1[num / 1000 % 10] + " thousand " + base1[num / 100 % 10] + " " + hundred + and + base3[num % 10];
        } else if (num < 1000000) {
            s = base1[num / 100000] + " hundred" + and2 + base2[num / 10000 % 10] + " " + base1[num / 1000 % 10] + " thousand " + base1[num / 100 % 10] + " " + hundred + and + base2[num / 10 % 10] + " " + base1[num % 10];
        }
        System.out.println(s);
    }

    public static void Task2_1() {

        for (int y = 0; y < 10; y++) {

            for (int x = 1; x < 10; x++) {
                if (y == 9 || y == x && x > 4 || 9 - x == y && x < 5)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();

        }

    }

    public static void Task2_2() {

        for (int y = 0; y < 10; y++) {

            for (int x = 0; x < 10; x++) {
                if (x == 0 || y == x && y < 5 || 9 - x == y && y > 4)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();

        }
    }
    public static void Task2_3() {

        for (int y = 0; y < 10; y++) {

            for (int x = 0; x < 10; x++) {
                if (y == 0 || y == x && x < 5 || 9 - x == y && x > 4)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();

        }
    }
    public static void Task2_4() {

        for (int y = 0; y < 10; y++) {

            for (int x = 0; x < 10; x++) {
                if (x == 9 || y == x && y > 4 || 9 - x == y && y < 5)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();

        }
    }
}
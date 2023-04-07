public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задание1!");
        int humen = 30;
        if (humen >= 18) {
            System.out.println("Ты совершенолетний");
        } else {
            System.out.println("Не достиг совершенолетия.Придется подождать");
        }
        System.out.println("Задание3");
        int a = 60;
        if (a <= 60) {
            System.out.println("Все нормально");
        } else {
            System.out.println("Штраф");
        }

        int b = 90;
        if (b <= 60) {
            System.out.println("Все нормально");
        } else {
            System.out.println("Штраф");
        }
        System.out.println("Задание2");
        int warm = 5;
        if (warm <= 5) {
            System.out.println("Можно идти без шапки");
        } else {
            System.out.println("нужно надеть шапку");
        }
        int coil = 9;
        if (coil <= 5) {
            System.out.println("Можно идти без шапки");
        } else {
            System.out.println("нужно надеть шапку");
        }
        System.out.println("Задание4");
        int age = 4;
        if (age >= 2 && age < 6) {
            System.out.println("Если возраст человека равен 4 то ему нужно ходить в детский сад");
        }
        int ageShool = 10;
        if (ageShool >= 7 && ageShool < 18) {
            System.out.println(" Если возраст человека равен 10 то ему нужно ходить в школу ");
        }
        int student = 22;
        if (student >= 18 || student > 24) {
            System.out.println("Если возраст человека равен 22 то ему нужно ходить в университет");
        }
        int ageHumen = 26;
        if (ageHumen >= 26) {
            System.out.println("Если возраст человека равен 26 то ему нужно ходить на работу");
        }
        System.out.println("Задание5");
        int ageBoy = 4;
        if (ageBoy <= 5) {
            System.out.println("Если возраст ребенка равен 4 то ему нельзя кататься на атракционе");
        }
        int ageAtr = 10;
        if (ageAtr >= 5 && ageAtr <= 14) {
            System.out.println("Если возраст ребенка равен " + ageAtr + " то можно кататься на атракционе только в сопрвождении взрослого");
        }
        int bigBoy = 17;
        if (bigBoy >= 14) {
            System.out.println("Если ребенка старше 14 то ему можно кататься без сопровождения взослого");
        }
        System.out.println("Задание6");
        int poezd = 102;
        int vagon = 60;
        int step = 41;
        if (vagon + step <= poezd && step <= 102) {
            System.out.println(" Стоячие ");
        } else if (poezd + step == poezd) {
            System.out.println(" Cидячие места ");
        } else {
            System.out.println(" Мест нет");
        }

        System.out.println("задача7");
        int one = 1;
        int twu = 2;
        int three = 3;
        if (one >= twu && one >= three) {
            System.out.println(" Самоее большое число" + one);
        } else if (twu > one && twu > three) {
            System.out.println(" Самоее большое число " + twu);
        } else {
            System.out.println("Самоее большое число" + three);
        }
    }}
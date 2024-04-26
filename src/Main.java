//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("Задание 2");
        int temp = -12;
        if (temp > 5) {
            System.out.println("На улице " + temp + " градусов" + ", можно идти без шапки");
        } else {
            System.out.println("На улице " + temp + " градусов" + ", нужно надеть шапку");
        }
        System.out.println("задание 3");
        int speed = 61;
        boolean allowedSpeed = speed <= 60;
        if (allowedSpeed) {
            System.out.println("Если скорость " + speed + " км/ч,то можно ездить спокойно");
        } else {
            System.out.println("Еcли скорость " + speed + " км/ч,то придется заплатить штраф");
        }
        System.out.println("Задание 4");
        int age_1 = 45;
        boolean uncorrect = age_1 < 1 || age_1 > 110;
        if (age_1 >= 2 && age_1 <= 6) {
            System.out.println("Если возраст человека равен " + age_1 + " ,то ему нужно ходить в детский сад");
        } else if (age_1 > 6 && age_1 < 18) {
            System.out.println("Если возраст человека равен " + age_1 + " ,то ему нужно ходить в школу");
        } else if (age_1 >= 18 && age_1 <= 24) {
            System.out.println("Если возраст человека равен " + age_1 + " ,то ему нужно ходить в университет");
        } else if (uncorrect) {
            System.out.println("В данном возрасте тебя уже ничего не заботит");
        } else {
            System.out.println("Если возраст человека равен " + age_1 + " ,то ему нужно ходить на работу");
        }
        System.out.println("задание 5");
        int childAge = 4;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + " то ему нельзя кататься на аттракционе");
        } else if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + " то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println("Задание 6");
        int capacity = 102;
        int seats = 60;
        int passangersSeats = 61;
        if (passangersSeats < 60 && passangersSeats >= 0) {
            System.out.println("Количество свободных сидячих мест в вагоне - " + (seats - passangersSeats));
        } else {
            System.out.println("В вагоне не осталось сидячих мест");
        }
        int standing = capacity - seats;
        int passangersStanding = 45;
        if (passangersStanding >= 0 && passangersStanding < 42) {
            System.out.println("Количество свободных стоячих мест в вагоне - " + (standing - passangersStanding));
        } else {
            System.out.println("В вагоне не осталось стоячих мест");
        }
        boolean noSeats = (passangersSeats > 60 || passangersStanding > 42);
        if (noSeats) {
            System.out.println("В вагоне не осталось ни единого места для ещё одного пассажира");
        }
        System.out.println("Задание 7");
        int one = 1;
        int two = 2;
        int three = 3;
        boolean bigOne = (one > two && one > three);
        boolean bigTwo = (two > one && two > three);
        if (bigOne) {
            System.out.println("Переменная one является наибольшей");
        } else if (bigTwo) {
            System.out.println("Переменная two является наибольшей");
        } else {
            System.out.println("Переменная three является наибольшей");
        }
        // пытался сначала вот таким способом сделать, приведенным ниже, но никак не могу понять, почему оно не работает.
        // исправил на более простую логику, заработало надеюсь
        if (one > two && one > three) {
            System.out.println("Переменная one является наибольшей");
          } else if (two > one && two > three ) {
            System.out.println("Переменная two является наибольшей");
         } else if (three > one && three > two){
            System.out.println("Переменная three является наибольшей");
        }

    }
}
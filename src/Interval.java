import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        Scanner scn  = new Scanner(System.in);
        System.out.println("Введите число в диапазоне от 0 до 100: ");
        int over = scn.nextInt();

        if (over >= 0 && over <= 14) {
            System.out.println("Число " + over + " принадлежит диапазону [0 - 14]");

        } else if (over >= 15 && over <= 35) {
            System.out.println("Число " + over + " принадлежит диапазону [15 - 35]");
        } else if (over >= 36 && over <= 50) {
            System.out.println("Число " + over + " принадлежит диапазону [36 - 50]");
        } else if (over >= 50 && over <= 100) {
            System.out.println("Число " + over + " принадлежит диапазону [50 - 100]");
        }
        else  System.out.println("Число " + over + " не принадлежит диапазону [0 - 100]");
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первые координаты: ");
        double x1 = sc.nextInt();
        double y1 = sc.nextInt();
        System.out.print("Введите вторые координаты: ");
        double x2 = sc.nextInt();
        double y2 = sc.nextInt();

        double dist = calculateDistance(x1, y1, x2, y2);
        System.out.println("Дистанция: " + dist + " км");
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        int r = 6371;
        double dx = Math.toRadians(x2- x1);
        double dy = Math.toRadians(y2 - y1);
        double a = Math.sin(dx / 2) * Math.sin(dy / 2) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.sin(dy / 2) * Math.sin(dy / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return r * c;
    }
}
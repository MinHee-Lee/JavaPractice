package chap06;
import chap06.Point;

public class ToStirngEx{
    public static void main(String[] args) {
        Point p = new Point(2,3);
        System.out.println(p.toString());
        System.out.println(p);
        System.out.println(p + "입니다.");
    }
}

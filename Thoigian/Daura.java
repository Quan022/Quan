package Thoigian;


public class Daura {
    public static void main(String[] args) {
        Time t = new Time(11, 6, 5);
        t.display();
        t.setTime(17, 42, 18);
        t.display();
        t.nextSecond();
        t.display();
        t.nextSecond();
        t.display();
        t.setTime(5, 3, 3);
        t.display();
        t.previousSecond();
        t.display();
    }
}
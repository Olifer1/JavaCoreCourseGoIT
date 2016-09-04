package module3.homework.task2;

public class Main {
    public static void main(String[] args) {
        int a = 400;
        int b = 600;
        Adder WeirdObj = new Adder();
        System.out.println(WeirdObj.add(a, b));
        System.out.println(WeirdObj.check(a, b));
    }
}

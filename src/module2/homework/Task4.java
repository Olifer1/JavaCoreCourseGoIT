package module2.homework;

public class Task4 {
    static double fundOwn(double balances[], String ownerNames[], double fund, String ownerName) {
        int count = 0;
        for (int i = 0; i < ownerNames.length; i++)
            if (ownerNames[i] == ownerName) {
                count = i;
                break;
            }
        return (balances[count] + fund);
    }

    public static void main(String[] args) {
        String ownerNames [] = {"Taras", "Ivan", "Oleg", "Olga", "Andriy", "Stepan"};
        double balances [] = {1000, 890, 500, 1200, 50, 350};
        String ownerName = "Stepan";
        double fund = 1800;
        System.out.println("Dear "+ ownerName + " your account has been credited");
        System.out.println("New balance = " + fundOwn(balances, ownerNames, fund, ownerName));

    }
}

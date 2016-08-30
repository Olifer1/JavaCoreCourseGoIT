package module2.homework;

public class Task3 {

    static double withdOwn(double balances[], String ownerNames[], double withdrawal, String ownerName,
                            double commission) {
        int count = 0;
        for (int i = 0; i < ownerNames.length; i++)
            if (ownerNames[i] == ownerName) {
                count = i;
                break;
            }
        return (balances[count] - withdrawal - balances[count]*commission);
    }

    public static void main(String[] args) {
        String ownerNames [] = {"Taras", "Ivan", "Oleg", "Olga", "Andriy", "Stepan"};
        double balances [] = {1000, 890, 500, 1200, 50, 350};
        double commission = 0.05;
        String ownerName = "Olga";
        double withdrawal = 1400;
        if ((withdOwn(balances, ownerNames, withdrawal, ownerName, commission) >= 0)) {
            System.out.println("Successful transaction for "+ ownerName);
            System.out.println("Balance = " + withdOwn(balances, ownerNames, withdrawal, ownerName, commission));
            System.out.println("Commission = " + commission*100 + " %");
        }
        else
            System.out.println("Dear " + ownerName +  ", you don't have enough money for transaction");
    }
}


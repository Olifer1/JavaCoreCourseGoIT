package module2.homework;

public class Task2 {
    static double transWithd (double balance, double withdrawal, double commission) {
        return (balance - withdrawal - balance*commission);
    }

    public static void main(String[] args) {
        double balance = 100;
        double withdrawal = 80;
        double commission = 0.05;
        if (transWithd(balance, withdrawal, commission) >= 0) {
            System.out.println("Successful transaction, balance = " + transWithd(balance, withdrawal, commission));
            System.out.println("Commission = " + commission*100 + " %");
        }
        else
            System.out.println("Not enough money for transaction");
    }
}

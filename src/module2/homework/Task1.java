package module2.homework;

public class Task1 {

    static int sumInt (int array1[]) {//Sum of all elements Int
        int sum = 0;
        for (int i=0; i < array1.length; i++)
            sum += array1[i];
        return(sum);
    }
    static double sumDouble (double array1[]) {//Sum of all elements Double
        double sum = 0;
        for (int i=0; i < array1.length; i++)
            sum += array1[i];
        return(sum);
    }
    static int minInt (int array1[]){//Minimum of all elements Int
        int minArr = array1[0];
        for (int i=0; i < array1.length; i++)
            if (array1[i] < minArr)
                minArr = array1[i];
        return(minArr);
    }
    static double minDouble (double array1[]){//Minimum of all elements Double
        double minArr = array1[0];
        for (int i=0; i < array1.length; i++)
            if (array1[i] < minArr)
                minArr = array1[i];
        return(minArr);
    }
    static int maxInt (int array1[]) {//Maximum of all elements Int
        int maxArr = array1[0];
        for (int i = 0; i < array1.length; i++)
            if (array1[i] > maxArr)
                maxArr = array1[i];
        return (maxArr);
    }

    static double maxDouble (double array1[]) {//Maximum of all elements Double
        double maxArr = array1[0];
        for (int i = 0; i < array1.length; i++)
            if (array1[i] > maxArr)
                maxArr = array1[i];
        return (maxArr);
    }

    static int maxPosInt (int array1[]) {//Maximum of positive elements Int
        int maxArr = array1[0];
        for (int i = 0; i < array1.length; i++)
            if (array1[i] > maxArr && array1[i] > 0)
                maxArr = array1[i];
        return (maxArr);
    }

        static double maxPosDouble (double array1[]) {//Maximum of positive elements Double
        double maxArr = array1[0];
        for (int i = 0; i < array1.length; i++)
            if (array1[i] > maxArr && array1[i] > 0)
                maxArr = array1[i];
        return (maxArr);
    }

    static long multInt (int array1[]) {//Multiplication of all elements Int
        long multArr = 1;
        for (int i = 0; i < array1.length; i++)
            multArr *= array1[i];
        return (multArr);
    }

    static double multDouble (double array1[]) {//Multiplication of all elements Double
        double multArr = 1;
        for (int i = 0; i < array1.length; i++)
            multArr *= array1[i];
        return (multArr);
    }

    static int modulInt (int array1[]) {// Modulus int
        int a = array1[0];
        int z = array1[array1.length-1];
        return (a/z);
    }

    static double modulDouble (double array1[]) {// Modulus double
        double a = array1[0];
        double z = array1[array1.length-1];
        return (a/z);
    }

    static int secMaxInt (int array1[]) {//Second largest of all elements Int
        int secMax = minInt(array1);
        for (int i = 0; i < array1.length; i++)
            if (array1[i] != maxInt(array1))
                if (array1[i] > secMax)
                     secMax = array1[i];
        return (secMax);
    }

    static double secMaxDoub(double array1[]) {//Second largest of all elements Double
        double secMax = minDouble(array1);
        for (int i = 0; i < array1.length; i++)
            if (array1[i] != maxDouble(array1))
                if (array1[i] > secMax)
                    secMax = array1[i];
        return (secMax);
    }

    public static void main(String[] args) {
        int array1[] = { 40, -35, -5, 25, 10, 85, 70, 1, 105, 60 };
        double array2[] = { 400.5, -350.5, -50.3, 250.7, 100.6, 850.4, 700.8, 0.2, 1050, 60.1};

        System.out.println("Sum of all elements = " + sumInt(array1));
        System.out.println("Sum of all elements = " + sumDouble(array2));
        System.out.println("Minimum of all elements = " + minInt(array1));
        System.out.println("Minimum of all elements = " + minDouble(array2));
        System.out.println("Maximum of all elements = " + maxInt(array1));
        System.out.println("Second largest of all elements = " + secMaxInt(array1));
        System.out.println("Maximum of all elements = " + maxDouble(array2));
        System.out.println("Second largest of all elements = " + secMaxDoub(array2));
        System.out.println("Maximum of positive elements = " + maxPosInt(array1));
        System.out.println("Maximum of positive elements = " + maxPosDouble(array2));
        System.out.println("Multiplication of all elements = " + multInt(array1));
        System.out.println("Multiplication of all elements = " + multDouble(array2));
        System.out.println(array1[0]+" / " + array1[array1.length-1] + " = " + modulInt(array1));
        System.out.println(array2[0]+" / " + array2[array1.length-1] + " = " + modulDouble(array2));

    }
}

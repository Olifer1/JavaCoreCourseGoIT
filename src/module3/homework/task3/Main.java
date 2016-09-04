package module3.homework.task3;

public class Main {
    public static void main(String[] args) {
        Course [] subject = new Course[5];
        subject[0]  = new Course("English", 40, "Ivanova");
        subject [1] = new Course("Biology", 60, "Petrova");
        subject [2] = new Course("Chemistry", 80, "Smirnova");
        subject [3] = new Course("History", 20, "Melnik");
        subject [4] = new Course("Literature", 10, "Shevchenko");
        Student studVaculko = new Student("Mykhaylo", "Vaculko", 1);
        Student studMischuk = new Student("Mischuk", subject);
        CollegeStudent studOlifer = new CollegeStudent("Petro", "Olifer", 2);
        CollegeStudent studRoman = new CollegeStudent("Romanenko", subject);
        CollegeStudent studZhuk = new CollegeStudent("Anna", "Zhuk", 3, "KNU", 25, 123456789);
        SpecialStudent studKurch = new SpecialStudent("Ivan", "Kurchenko", 8);
        SpecialStudent studZayets = new SpecialStudent("Zayets", subject);
        SpecialStudent studKalina = new SpecialStudent("Inna", "Kalynova", 3, "KPI", 25, 987654321, 564879023);

        System.out.println(studOlifer.getLastName()+" group "+studOlifer.getGroup());

    }
}

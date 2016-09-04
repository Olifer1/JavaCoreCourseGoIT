package module3.homework.task3;

class SpecialStudent extends CollegeStudent{
    private long secretKey;
    private String email;

    SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    SpecialStudent(String firstName, String lastName, int group, String collegeName,
                          int rating, long id, long secretKey) {
        super(firstName, lastName, group, collegeName, rating, id);
        this.secretKey = secretKey;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


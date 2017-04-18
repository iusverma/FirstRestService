package Hello;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String sex;
    private boolean married;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public void populateUserData(String username) {
        if (username.equalsIgnoreCase("ayush")) {
            populateUserData(username, "Verma", 30, "Male", true);
        } else if (username.equalsIgnoreCase("megha")) {
            populateUserData(username, "Verma", 27, "Female", true);
        } else {
            populateUserData(username, "not known", -1, "M/F/X", false);
        }
    }

    private void populateUserData(String firstName,
            String lastName,
            int age,
            String sex,
            boolean isMarried) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSex(sex);
        this.setMarried(isMarried);
    }
}

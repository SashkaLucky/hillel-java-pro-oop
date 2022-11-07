package work.employee;

public class Employee {
    private String fullName;
    private String position;
    private int age;
    private String email;
    private String phoneNumber;


    public Employee(String fullName, String position, int age, String email, String phoneNumber) {
        this.fullName = fullName;
        this.position = position;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Employee(String fullName) {
        this.fullName = fullName;
        this.age = 1;
    }

    private Employee() {
        this("UNKNOWN");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0){
            return;
        }
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void printFullName(){
        System.out.println(fullName);
    }
}


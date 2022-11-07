package employee;

public class Employee {
    private String fullName;
    private String position;
    private int age;



    public Employee(String fullName, String position, int age) {
        this.fullName = fullName;
        this.position = position;
        this.age = age;
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
        this.age = age;
    }
}


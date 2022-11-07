import work.employee.Employee;

public class sameName {
    public static void main(String[] args) {
        Employee John = new Employee("John Wick");
        String fullName = John.getFullName();
        String position = John.getPosition();
        int age = John.getAge();
        String email = John.getEmail();
        String phoneNumber = John.getPhoneNumber();


        John.setFullName("Jon Wick");
        John.setPosition("Junior Java Developer");
        John.setAge(28);
        John.setEmail("JWick@gmail.com");
        John.setPhoneNumber("+380996699666");
    }
}

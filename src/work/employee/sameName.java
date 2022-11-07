package work.employee;

public class sameName {
    public static void main(String[] args) {
        Employee Lora = new Employee("Lora Wick");
        String fullName = Lora.getFullName();
        String position = Lora.getPosition();
        int age = Lora.getAge();
        String email = Lora.getEmail();
        String phoneNumber = Lora.getPhoneNumber();


        Lora.setFullName("Lora Wick");
        Lora.setPosition("Middle Java Developer");
        Lora.setAge(25);
        Lora.setEmail("LoraWick@gmail.com");
        Lora.setPhoneNumber("+380996699888");
    }
}
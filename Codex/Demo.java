package Codex;



public class Demo {
    public static void main(String[] args) {
        Student svA = new Student();
        svA.rollNumber = "A001";
        svA.fullName = "Anna Johnson";
        svA.email = "anna.johnson@example.com";
        svA.phone = "0123456789";
        svA.gpa = 5;
        svA.introduce();

        Student svB = new Student();
        svB.rollNumber = "B002";
        svB.fullName = "Brian Smith";
        svB.email = "Brain273@gmail.com";
        svB.phone = "0987654321";
        svB.gpa = 4;
        svB.introduce();
    }
}
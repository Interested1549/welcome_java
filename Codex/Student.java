package Codex;




public class Student {
    public String rollNumber;
    public String fullName;
    public String email;
    public String phone;
    public int gpa;
    public void introduce(){
        System.out.println("my name is " + fullName);
        System.out.println("my student ID is " + rollNumber);
        System.out.println("my email is " + email);
        System.out.println("my phone number is " + phone);
        System.out.println("my cumulative grade point average is " + gpa);
    }
}

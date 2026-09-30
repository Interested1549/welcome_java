package code;

import Codex.Student;

public class codex {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Student svJ = new Student();
        svJ.rollNumber = "A002";
        svJ.fullName = "John Smith";
        svJ.email = "JohnStudent@gmail.com";
        svJ.phone = "0987654321";
        svJ.gpa = 5;
        svJ.introduce();
    }

}

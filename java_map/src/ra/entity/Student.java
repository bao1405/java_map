package ra.entity;

import java.util.Scanner;

public class Student {
    private String StudentId;
    private String StudentName;
    private int age;
    private float avg;

    public Student() {
    }

    public Student(String studentId, String studentName, int age, float avg) {
        StudentId = studentId;
        StudentName = studentName;
        this.age = age;
        this.avg = avg;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    public void inputData(Scanner scanner) {
        System.out.println("nhập vào thông tin sinh viên:");
        System.out.println("Mã sinh viên: ");
        String StudentId = scanner.nextLine();
        System.out.println("Tên sinh viên: ");
        String StudentName = scanner.nextLine();
        System.out.println("tuổi sinh viên :");
        int age = scanner.nextInt();
        System.out.println("nhập điểm trung bình của sinh viên:");
        float avg = scanner.nextFloat();
    }

    @Override
    public String toString() {
        return "Student{" + "studentID=" + StudentId + ", name=" + StudentName + ", age=" + age + ", avgScore=" + avg + '}';
    }
}



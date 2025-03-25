package ra.presentation;

import static ra.presentation.StudentManagement.student;
import java.util.Scanner;

public class Studentbusiness {
    public static void Studentadd(Scanner scanner) {
        System.out.println("Nhập số lượng sinh viên cần thêm: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập mã sinh viên: ");
            String StudentId = scanner.nextLine();
            scanner.nextLine();
            System.out.print("Nhập tên sinh viên: ");
            String StudentName = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Nhập tuổi sinh viên:");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("nhập điểm trung bình sinh viên:");
            float avg = scanner.nextFloat();
        }
    }

    public static void StudentDelete(Scanner scanner) {
        System.out.println("nhập mã sinh viên cần xóa");
        String id = scanner.nextLine();
        scanner.nextLine();
        if (student.remove(id) != null) {
            System.out.println("sinh viên đã dược xóa!");
        } else {
            System.out.println("sinh viên không tồn tại.");
        }
    }

}

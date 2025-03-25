package ra.presentation;
import java.util.*;
import ra.entity.Student;
import ra.presentation.Studentbusiness;
public class StudentManagement {
    public static Map<String, Student> student = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("------------------------ Menu --------------------------");
            System.out.println("1. danh sách sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. xóa sinh viên theo mã sản phẩm");
            System.out.println("4. Tính điểm trung bình của tất cả sinh viên");
            System.out.println("5. In thông tin sinh viên có điểm trung bình lớn nhất");
            System.out.println("6. In thng tin sinh viên có tuổi lớn nhất");
            System.out.println("7. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(student);
                    break;
                case 2:
                    Studentbusiness.Studentadd(scanner);
                    break;
                case 3:
                    Studentbusiness.StudentDelete(scanner);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    return;
                default:
                    System.err.println("Vui lòng chọn từ 1 - 5");
            }
        } while (true);
    }
}

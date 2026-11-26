import java.util.ArrayList;

public class Main {
    public static Student timKiemTheoMa(ArrayList<Student> ds, String maCanTim) {
        for (Student sv : ds) {
            if (sv.getMaSV().equalsIgnoreCase(maCanTim)) {
                return sv;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayList<Student> ds = new ArrayList<>();
        ds.add(new Student("SV001", "Quach Trung Hieu", "09/12/2005"));
        ds.add(new Student("SV002", "Nguyen Van A", "01/01/2005"));

        Student ketQua = timKiemTheoMa(ds, "SV001");
        if (ketQua != null) {
            System.out.println("Tim thay sinh vien:");
            ketQua.display();
        } else {
            System.out.println("Khong tim thay sinh vien.");
        }
    }
}
// Bo sung hoan thien tinh nang tim kiem

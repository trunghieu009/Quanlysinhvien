// Lop Student - Sua tren nhanh feature
public class Student {
    private String maSV;
    private String hoTen;
    private String ngaySinh;

    public Student(String maSV, String hoTen, String ngaySinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void display() {
        System.out.println("Ma SV: " + maSV + " | Ho ten: " + hoTen + " | Ngay sinh: " + ngaySinh);
    }
}

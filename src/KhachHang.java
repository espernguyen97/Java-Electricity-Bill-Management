import java.util.Scanner;

public class KhachHang {

	// 1. Attributes
	
	protected int maKH;
	protected String hoTenKH;
	protected int ngayHoaDon;
	protected int thangHoaDon;
	protected int namHoaDon;
	protected float soluongKWTieuThu;
	protected float donGia;
	protected float thanhTien;

	// 2. Get, set
	public int getMaKH() {
		return maKH;
	}

	public void setMaKH(int maKH) {
		this.maKH = maKH;
	}

	public String getHoTenKH() {
		return hoTenKH;
	}

	public void setHoTenKH(String hoTenKH) {
		this.hoTenKH = hoTenKH;
	}

	public int getNgayHoaDon() {
		return ngayHoaDon;
	}

	public void setNgayHoaDon(int ngayHoaDon) {
		this.ngayHoaDon = ngayHoaDon;
	}

	public int getThangHoaDon() {
		return thangHoaDon;
	}

	public void setThangHoaDon(int thangHoaDon) {
		this.thangHoaDon = thangHoaDon;
	}

	public int getNamHoaDon() {
		return namHoaDon;
	}

	public void setNamHoaDon(int namHoaDon) {
		this.namHoaDon = namHoaDon;
	}

	public float getSoluongKWTieuThu() {
		return soluongKWTieuThu;
	}

	public void setSoluongKWTieuThu(float soluongKWTieuThu) {
		this.soluongKWTieuThu = soluongKWTieuThu;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public float getThanhTien() {
		return thanhTien;
	}

	// 3. constructors

	public KhachHang() {
		this.thanhTien = 0;
	}

	public KhachHang(int maKH, String hoTenKH, int ngayHoaDon, int thangHoaDon, int namHoaDon,
			float soluongKWTieuThu, float donGia) {
		super();
		this.maKH = maKH;
		this.hoTenKH = hoTenKH;
		this.ngayHoaDon = ngayHoaDon;
		this.thangHoaDon = thangHoaDon;
		this.namHoaDon = namHoaDon;
		this.soluongKWTieuThu = soluongKWTieuThu;
		this.donGia = donGia;
	}

	// 4. input, output
	public void nhap(Scanner scan) {
		System.out.print("Nhập mã khách hàng: ");
		this.maKH = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập họ tên khách hàng: ");
		this.hoTenKH = scan.nextLine();
		System.out.print("Nhập ngày của hóa dơn: ");
		this.ngayHoaDon = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập tháng của hóa dơn: ");
		this.thangHoaDon = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập năm của hóa dơn: ");
		this.namHoaDon = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập số lượng KW điện tiêu thụ: ");
		this.soluongKWTieuThu = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập đơn giá: ");
		this.donGia = Float.parseFloat(scan.nextLine());

	}

	public void xuat() {
			System.out.print("Mã khách hàng: " + this.maKH 
							+"\t Họ tên khách hàng: " + this.hoTenKH
							+"\t Ngày trên hóa đơn : " + this.ngayHoaDon
							+"\t tháng trên hóa đơn : " + this.thangHoaDon
							+"\t năm trên hóa đơn : " + this.namHoaDon
							+"\t Số lượng KW điện tiêu thụ: " + this.soluongKWTieuThu
							+ "\t Đơn giá: " + this.donGia);
		}

}
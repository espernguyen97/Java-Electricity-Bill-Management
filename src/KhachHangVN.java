import java.util.Scanner;

public class KhachHangVN extends KhachHang {
	// 1. attributes
	public static int DINHMUC = 100;
	private int doiTuong;
	// 2. get, set

	public int getDoiTuong() {
		return doiTuong;
	}

	public void setDoiTuong(int doiTuong) {
		this.doiTuong = doiTuong;
	}

	// 3. constructors
	public KhachHangVN() {
		super();
	}

	public KhachHangVN(int maKH, String hoTenKH, int ngayHoaDon, int thangHoaDon, int namHoaDon,
			float soluongKWTieuThu, float donGia, int doiTuong) {
		super(maKH, hoTenKH, ngayHoaDon, thangHoaDon, namHoaDon, soluongKWTieuThu, donGia);
		this.doiTuong = doiTuong;
	}

	// 4. input, output
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		boolean flag = true;
		do {
			System.out.println("Nhập đối tượng sử dụng: ");
			System.out.println("1. Sinh hoạt");
			System.out.println("2. Kinh doanh");
			System.out.println("3. Sản xuất");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				this.doiTuong = 1;
				break;
			case 2:
				this.doiTuong = 2;
				break;
			case 3:
				this.doiTuong = 3;
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Vui lòng chọn 1,2 hoặc 3.");
			}
		} while (!flag);
	}

	@Override
	public void xuat() {
		super.xuat();
		if (this.doiTuong == 1) {
			System.out.println("\t Đối tượng khách hàng: Sinh Hoat  " + "\t Tổng hóa đơn: " + this.thanhTien);
		} else if (this.doiTuong == 2) {
			System.out.println("\t Đối tượng khách hàng: Kinh Doanh  " + "\t Tổng hóa đơn: " + this.thanhTien);
		} else {
			System.out.println("\t Đối tượng khách hàng: Sản xuất  " + "\t Tổng hóa đơn: " + this.thanhTien);
		}
	}
	// 5. business methods

	public void tinhHoaDonVietnamese() {
		if (this.soluongKWTieuThu <= DINHMUC) {
			this.thanhTien = this.soluongKWTieuThu * this.donGia;
		} else {
			this.thanhTien = this.donGia * DINHMUC + (this.soluongKWTieuThu - DINHMUC) * this.donGia * 2.5f;
		}
	}

}

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		DanhSachHoaDon objDSHD = new DanhSachHoaDon();
		Scanner scan = new Scanner(System.in);
		objDSHD.dummyData();
		
		objDSHD.nhap(scan);
		objDSHD.init();
		
		System.out.println("***************Danh sách khách hàng*******");
		objDSHD.xuat();
		System.out.println("***************Xuất hóa đơn trong tháng 9 năm 2013****************");
		objDSHD.xuatHDTheoThoiGian();

	}

}

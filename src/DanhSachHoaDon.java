import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachHoaDon {
	// 1. attributes
		private ArrayList<KhachHang> listKhachHang;
		private int SlVietnamese;
		private int SlForeigner;
		private float TbHoaDonForeigner;
		private float hoaDonVietnamese;
		private float hoaDonForeigner;
		
		// 2, get, set
		public ArrayList<KhachHang> getListKhachHang() {
			return listKhachHang;
		}
		
		public void setListKhachHang(ArrayList<KhachHang> listKhachHang) {
			this.listKhachHang = listKhachHang;
		}

		public int getSlVietnamese() {
			return SlVietnamese;
		}
		public int getSlForeigner() {
			return SlForeigner;
		}
		public float getTbHoaDonForeigner() {
			return TbHoaDonForeigner;
		}
		public float getHoaDonVietnamese() {
			return hoaDonVietnamese;
		}
		public float getHonDonForeigner() {
			return hoaDonForeigner;
		}
		
		// 3. constructors
		public DanhSachHoaDon() {
			listKhachHang = new ArrayList<KhachHang>();
		}
		
		// 4. input, out
		public void nhap(Scanner scan) {
			boolean flag = true;
			KhachHang khachHang;
			do {
				System.out.println("Vui lòng chọn đối tượng khách hàng theo quốc tịch");
				System.out.println("Nhập 1. Khách hàng Việt Nam");
				System.out.println("Nhập 2. Khách hàng nước ngoài");
				System.out.println("Nhập 0. Thoát");
				int chon = Integer.parseInt(scan.nextLine());
				switch (chon) {
				case 1:
					khachHang = new KhachHangVN();
					khachHang.nhap(scan);
					this.listKhachHang.add(khachHang);				
					break;
				case 2:
					khachHang = new KhachHangNuocNgoai();
					khachHang.nhap(scan);
					this.listKhachHang.add(khachHang);
					break;
				case 0:
					flag = false;
					break;
				}
			} while (flag);
		}
		
		public void xuat() {
			for (KhachHang kh : this.listKhachHang) {
				kh.xuat();
			}
			System.out.println("**********************************");
			System.out.println("Tổng số hóa đơn của khách hàng Việt Nam: \t" + this.SlVietnamese);
			System.out.println("Tổng số hóa đơn của khách hàng nước ngoài: \t" + this.SlForeigner);
			System.out.println("**********************************");
			System.out.println("Trung bình hóa đơn của khách hàng nước ngoài:\t" + this.TbHoaDonForeigner);
			System.out.println("**********************************");
		}
		

		public void init() {
			tinhSlVietnamese();
			tinhSlForeigner();
			tinhHDVietnamese();
			tinhHDForeigner();
			tinhTbHoaDonForeigner();
		}
		

		public void tinhHDVietnamese() {
			for (KhachHang kh : this.listKhachHang) {
				if (kh instanceof KhachHangVN) { 
					((KhachHangVN) kh).tinhHoaDonVietnamese();
				}
			}
		}
		
		public void tinhHDForeigner() {
			for (KhachHang kh : this.listKhachHang) {
				if (kh instanceof KhachHangNuocNgoai) { 
					((KhachHangNuocNgoai) kh).tinhHoaDonForeigner();
				}
			}
		}
		
		public void tinhSlVietnamese() {
			this.SlVietnamese =0;
			for (KhachHang kh : this.listKhachHang) {
				if (kh instanceof KhachHangVN) { 
					this.SlVietnamese++;
				}
			}
			
		}
		
		public void tinhSlForeigner() {
			this.SlForeigner =0;
			for (KhachHang kh : this.listKhachHang) {
				if (kh instanceof KhachHangNuocNgoai) { 
					this.SlForeigner++;
				}
			}
			
		}
		
		public void tinhTbHoaDonForeigner() {
			this.hoaDonForeigner =0;
			this.TbHoaDonForeigner = 0;
			for (KhachHang kh : this.listKhachHang) {
				if (kh instanceof KhachHangNuocNgoai) { 
					this.hoaDonForeigner += kh.getThanhTien();
				}
			}
			this.TbHoaDonForeigner = this.hoaDonForeigner/this.SlForeigner;
			
		}
		
		public void xuatHDTheoThoiGian() {
			for (KhachHang kh : this.listKhachHang) {
				if (kh.thangHoaDon == 9 && kh.namHoaDon == 2013) {
					kh.xuat();
				}
			}
		}
		
		public void dummyData() {
			KhachHang kh;
			kh = new KhachHangVN(1, "Han", 1, 9, 2013, 10, 10, 1);
			this.listKhachHang.add(kh);
			this.listKhachHang.add(kh);
			kh = new KhachHangVN(1, "Tra", 1, 9, 2013, 10, 10, 1);
			this.listKhachHang.add(kh);
			kh = new KhachHangVN(2, "Cam", 1, 9, 2013, 10, 10, 1);
			this.listKhachHang.add(kh);
			kh = new KhachHangNuocNgoai(4,"Peach",6,9,2013,10,10,"USA");
			this.listKhachHang.add(kh);
			kh = new KhachHangNuocNgoai(5,"Orange",7,7,2013,20,20,"China");
			this.listKhachHang.add(kh);
			kh = new KhachHangNuocNgoai(4,"Jackfruit",6,9,2013,30,30,"Thailand");
			this.listKhachHang.add(kh);


		}
		
}

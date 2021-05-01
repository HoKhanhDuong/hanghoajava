package HangHoa;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	private static void HangThucPham(HangThucPham tp) {
		int a;
		int count=0;

		Scanner sc = new Scanner(System.in);
		tp = new HangThucPham();
		tp.nhap();
		System.out.println("------------/---------------/------------"); 
	    System.out.println(tp.toString()); 
	    System.out.println("------------/---------------/------------"); 
	}
	
	private static void HangDienTu(HangDienTu dt) {
		int a;
		int count=0;

		Scanner sc = new Scanner(System.in);
		dt = new HangDienTu();
		dt.nhap();
		System.out.println("------------/---------------/------------"); 
	    System.out.println(dt.toString()); 
	    System.out.println("------------/---------------/------------"); 
	}

	public static void main(String[] args) {
		int a;
		HangThucPham tp = new HangThucPham();
		HangDienTu dt = new HangDienTu();
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("1. Nhập, xuất một hàng thực phẩm (bao gồm giá)\n"
				+ "2. Nhập, xuất một hàng điện tử (bao gồm giá)\n"
				+ "3. Xây dựng lớp CỬA HÀNG để quản lý danh sách các sản phẩm\n"
				+ "4. Nhập xuất danh sách các sản phẩm\n"
				+ "5. Tìm sản phẩm có giá thấp nhất trong danh sách \n"
				+ "Nhập lựa chọn của bạn: "
				);
		a = sc.nextInt();
		
		switch (a) {
		case 1:
			HangThucPham(tp);
			break;
		case 2:
			HangDienTu(dt);
			break;
		case 3:
	
			break;

		default:
			break;
		}
		}while(a!=0);
	}

}

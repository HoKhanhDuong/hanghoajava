package HangHoa;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	private static void HangThucPham() {
		int a;
		int count=0;
		HangThucPham[] tp = new HangThucPham[100];

		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("1. Nhập hàng thực phẩm\n"
				+ "2. Xuất hàng thực phẩm\n"
				+ "3. Danh sách thực phẩm\n"
				+ "0. Quay lại\n"
				+ "Nhập lựa chọn của bạn: "
				);
		a = sc.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("Nhập số lượng hàng thực phẩm bạn muốn nhập vào: ");
			int b =sc.nextInt();
			count += b;
			for(int i =0; i<b; i++) {
				tp[i] = new HangThucPham();
				tp[i].nhap();
			}
			
			break;
		case 2:
			String maSP;
			System.out.println("Nhập mã sản phẩm bạn muốn xuất: ");
			sc.nextLine();
			maSP = sc.nextLine();
			for(int i= 0,j = 0; i< count; i++) {
				if(!tp[i].maSP.equals(maSP) ) {
					
				}
			}
			break;
		case 3:
			for(int i=0; i<count; i++) {
				System.out.println("------------/---------------/------------"); 
			    System.out.println(tp[i].toString()); 
			    System.out.println("------------/---------------/------------"); 
			}
			break;

		default:
			break;
		}
		}while(a!=0);
	}

	public static void main(String[] args) {

		ArrayList<HangHoa> list = new ArrayList<HangHoa>();
		
		int a;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("1. Toàn bộ hàng hóa\n"
				+ "2. Hàng thực phẩm\n"
				+ "3. Hàng điện tử\n"
				+ "0. Thoát\n"
				+ "Nhập lựa chọn của bạn: "
				);
		a = sc.nextInt();
		
		switch (a) {
		case 1:
			
			break;
		case 2:
			HangThucPham();
			break;
		case 3:
	
			break;

		default:
			break;
		}
		}while(a!=0);
	}

}

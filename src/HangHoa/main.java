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

	private static ArrayList<HangHoa> importList(){
		int number;
		Scanner sc = new Scanner(System.in);

		ArrayList<HangHoa> list = new ArrayList<HangHoa>();

		System.out.println("So luong hang muon nhap\n");
		number = sc.nextInt();
		int c;

		for(int i=0; i<number; i++){
			System.out.println("1. Nhập hàng thực phẩm (bao gồm giá)\n"
								+ "2. Nhập hàng điện tử (bao gồm giá)\n"
								+ "Nhập lựa chọn của bạn: ");
			c = sc.nextInt();
			if(c==1){
				HangThucPham tp = new HangThucPham();
				tp.nhap();
				list.add(tp);
			}else {
				HangDienTu dt = new HangDienTu();
				dt.nhap();
				list.add(dt);
			}
		}

		for(int i=0; i < list.size(); i++){
			System.out.println("sản phẩm "+i+": "+list.get(i).toString()+"\n");
		}
		return list;
	}

	public static void main(String[] args) {

		ArrayList<HangHoa> list = new ArrayList<HangHoa>();
		
		int a;
		HangThucPham tp = new HangThucPham();
		HangDienTu dt = new HangDienTu();
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("1. Nhập, xuất một hàng thực phẩm (bao gồm giá)\n"
				+ "2. Nhập, xuất một hàng điện tử (bao gồm giá)\n"
				+ "3. Danh sách các sản phẩm\n"
				+ "4. Nhập, xuất danh sách các sản phẩm\n"
				+ "5. Tìm sản phẩm có giá thấp nhất trong danh sách \n"
				+ "Nhập lựa chọn của bạn: "
				);
		a = sc.nextInt();
		
		switch (a) {
		case 1:
			HangThucPham(tp);
			list.add(tp);
			break;
		case 2:
			HangDienTu(dt);
			list.add(dt);
			break;
		case 3:
			for(int i=0; i < list.size(); i++){
				System.out.println("sản phẩm "+i+": "+list.get(i).toString()+"\n");
			}
			break;
		case 4:
			list.addAll(importList());
			break;
		case 5:
			float min = list.get(0).getGia();
			int index=0;
			for(int i=0; i < list.size(); i++){
				if(min > list.get(i).getGia()){
					index = i;
					min = list.get(i).getGia();
				}
			}
			System.out.println("San pham co gia thap nhat : "+list.get(index).toString());
			break;
		default:
			break;
		}
		}while(a!=0);
	}

}

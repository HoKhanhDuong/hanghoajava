package HangHoa;

import java.util.Scanner;

public class HangDienTu extends HangHoa{
	private String namSX;
	private float chietKhau;
	Scanner in = new Scanner(System.in); 
	@Override
	float giaBan() {
		return (float) (HangHoa.getGia()+ chietKhau*0.8);
		
	}
	protected void nhap() 
	  { 
		System.out.println("Nhập mã sản phẩm: "); 
	    super.maSP=in.nextLine();
	    System.out.println("Nhập giá sản phẩm: "); 
	    super.gia=in.nextFloat();
	    System.out.println("Nhập năm sản xuất: "); 
	    this.namSX=in.nextLine(); 
	    System.out.println("Nhập chiết khấu: "); 
	    this.chietKhau=in.nextFloat(); 
	    
	  } 
	public String toString() 
	  {
	  return "\nMã sản phẩm: " + this.maSP + "\nGiá: " + this.gia 
	        + "\nHạn sử dụng: " + this.namSX + "\nChi phí tiêu hao: " +this.chietKhau +"\nGiá bán: "+this.giaBan(); 
	  } 

}

package HangHoa;

import java.util.Scanner;

public class HangThucPham extends HangHoa{
	private String hanSD;
	private float chiPhi;
	 Scanner in = new Scanner(System.in); 
	@Override
	float giaBan() {
		return (float) (HangHoa.getGia()+ chiPhi*0.8);
		
	}
	protected void nhap() 
	  { 
		System.out.println("Nhập mã sản phẩm: "); 
	    super.maSP=in.nextLine();
	    System.out.println("Nhập giá sản phẩm: "); 
	    super.gia=in.nextFloat();
	    System.out.println("Nhập hạn sử dụng: "); 
	    in.nextLine();
	    this.hanSD=in.nextLine(); 
	    System.out.println("Nhập chi phí tiêu hao: "); 
	    this.chiPhi=in.nextFloat(); 
	    
	  } 
	public String toString() 
	  {
	  return "\nMã sản phẩm: " + this.maSP + "\nGiá: " + this.gia 
	        + "\nHạn sử dụng: " + this.hanSD + "\nChi phí tiêu hao: " +this.chiPhi; 
	  } 
	
}

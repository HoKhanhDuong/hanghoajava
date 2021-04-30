package HangHoa;

public abstract class HangHoa {
	protected String maSP;
	protected static float gia;
	abstract float giaBan();
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public static float getGia() {
		return gia;
	}
	public void setGia(Float gia) {
		this.gia = gia;
	}
	
}

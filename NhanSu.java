package bTH5;
import java.util.Scanner;
public class NhanSu extends Nguoi{
	int maNS;
	int hesoChucVu;
	int hesoLuong;
	static int luongcoban;
	Nguoi n=new Nguoi();
	public NhanSu() {}
	public NhanSu(int maNS,int hscv,int hsl,int luongcoban) {
		this.maNS=maNS;
		this.hesoChucVu=hscv;
		this.hesoLuong=hsl;
		this.luongcoban=luongcoban;	
	}
	public void nhapTTNS() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Nhap ma nhan su :");
		maNS=sc.nextInt();
		n.nhapTT();
		System.out.print("Nhap he so chuc vu :");
		hesoChucVu=sc.nextInt();
		System.out.print("Nhap hhe so luong :");
	    hesoLuong=sc.nextInt();
	    System.out.print("Nhap luong co ban :");
	    luongcoban=sc.nextInt();
		
	}


	static void setLuongCoBan(int lcb) {
		luongcoban=lcb;
	}
	public double tinhLuong() {
		double luong;
		 return luong=(hesoLuong+hesoChucVu)*luongcoban-hesoLuong*luongcoban*0.05;
		
	}
	public void xuatTTNS() {
		n.inTT();
		System.out.println("maNS :"+maNS);
		System.out.println("he so chuc vu :"+hesoChucVu);
		System.out.println("he so luong :"+hesoLuong);
		System.out.println("luong co ban :"+luongcoban);
	 
	public static void main(String[]args){
	NhanSu ns= new NhanSu();
	ns.nhapTTNS();
	System.out.println("THONG TIN BAN VUA NHAP ");
	ns.xuatTTNS();
	}

	}

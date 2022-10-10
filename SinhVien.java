package bTH5;
import java.util.Scanner;
public class SinhVien extends Nguoi {
	int maSV;
	String lop;
	float diem1,diem2,diem3;
	float dtb;
	Nguoi n=new Nguoi();
	public SinhVien() {}
	public SinhVien(int maSV,float d1,float d2,float d3,String l) {
		this.maSV=maSV;
		this.diem1=d1;
		this.diem2=d2;
		this.diem3=d3;
		this.lop=l;
	}
public void NhapSV() {
	Scanner sc= new Scanner(System.in);
	System.out.print("Nhap ma sinh vien :");
	maSV=sc.nextInt();
	n.nhapTT();
	System.out.print("Nhap ten lop :");
    lop=sc.next();
	System.out.print("Nhap diem 1 :");
	diem1=sc.nextFloat();
	System.out.print("Nhap diem 2 :");
	diem2=sc.nextFloat();
	System.out.print("Nhap diem 3 :");
	diem3=sc.nextFloat();
	
   
}
public void XuatSV() {
	System.out.println("maSV :"+maSV);
	n.inTT();
	System.out.println("lop :"+lop);
	System.out.println("diem 1 : "+diem1+"| diem 2 :"+diem2+"| diem 3 : "+diem3);
	
	
 
}
public float tinhDiemTrungBinh(){
	 return dtb=((float)(diem1+diem2+diem3))/3;
	 
}
public static void main(String[] args) {
	SinhVien sv=new SinhVien();
	sv.NhapSV();
	System.out.println("\nTHONG TIN SINH VIEN");
	sv.XuatSV();
	
}
}


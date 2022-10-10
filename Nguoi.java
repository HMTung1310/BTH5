package bTH5;
import java.util.Scanner;

public class Nguoi {
	String hoten;
	String diachi;
	int namsinh;
public Nguoi() {}
public Nguoi(String ht,String dc,int ns) {
	this.hoten=ht;
	this.diachi=dc;
	this.namsinh=ns;
	
}
public void nhapTT() {
	Scanner sc= new Scanner(System.in);
	System.out.print("Nhap ho ten :");
	hoten=sc.nextLine();
	System.out.print("Nhap dia chi :");
	diachi=sc.nextLine();
	System.out.print("Nhap nam sinh :");
    namsinh=sc.nextInt();
	

}
public void inTT() {
	System.out.println("Ho ten :"+hoten);
	System.out.println("Dia Chi :"+diachi);
	System.out.println("Nam Sinh :"+namsinh);
}
}

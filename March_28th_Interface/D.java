package March_28th_Interface;

public class D implements A,B {
	@Override
	public void  print() {
		A.super.print();
	}
	public static void main(String[] args) {
		D d=new D();
		d.print();
	}

}

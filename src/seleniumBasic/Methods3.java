package seleniumBasic;

public class Methods3 {

	public static void main(String[] args) {

		MethodsDemo md=new MethodsDemo(); //accessing method of another class
		md.getData();

		StaticMethodsDemo.getdata();//accessing static method of another class
	}
	
}

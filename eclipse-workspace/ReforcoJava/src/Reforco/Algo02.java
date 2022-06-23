package Reforco;

public class Algo02 {

	public static void main(String[] args) {
	int a = 10;
	int b = 20;
	System.out.println(b);
	b = 5;
	System.out.println(a);
	System.out.println(b);

	System.out.println("====================================");
	int c;
	a = 30;
	b = 20;
	c = a+b;
	System.out.println(c);
	b = 10;
	System.out.println(b + c);
	c = a + b;
	System.out.println(a+b+c);
	
	System.out.println("====================================");
	a = 10;
	b = 20;
	c = a;
	b = c;
	a = b;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println("====================================");
	a = 10;
	b = a + 1;
	a = b + 1;
	b = a + 1;
	System.out.println(a);
	a = b + 1;
	System.out.println(a);
	System.out.println(b);
	System.out.println("====================================");
	a = 10;
	b = 5;
	c = a + b;
	b = 20;
	a = 10;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println("====================================");
	
	int x = 1;
	int y = 2;
	int z;
	z = y - x;
	System.out.println(z);
	x = 5;
	y = x + z;
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
			
		
	}

}

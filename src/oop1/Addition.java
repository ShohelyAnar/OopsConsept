package oop1;

public class Addition {
	
	private int x;
	private int y;//instance varible or global varible.
	
	void add() {
		int sum =x+y;
		System.out.println(sum);
	}
				
	protected int getX() {
		return x;
	}

	protected void setX(int x) {
		this.x = x;
	}

	protected int getY() {
		return y;
	}

	protected void setY(int y) {
		this.y = y;
	}

	protected double add(double a,double b, double c) {
		double sum =a+b+c;
		return sum;
	}
	
	public int add(int a,int b, int c) {
		int sum =a+b+c;
		return sum;
	}
	int add(int a,int b) {
		int sum =a+b;
		return sum;
	} 
	public static void main(String[] args) {
		//Object creation
		//DRY=do not repeat yourself.
		Addition a1= new Addition();
		//How you creat a object of a class? new key word use
		a1.x=5;
		a1.y=7;
		System.out.println(a1.x + a1.y);
		//a1.add();
		int sum1=a1.add(3, 4);
		//double sum2 = a1.add(7.9, sum1, sum1);
	
		System.out.println(sum1);
		
		//a1.add(2.2, 3.2, 6.3);
		Addition a2= new Addition();
		double prient =a2.add(3.1, 2.3, 6.2);
		System.out.println(prient);
		Addition a3=new Addition();
		int Prient=a3.add(5,6,8);
		System.out.println(Prient);

	} 


}

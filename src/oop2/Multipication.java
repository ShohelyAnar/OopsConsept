package oop2;

import oop1.Addition;

public class Multipication extends Addition {
	void multiple(int a,int b) {
		int m=a*b;
		System.out.println(m);
		
	}
	void multiple(double a,double b) {
		double m=a*b;
		System.out.println(m);
	}
	
	

	public static void main(String[] args) {
		
		 Multipication m1=new  Multipication();
		 m1.multiple(4, 6);
		 m1.multiple(9.3, 7.9);
		 //(100+100+100)*10
		 int prient=m1.add(100, 100, 100);
		 m1.multiple(prient, 10);//
		 
		double prient1= m1.add(3.2, 2.6, 1.3);
		System.out.println(prient1);
		 
		 
	}

}

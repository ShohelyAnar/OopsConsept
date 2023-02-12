package oop2;

import oop1.Addition;

public class Divission extends Addition {
	//this method is a constructor- same as class name;
	int x;
	int y;
	public Divission() {
		int x= 10;
		int y= 6;
	}
	public Divission( int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	void division (int a,int b) {
		int d= a/b;
		System.out.println(d);
	}
	void divission (double m,double n){
			double d=m/n;

			System.out.println(d);
			
		}
	

	public static void main(String[] args) {
		
		Divission d1=new Divission();
		int s = d1.add(100, 100, 50);
		d1.division(s, 10);
		
		double v1=d1.add(3.2, 4.2, 1.2);
		d1.divission(v1, 2);
		
		

	}

}

package oop1;

public class subsTruction extends Addition{
	void sub(int a, int b) {
		 int s = a- b;
		 
		 System.out.println(s);
	 }
	

	public static void main(String[] args) {
		subsTruction s1=new subsTruction();
		s1.sub(90, 10);

		//(100+100+100)-75
		//call parent class by extends key word.
		int stor1=s1.add(100,100,100);
		s1.sub(stor1, 75);
		
	}

}

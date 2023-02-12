package oop3;

public class Calculator implements Advclac ,BasicCalc{
//implements key word for interface;
	//extends key words for the java class;
	public static void main(String[] args) {
	

	}

@Override
public void add(int a, int b) {
	int sum=a+b;
	System.out.println(sum);
	
}

@Override
public void sub(int a, int b) {
	int sub=a-b;
	System.out.println(sub);
	
}

@Override
public void multiple(int a, int b) {
	int mul=a*b;
	System.out.println(mul);
	
}

@Override
public void division(int a, int b) {
	int div=a/b;
	System.out.println(div);
	
}


}

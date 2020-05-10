
public class ConstructorPractice {

	public static void main(String[] args) {
		Const1 abc=new Const1();
		Const1 abc1=new Const1(8,9);
		abc1.sum(5, 9);
		abc.sum(7, 7.9f, 9);
		abc.sum(10,11,12);
		
	}

}

class Const1{
	int i,j;
	
	//Constructor Overloading:
	
	Const1(){
		i=1;
		j=5;
		System.out.println("Value of i is: "+i);
		System.out.println("Value of j is: "+j);
	}
	
	Const1(int i,int j){
		this.i=i;
		this.j=j;
		
		System.out.println("Value of i is: "+i);
		System.out.println("Value of j is: "+j);
	}
	
	//Method Overloading:
	
	public void sum(int a, int b) {
		int c=a+b;
		System.out.println("Sumt of 2 numbers are: "+c);
		
	}
	public void sum(int a, int b,int c) {
		int d=a+b+c;
		System.out.println("Sumt of 2 numbers are: "+d);
		
	}
	public void sum(int a, float b,int c) {
		float d=a+b+c;
		System.out.println("Sumt of 2 numbers are: "+d);
		
	}
}



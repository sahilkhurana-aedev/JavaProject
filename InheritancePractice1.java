class X
{
	public void p()
	{
        System.out.println("This is parent class");
	}
    
}
 
class Y extends X
{
	public void c()
	{
        System.out.println("This is child class");
	}
    
   
}

class InheritancePractice1{
	public static void main(String[] args){
	X x=new X();
	x.p();
	Y y=new Y();
	y.c();
	
	y.p();
	}
	
}
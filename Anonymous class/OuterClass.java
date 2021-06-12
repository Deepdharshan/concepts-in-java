//Anonimous class
/*  class A{
	public void show(){
		System.out.println("in A show");
	}
}
public class OuterClass{
	public static void main(String []args){
		A obj=new A(){
						public void show(){
							System.out.println("ananimous class");
						}
					 };
		obj.show();			 
	}

	
}*/





//methos class 
// Static class

class Outer{//Outer.class
	public  void add(){
		System.out.println("Display outer class");
	}
	 class Inner{   //Outer$inner.class,, Method class ,without specifying Static
		public void show(){
			System.out.println("Display inner class");
			
		}
		
	}
	//Inner in=new Inner();
}
public class OuterClass{//OuterClass.class
	public static void main(String []args){
		Outer obj=new Outer();
		obj.add();//add methos static or non static ,this is applicable.no need to worry about that
		Outer.Inner oi=obj.new Inner(); //this object only applicable in inner class is non static
		//Outer.Inner oi=new Outer.Inner();//it works on only inner class is static 
		oi.show();
	}
}
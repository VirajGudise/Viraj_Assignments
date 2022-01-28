package assignments;

public class Innerclass {
	private int data=30;  
		
		void display(){
			System.out.println("i am inside the outer class method");
		}
		 
		class Inner{  		
		 private int data=20;
		  
		  void msg()
		  {
			  Innerclass.this.display();
			  System.out.println("data is "+data);
		  }  
		  
		  // calling the duplicate method of the outer class
		  void display(){
			  System.out.println("i am inside the inner class method");
		  }// inner class accessing the outside private variable
		  class Inner_2{
			  
			  void Inner()
			  {
				  Innerclass.this.display();
				  System.out.println("data is "+data);
			  }
			  void Inner2()
			  {
				  System.out.println("2nd Inner class");
			  }
			  
		  }
		 }  
		
		public static void main(String args[]){  
		  
		  Innerclass obj=new Innerclass();     // creating object of Outer class
		  
		  Innerclass.Inner in=obj.new Inner(); 
		  Inner.Inner_2 i=in.new Inner_2();// creating object of Inner class
		  in.msg();  
		  in.display(); 
		  i.Inner();
		  i.Inner2();
		 }  

	}




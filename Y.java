package Accessmodifiers;

public class Y {
	
		
		public void methodY() {
			M m=new M();
			long defaultLongValue =m.defaultLongMethod();
			float protectedFloatValue=m.protectedFloatMethod();
			N n=new N();
			double defaultDoubleValue=n.defaultDoubleMethod();
			float protectedLongValue=n.protectedLongMethod();
			System.out.println("M class variables are "+defaultLongValue+ "and "+protectedFloatValue);
			System.out.println("N class Variables are "+defaultDoubleValue+ " and "+protectedLongValue);
			X x=new X();
			System.out.println("class X variables are "+x.varX2+" and "+x.varX3+" and "+x.varX4);
			
		}

	}



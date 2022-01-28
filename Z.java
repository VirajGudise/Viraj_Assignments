package Accessmodifiers;

public class Z {
	;

	
		public static void main(String[] args) {
			M m= new M();
			long defaultLongValue =m.defaultLongMethod();
			float protectedFloatValue=m.protectedFloatMethod();
			N n=new N();
			double defaultDoubleValue=n.defaultDoubleMethod();
			long protectedLongValue=n.protectedLongMethod();
			
			System.out.println("From class Z");
			System.out.println("M class variables are "+defaultLongValue+" and "+protectedFloatValue);
			System.out.println("N class variables are "+defaultDoubleValue+" and "+protectedLongValue);
			
			P p=new P();
			
			System.out.println("calling Method p");
			p.callingMethod();
			System.out.println("calling Method y");
			Y y=new Y();
			y.methodY();
			
			System.out.println("calling Method X");
			X x=new X();
			System.out.println("X class Variables "+x.varX2+" and "+x.varX3+" and "+x.varX4);
			
		}

	}



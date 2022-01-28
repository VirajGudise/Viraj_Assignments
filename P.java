package Accessmodifiers;

public class P {
	
		
		public void callingMethod()
		{
			M m=new M();
			long defaultLongValue =m.defaultLongMethod();
			float protectedFloatValue=m.protectedFloatMethod();
			N n=new N();
			double defaultDoubleValue =n.defaultDoubleMethod();
			long protectedLongValue=n.protectedLongMethod();
			
			System.out.println("M class variables are "+defaultLongValue+" and "+protectedFloatValue);
			System.out.println("N class variables are "+defaultDoubleValue+" and "+protectedLongValue);
		}

	}



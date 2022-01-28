package assignments;

public class Arrays {

		public static void main(String[] args) 
	    {
			//one dimension array
			int a[]= {4,7,23,5,51};
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]);
				System.out.print(" ");
			}
			System.out.println(" ");
			
			//Two dimensional array
	        int[][] arr = { { 1, 2 }, { 3, 4 } }; 
	  
	        for (int i = 0; i < 2; i++) 
	        {               
	            for (int j = 0; j < 2; j++) 
	            {           
	                System.out.print(arr[i][j] + " "); 
	            } 
	            System.out.println(); 
	        } 
	    }

		public static int binarySearch(int[] arr, int i, int min, int value) {
			// TODO Auto-generated method stub
			return 0;
		} 

	}



package assignments;

public class Binarysearch {
	 
		 public static  void main(String[] args){

		        int[] arr = {2,8,24,36,51,59,61,72,79,89,93,98};
		        int key = 72;
		        int arrlength = (arr.length-1); 
		        binarySearch(arr,0,key,arrlength);
		    }

		 	public static void binarySearch(int[] arr, int start, int key, int length){

		        int midValue = (start+length)/2;       
		        while(start<=length){

		            if(arr[midValue]<key){
		                start = midValue + 1;
		            } else if(arr[midValue]==key){
		                System.out.println("Element is found at index :"+midValue);
		                break;
		            }else {

		                length=midValue-1;
		            }
		            midValue = (start+length)/2;
		        }
		            if(start>length){

		                System.out.println("Element is not found");
		            }      
		    }
		}






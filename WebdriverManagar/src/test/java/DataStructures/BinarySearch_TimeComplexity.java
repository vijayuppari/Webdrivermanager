package DataStructures;

// Binary Search will perform on Sorted Array
// O(Log n)

// O(Log n) its better than O(n), O(n^2) and O(n^3)

//12345678-> it will divide based on middle element (L+H/2) then
// if x>middle element right side
// if x<middle element left side

// Best case  is O(1)(if element found in the middle) and avarage time complexity is O(Log n)

public class BinarySearch_TimeComplexity {
	
	public static void main(String[] args) {
		
		int arr[]={2,4,6,7,10,32,67,75};
		int n=arr.length;
		int x=32;
		int result = Binarysearch(arr, 0, n-1, x);
		if(result==-1)
			System.out.println("Element is not found in the array");
		else
			System.out.println("Element is found at position " + result);
	}
	
	public static int Binarysearch(int arr[],int low,int high,int x){
		
		while(low<=high){
			int mid=low+(high-low)/2;
			if(arr[mid]==x)
				return mid;
			if(arr[mid]<x)
				low= mid+1;
			else
				high =mid-1;
		}
		return -1;
	}
}

import java.util.Arrays;

public class SelectionSort {
	
	static {
		System.out.println("This is Selection sort program. Here I'm giving input an array of unsorted element.");
		System.out.println("In the selection sort we create a pass. And every pass set the smallest value at appropriate place. Number of passes would be array length -1.");
	}

	//This is the entry point of our program.
	public static void main(String[] args) {
		
		//This is an array of unsorted element.
		int[] arr = {64,25,12,22,11,0,9,6,12,34,45,12,12,11,11};
		
		System.out.println("Actual Array ::  ");
		System.out.println(Arrays.toString(arr));
		
		//Here i am calling a method which sort the array by using selection sort methodology.
		arr = sortBySelection(arr);
		
		System.out.println("Sorted Array ::");
		System.out.println(Arrays.toString(arr));		

	}
	
	//Selection sort method start
	private static int[] sortBySelection(int[] arr) {
		
		/*
		  Here We have to take two for loop. First loop will iterate over every element till second last element.
		  Here we will iterate loop till second last element because at last only one value will be left to compare.
		*/
		for (int i = 0, minIndex = 0, minEle = arr[0]; i < arr.length - 1; i++, minIndex = i, minEle = arr[i]) {
			
			//The second loop will start from i + 1 position to last element of the array. 
			//And find the smallest element of every pass in the rest array.
			for (int j = i + 1; j < arr.length; j++) {
				
				//Here store the index number of smallest element of the rest array(i+1 to last ele). 
				if (minEle > arr[j]) {
					minIndex = j;
					minEle = arr[j];
				}
			}
			//Here we check if minIndex is not changed which is store the current index value, then swap the value with current value.
			//Here minIndex store the smallest element index number. By this number we can change the value. 
			if (minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
		return arr;
	}

}

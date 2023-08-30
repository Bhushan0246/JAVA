class MinMax{
	public static void main(String[] args){
		System.out.println("Minimum and Maximum of five numbers.");
		System.out.println("Array: {1, 8, 6, 4, 2}");
		int arr[] = {1,8,6,4,2}, size = 5, min = 0, max = 0;
		for(int i=0; i<(size-1); i++){	// check for minimum element
			if(arr[i] < arr[i+1])
				min = arr[i];
		}
		for (int i = 0; i < (size-1); i++) {	// check for maximum element
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.println("Minimum = " + min);
		System.out.println("Maximim = " + max);
	}
}
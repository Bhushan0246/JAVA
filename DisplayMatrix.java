class DisplayMatrix{
	public static void main(String[] args) {
		int arr[][] = {{45,87,98},{65,32,51},{53,79,31}};
		System.out.println("Array in Matrix form.");
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println("");
		}
	}
}
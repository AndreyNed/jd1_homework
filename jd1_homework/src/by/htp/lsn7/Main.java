package by.htp.lsn7;




public class Main {
	
	public static final String RESIZE = "resize";
	public static final String NOT_RESIZE = "not_resize";
	public static final int DEFAULT_VALUE = 0;

	public static void main(String[] args) {
		int[] arr1 = new int [ 25 ];

		arr1 = Arr.fillInFromOne( arr1, 25 );
		Arr.printArr(arr1);
		
		arr1 = Arr.deleteEvenItems(arr1,NOT_RESIZE);
		Arr.printArr(arr1);
		
		arr1 = Arr.deleteEvenItems(arr1,RESIZE);
		Arr.printArr(arr1);
		
		arr1 = Arr.deleteItemByIndex(arr1,  5, NOT_RESIZE);
		Arr.printArr(arr1);
		
		arr1 = Arr.deleteItemByIndex(arr1,  5, RESIZE);
		Arr.printArr(arr1);
		
	}
	
	

}

package set_06_project_03;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;	
		int[] arr = {1, 5, 8, 2, 6};
		
		for(i = 0; i < arr.length; i++)
			System.out.print(arr[i] + (i < arr.length - 1 ? "," : "" ));
		
		int temp = arr[0];
		
		for(i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				arr[i] = temp;
			} else {
				arr[i] = arr[i+1];
			}
		}
		
		System.out.print("\n");
		
		for(i = 0; i < arr.length; i++)
			System.out.print(arr[i] + (i < arr.length - 1 ? "," : "" ));

	}

}

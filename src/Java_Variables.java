
public class Java_Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		String aman ="name variable";
		int num = 45;
		char character = 'a';
		float num2 = 1/2;
		double num3 = 1.23;
		*/
		
		int  arr[] = {1,2,3,4,5,2,3,4,5,6,7,8,898,5,4,4,33,2,22,4,4,55,66,6,5,5,43,3,2,2};
		
		for (int multiple2:arr) {
			
			if(multiple2%2==0) {
			System.out.println(multiple2);
		}
		}
	/*	
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		*/
	/*	int arr2[] = new int [5];
		
		arr2[0]=1;
		arr2[1]=2;
		arr2[2]=3;
		arr2[3]=4;
		arr2[4]=5;
		for(int i=0;i<5;i++) {
		System.out.println(arr2[i]);
		}		
		*/
		
		
		// String array
		
		String[] array = {"aman","kumar","barwal"};
		
		for (int j=0;j<array.length;j++) {
			System.out.println(array[j]);
		}
		
		
		String [] array2 = new String[5];
		array2[0]="second";
		array2[1]="Method";
		array2[2]="of declaration";
	
		/*
		for(int k = 0;k<array2.length;k++)
		{
		System.out.println(array2[k]);
		
		
		}
	*/
		
		
		for (String x:array2) {
			System.out.println(x);
		}
	}

}

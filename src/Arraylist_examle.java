import java.util.ArrayList;

public class Arraylist_examle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> example = new ArrayList<String>();
		example.add("arraylist1");
		example.add("arraylist2");
		example.add("arraylist3");
		example.add("arraylist4");
		
		System.out.println(example.get(2));
		
		
		//these are string literals
	/*	
		String s  = "rahul kumar chaurasia";
		String s1= "rahul kumar chaurasia";
		
		//string object
		String s2 =new String ("rahul kumar chaurasia");
		*/
		String s3 =new String ("rahul kumar chaurasia");
		
	String[] returning = s3.split("kumar");
	for(int i=0;i<returning.length;i++) {
	System.out.println(returning[i].trim());
	}
	
	System.out.println(s3.length());
	for(int j=s3.length()-1;j>=0;j--) {
		System.out.println(s3.charAt(j));
	}
	
	
	
	
		
		
		
	}

}

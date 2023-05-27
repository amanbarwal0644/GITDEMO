import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.netty.handler.ssl.SslClientHelloHandler;

public class Arraylist_java_stream {
/*
	@Test
	public void regular() {

	
		ArrayList<String> obj =  new ArrayList<String>();
		
		obj.add("Aman");
		obj.add("Ravi");
		obj.add("mandeep");
		obj.add("Abhishek");
		obj.add("Dheeraj");
		int count=0;
		for (int i=0 ;i<obj.size();i++) {
			String initials = obj.get(i);
			if(initials.startsWith("A")) {
				count ++;
			}
		}
		System.out.println(count);
		
		
	}
	*/
	@Test
	
	public void lamda() {
		
ArrayList<String> obj =  new ArrayList<String>();
		
		obj.add("Aman");
		obj.add("Ravi");
		obj.add("mandeep");
		obj.add("Abhishek");
		obj.add("Dheeraj");
		
	//	Long k = obj.stream().filter(S-> S.startsWith("A")).count();
		
	//Long m=	Stream.of("Aman","kumar","Aarwal","Aditya").filter(S->S.startsWith("A")).count();
	
	 //obj.stream().filter(S->S.length()>4).forEach(S->System.out.println(S));
		
	 obj.stream().filter(S->S.length()>4).filter(S->S.startsWith("A")).map(S->S.toUpperCase()).forEach(S->System.out.println(S));
		//System.out.println(m);
	 
	 
	 String[] a = {"aE","az","aA"};
	 
	 
List<String> meaw = 	Arrays.asList(a);

 meaw.stream().filter(S->S.contains("a")).sorted().map(S->S.toUpperCase()).forEach(S->System.out.println(S));

//System.out.print(f);

	 ArrayList<String> A1 =  new ArrayList<String>();
	 A1.add("A1");
		A1.add("A101");
		A1.add("A102");
		A1.add("A103");
		A1.add("D104");
		
		
		ArrayList<String> A2 =  new ArrayList<String>();
		 A2.add("A2");
			A2.add("A201");
			A2.add("A202");
			A2.add("A203");
			A2.add("D204");
			 
			
		Stream<String>newstream=Stream.concat(A1.stream(), A2.stream());
			
			//newstream.forEach(S->System.out.println(S));
			
	boolean output =		newstream.anyMatch(S->S.equalsIgnoreCase("a201"));
	
	Assert.assertTrue(output);
	
	System.out.println(output);
	
			
	}
	
	
	@Test
	
	public void Unique_number() {
		
	ArrayList<Integer> number = new ArrayList<Integer>();
	
	number.add(1);
	number.add(2);
	number.add(4);
	number.add(6);
	number.add(5);
	number.add(2);
	
	
	//to print only unique numbers
	
	List<Integer> x = number.stream().distinct().sorted().collect(Collectors.toList());
	
	System.out.println(x.get(2));
	
	}
}



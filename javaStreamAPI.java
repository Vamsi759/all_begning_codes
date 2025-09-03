package stremrivisson;
import java.lang.*;	
import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

public class a1 {
	
	public static void main(String [] apl) {
		
		List<Integer>ap=Arrays.asList(3,4,5,3,2,1,1,12,2);
		
		List<Integer>r ;
		//-----------------------------------------------------------------------------------
		
		//ap.stream().filter(i->i%2==0).distinct().sorted().forEach(i->System.out.println(i));
		
	//	ap.stream().map(i->i+i).forEach(i->System.out.print(i+" "));
		// 6 8 10 6 4 2 2 24 4 
		//-----------------------------------------------------------------------------------
		
	/*	r=ap.stream().filter(i->i%2==0).distinct().sorted().toList();
		System.out.print(r);
		
		String [] a= {"den","kpl","dplk"};
		List<String>kp=Arrays.asList(a);
		
		kp.stream().map(i->i.toUpperCase()).forEach(i->System.out.print(i+" "));
		// DEN KPL OPLK 
		
		System.out.println(kp.stream().sorted().distinct().toList());
		
		System.out.println(kp.stream().sorted().filter(i->i.startsWith("d")).map(i->i+"_kittu").toList());
		
		*///-----------------------------------------------------------------------------------
		
		
		/*
		String s1="java is is vary vary easy";
		String a1[]=s1.split(" ");
		List<String>mp=Arrays.asList(a1);
		
		List<String>r1=mp.stream().distinct().sorted().toList();
		System.out.println(r1); 
		 */
		
		//-----------------------------------------------------------------------------------
		/*
		String s2="javadev";
		String a2[]=s2.split("");
		(Arrays.asList(a2)).stream().distinct().forEach(i->System.out.print(i+""));
		// javde 
		(Arrays.asList(a2)).stream().distinct().forEach(i->System.out.print(i));
				// javde
		
		List<String>p1=Arrays.asList("den","den","kit","lpod");
		
		Map<String,Long> m1=p1.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
		System.out.println();
		m1.forEach((i,j)->System.out.print(i+"-"+j+" "));
			
				*/
		
		//-----------------------------------------------------------------------------------
		
		// main program 1;
		/*
		
		List<Integer>a1=Arrays.asList(2,3,4,4,5,6,1);
		Map<Object,Long>r1;
		r1=a1.stream().map(i->i).collect(Collectors.groupingBy(i->i,Collectors.counting()));
		r1.forEach((i,j)->System.out.print(i+"-"+j+"___"));
		
		
		*/
		
		// main program 2;
		/*
		String a2="javadev";
		Map<Object,Long>r2;
		r2=a2.chars().mapToObj(i->String.valueOf((char)i))
				.collect(Collectors.groupingBy(i->i,Collectors.counting()));
		r2.forEach((i,j)->System.out.print(i+"-"+j+"____"));
		
		*/
		
		// main prgem 3
		
		/*   */
		
		String a3="javadev";
		//Map<Object,Long>r3;
		String r3=a3.chars().mapToObj(i->String.valueOf((char)i))
				.collect(Collectors.joining()).toString();
		System.out.println(r3);
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 *   
		 map().collect(,,,) method only may be work only on objects 
		 that why we covert char into objects and
		 may be by default list elements are objects thats why we
		  not converts elements into mapToObjt 
		 for list elements operations
		 
		 
		   String result = s.chars()                       // IntStream of chars
                         .mapToObj(c -> String.valueOf((char) c)) // convert to Stream<String>
                         .distinct()                   // remove duplicates
                         .collect(Collectors.joining()); // join back into a string
                         
                         
                         
                         s.chars() → gives IntStream.

          mapToObj() → converts int → char/String.

        distinct() → removes duplicates.

        Collectors.joining() → rebuilds the string. 

         Do you also want me to explain the difference 
        between using 
        .mapToObj(c -> String.valueOf((char)c)) vs .mapToObj(c -> (char)c) in this context?
        
        
        
        
        
        
        
        

		 * 
		 * 
		 * 
		 */
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}

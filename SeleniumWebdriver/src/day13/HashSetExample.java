package day13;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
			
		
		Set<String> s=new HashSet<>();
		s.add("Selenium");
		s.add("QTP");
		s.add("LR");
		s.add("Jmeter");
		s.add("Soapui");
		System.out.println(s.size());
		Iterator<String> it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

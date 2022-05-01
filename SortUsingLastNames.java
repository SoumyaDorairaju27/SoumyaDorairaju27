package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import org.testng.annotations.Test;

public class SortUsingLastNames {

	public static void sortLast(ArrayList<String> al)  {
		
// TODO Auto-generated method stub
		Collections.sort(al, new Comparator<String>() {
			 @Override
			public int compare(String o1, String o2) {
			 String[] split1 = o1.split(" ");
			 String[] split2 = o2.split(" ");
			 String lastName1 = split1[1];
			 String lastName2 = split2[1];
			 if (lastName1.compareTo(lastName2) > 0) {
			 return 1;
			 } else {
			 return-1;
			}
			 }
			});
			System.out.println(al);
			 }

@Test
			 public static void main(String[] args) {
			 ArrayList<String> al = new ArrayList<String>();
			 al.add("Ratan Tata");
			 al.add("Bill Gates");
			 al.add("Mother Terasa");
			 al.add("Steve Jobs");
			 al.add("Ann Franklin");	 
			 al.add("Barack Obama");
			 al.add("Marilyn Monroe");
			 al.add("Abraham Lincoln");
			 al.add("Nelson Mandela");
			 al.add("Malala Yousafzai");
			 System.out.println("Sorted using Last Name");
			 SortUsingLastNames.sortLast(al);
	}

}

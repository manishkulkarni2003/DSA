package OOPS.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class functionalInterface {
	@FunctionalInterface
	interface Cse{
		int add(int a,int b);
	}
	
	public static void main(String[] args) {
		
		//Lambda Expression is Used to Implement the Functional Interface
		Cse func=(int a,int b)->{
			int c =a+b;
			return c;
			
		};
		System.out.println(func.add(3, 4));
		
		
		//Date Time api
		LocalDate date =LocalDate.now();
		System.out.println("Current Date is:"+date);
		
		LocalTime time =LocalTime.now();
		System.out.println("Current time is:"+time);
		
		LocalDateTime current =LocalDateTime.now();
		System.out.println("Current time and Date is :"+current);
		
		DateTimeFormatter format =DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
		String formatDateTime =current.format(format);
		System.out.println(formatDateTime);
		
		Month month =current.getMonth();
		System.out.println(month);
		int date1 =current.getDayOfMonth();
		System.out.println(date1);
		
		LocalDate date2=LocalDate.of(1950, 1, 25);
		System.out.println(date2);
		
		//Stream Api
		List<String> list=Arrays.asList("manish","Janya","Mahatma");
		
		List<String> filterNames =list.stream()
				.map(name->name.toLowerCase())
				.filter(name->name.startsWith("m"))
				.collect(Collectors.toList());
		
		System.out.println(filterNames);
								
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		
		List<Integer> evenNum= numbers.stream()
				.filter(num->num%2==0).collect(Collectors.toList());
		
		System.out.println(evenNum);
		
		int[] empId= {1,2,3,5,6};
		
		
		
	}

	
	
}

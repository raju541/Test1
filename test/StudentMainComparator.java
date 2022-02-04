package com.cts.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentMainComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentComparator> list=new ArrayList<StudentComparator>();
		
		StudentComparator s1=new StudentComparator(101,"raju",27);
		StudentComparator s2=new StudentComparator(102,"hari",29);
		StudentComparator s3=new StudentComparator(103,"ali",28);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println("Sorting by ID");
		Collections.sort(list,new StudentIdComparator());
		Iterator<StudentComparator> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Sorting by NAME");
		Collections.sort(list,new StudentNameComparator());
		for (StudentComparator sc : list) {
			System.out.println(sc);
		}
		System.out.println("Sorting by AGE");
		Collections.sort(list,new StudentAgeComparator());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
	}
}

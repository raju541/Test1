package com.cts.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparable implements Comparable<StudentComparable>{
		
		int id,age;
		String name;
		
		public StudentComparable(int id,String name,int age) {
			this.id=id;
			this.name=name;
			this.age=age;
		}
	@Override
	public int compareTo(StudentComparable sc) {
		if(age==sc.age)
			return 0;
		else
			if(age>sc.age)
				return 1;
			else
				return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentComparable> list=new ArrayList<StudentComparable>();
		StudentComparable s1=new StudentComparable(101,"raju",27);
		StudentComparable s2=new StudentComparable(102,"hari",29);
		StudentComparable s3=new StudentComparable(103,"ali",28);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		Collections.sort(list);
		for (StudentComparable stc : list) {
			System.out.println(stc.id+" "+stc.name+" "+stc.age);
		}
	}
}

package com.cts.test;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<StudentComparator>{

	@Override
	public int compare(StudentComparator s1, StudentComparator s2) {
		// TODO Auto-generated method stub
		
		if(s1.getAge()==s2.getAge())
			return 0;
		else
			if(s1.getAge()>s2.getAge())
				return 1;
			else
				return -1;
	}
		
}

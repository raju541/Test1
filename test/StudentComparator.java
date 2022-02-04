package com.cts.test;

public class StudentComparator {
		
		int id;
		String name;
		int age;
	
		public StudentComparator(int id,String name,int age)
		{
			this.id=id;
			this.name=name;
			this.age=age;
		}
		
		
		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		public String toString()
		{
			return id+ " : " +name+ " : " +age;
		}

}




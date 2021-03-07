package com.abc.ComplexObjects;

public class Student implements Comparable {

		String name;
		int marks1;
		int marks2;
		float avg;
	
		public Student(String name, int marks1, int marks2, float avg) {
			super();
			this.name = name;
			this.marks1 = marks1;
			this.marks2 = marks2;
			this.avg= avg;
		}

		public String getName() {
			return name;
		}

		public int getMarks1() {
			return marks1;
		}

		public int getMarks2() {
			return marks2;
		}
		
		public float getavg() {
			return avg;
		}
		
		public String toString()
		{
			return name+" "+marks1+" "+marks2+" "+avg;
		}

		@Override
		public int compareTo(Object y) {
			/* this method will compare a object with 
			 * other object(it requires minimum 2 object)
			 * here downcasting is done here parent::Object and child::Student
			 * y which is of type Object is converted into child type Student Object
			 * this:: refers to Student m then next r then next n 
			 */
			if(this.avg>((Student)(y)).avg) 
			{
				return 1;
			} else {
				return -1;
			}
		}

}


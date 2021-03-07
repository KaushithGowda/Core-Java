package com.abc.ComplexObjects3;

public class Student {
		
		String name;
		int marks1;
		int marks2;
		float avg;
		
		public Student(String name, int marks1, int marks2, float avg) {
			super();
			this.name = name;
			this.marks1 = marks1;
			this.marks2 = marks2;
			this.avg = avg;
			
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

		public float getAvg() {
			return avg;
		}
		
		public String toString() {
			return name+" "+marks1+" "+marks2+" "+avg;
		}

}

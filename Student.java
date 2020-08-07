package assignment;

public class Student {
	private String rollno;
	private int age;
	
	
	public Student(String rollno,int age){
		this.rollno=rollno;
		this.age=age;
	}
	
	
	 public static int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			this.age=age;
		}
		
		public String getRollno() {
			return rollno;
		}
		
		public void setRollno(String rollno) {
			this.rollno=rollno;
		}
		@Override
		public String toString() {
			String str=rollno+" "+ age;
			return str;
		}
		@Override

		public int hashCode() {

			return age;

		}
		  @Override

			public boolean equals(Object arg) {

				if(this==arg) {

					return true;

				}

				

			   if(arg==null || !(arg instanceof Student ) ) {

					return false;

			   }

				

			   Student that=(Student)arg;	

				boolean isequal=this.age==that.age;

				return isequal;

			}

			

			

		
		
		
	

}

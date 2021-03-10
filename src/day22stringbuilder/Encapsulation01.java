package day22stringbuilder;

public class Encapsulation01 {
		
		/*
		 1) Encapsulation means "data hiring"
		 2) How to you achieve "encapsulation"?
		  	a) Make the variables private
		  	b) To read private variables create  get methods (getters)
		  	c) To update private variables create set methods (setter)
		 */
		
		private String ssn = "123456789";
		private int salary = 12345;
		
		
		public String getSsn() {
			return ssn;
		}
		
		public int getSalary() {
			return salary;
		}

		public void setSsn(String ssn) {
			this.ssn = ssn;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}
	

	

}

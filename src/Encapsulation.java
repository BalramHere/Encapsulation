
class Encapsulation {


		private String name;
		private int rollno;
		
		public String dept;
		
		public String getName() {
			return name;
		}

		
		  public void setName(String name) { this.name = name; }
		 
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		
	
	public static void main(String[] args){
		
		Encapsulation a = new Encapsulation();
		//a.setName("Balram");
		//a.setName("Chinna");
		a.dept="CSE";
		a.setRollno(10);
		System.out.println("Dept :: "+a.dept);
		System.out.println("Name :: "+ a.getName());
		System.out.println("Rollno :: "+ a.getRollno());
	}
	
	
}

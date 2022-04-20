public class Student {
	
	String name;
	int age;
	char gender;
	float marks;

  public void Studentdata(){
		name = "Saksham";
		 age = 18;
		 gender='M';
		 marks=77.6f;
	}
  
  public void display() {
	  System.out.println(name);
	  System.out.println(age);
	  System.out.println(gender);
	  System.out.println(marks);
	  
  }
 
	
	public static void main (String Args[]) {
		
		Student sd = new Student();
		sd.Studentdata();
		sd.display();
		
	}
}


package core.programs;

public class student {
	String name;
	int age;
	char section;
	char gender;
	int subject1;
	int subject2;
	int subject3;
  public Student(String n, int a, char s , char g,  int  s1, int s2, int s3){
		name = n;
		age=a;
		section=s;
		gender=g;
		 subject1 = s1;
		 subject2 = s2;
		 subject3 = s3;
	}
	public int marks(){
		return  subject1+subject2+ subject3;
	}
	public float percentage(){
		return (marks()/300)*100;
	}
	
	public static void main(String args[]){
		Student s1 = new Student("anu", 20, 'A', 'F', 80,85,90);
		Student s2 = new Student("Banu", 21,'B', 'F' ,90,80,85);
		System.out.println("marks of student1=" +s1.marks()+ "percentage of student1=" +s1.percentage());
		System.out.println("marks of student1=" +s2.marks()+ "percentage of student2=" +s2.percentage());
		
	}

}

package Test;

public class Student {
	public int id;
	private int RollNumbr;
	private String Name;
	private int Age;
	private int TotalMarks;
	private String grade;
	
	public Student( int id,int rollNumbr, String name, int age, int totalMarks, String grade) {
		
		this.id=id;
		this.RollNumbr = rollNumbr;
		this.Name = name;
		this.Age = age;
		this.TotalMarks = totalMarks;
		this.grade = grade;
	}

	

	public  int getId() {
		return id;
	}
	
	//public void setId(int id) {
	//	id = id;
	//}

	public int getRollNumbr() {
		return RollNumbr;
	}

	public void setRollNumbr(int rollNumbr) {
		RollNumbr = rollNumbr;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public int getTotalMarks() {
		return TotalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		TotalMarks = totalMarks;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}

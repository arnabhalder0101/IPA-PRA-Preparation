class Student{
	int id;
	String name;
	int marks;
	int age;
	Student(int id, String name, int marks, int age){
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}
	public String getName(){
		return this.name;
	}
	public int getMarks(){
		return this.marks;
	}
	public int getAge(){
		return this.age;
	}
	public int getId(){
		return this.id;
	}
}

class Solution{
	
	public static Student findStudentWithMaximumAge(Student[] students){
		int max = 0;
		int index = 0;
		for(int i = 0; i<students.length; i++){
			if(students[i].age > max){
				max = students[i].age;
				index = i;
			}
		}
		return students[index];
	}
	
	public static Student findStudentWithId(Student[] students, int id){
		for(int i = 0; i<students.length; i++){
			if(students[i].id == id){
				return students[i];
			}
		}
		return null;
	}
	
	
	public static void main(String[] args){
		Student s1 = new Student(1, "Arnab", 85, 22);
		Student s2 = new Student(2, "Sanchari", 82, 19);
		Student s3 = new Student(3, "Kohli", 80, 34);
		Student s4 = new Student(4, "Rohit", 90, 36);
		
		Student a = Solution.findStudentWithId(new Student[] {s1, s2, s3, s4}, 1);
		System.out.println(a.id+" "+a.name+" "+ a.age+ " "+a.marks);
		Student b = Solution.findStudentWithMaximumAge(new Student[] {s1, s2, s3, s4});
		System.out.println(b.id+" "+b.name+" "+ b.age+ " "+b.marks);

	}
}
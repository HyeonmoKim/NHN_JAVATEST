
public class Main {
	public static void main(String args[]) {
		People p = new People(0023,26,"Mr.Kim");
		Student s = new Student(0025,28,"Mr.Park","3ÇÐ³â");
		
		System.out.println(p.age);
		System.out.println(s.pid); //modify) s.degree -> s.pid
		System.out.println(s.name); // New
	}
}

package id.ac.amikom.day01;

public class StudentTest {
	public static void main(String[] abc) {
		Student s1 = new Student();
		s1.nim = "2018133001";
		s1.nama = "Andri";
		s1.nilai = 8.5;
		System.out.println(s1);
		System.out.println(s1.toString());
		int x = 100;
		int y = x;
		x = 1000;
		Student s2 = s1;
		s2.nama = "Budi";
		System.out.println(s1);
		s1 = new Student();
		s2 = new Student();
		
		Student s3 = new Student("12345", "Dedi", 5.9);
	}
}
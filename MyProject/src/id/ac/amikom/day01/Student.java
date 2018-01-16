package id.ac.amikom.day01;

public class Student extends Object {
	String nim;
	String nama;
	double nilai;	
	public Student() {
		this("-1","Anonymous");
	}
	public Student(String nim, String nama, double nilai) {
		this.nim = nim;
		this.nama = nama;
		this.nilai = nilai;
	}	
	public Student(String nim, String nama) {
		this(nim, nama, 0.0);
	}
	@Override
	public String toString() {
		return "Student [nim=" + nim + 
				", nama=" + nama + 
				", nilai=" + nilai + "]";
	}	
	
}
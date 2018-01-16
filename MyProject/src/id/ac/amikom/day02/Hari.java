package id.ac.amikom.day02;

public enum Hari {
	SENIN(1,"Monday"),
	SELASA(2, "Tuesday"),
	RABU(3, "Wednesday"),
	KAMIS(),JUMAT(),SABTU(),MINGGU();
	private int value;
	private String alias;
	private Hari() {}
	private Hari(int value, String alias) {
		this.value = value;
		this.alias = alias;
	}
	public String getAlias() {
		return alias;
	}
}
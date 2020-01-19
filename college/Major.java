package college;

public enum Major
{	
	PHYS("PHYSICS"),
	ASTR("ASTRONOMY"),
	CSC("COMPUTERSCIENCE"),
	ENG("ENGINEERING");
	
	String major;
	
	private Major(String major) {
		this.major = major;
	}
	
	public String toString() {
		return this.major;
	}
}
package college;

public enum Title {
	ASTR("ATR", 100),
	CSC("CSC", 143),
	ENG("ENG", 214),
	MATH("MATH", 163),
	PHYS("PHYS", 22);
	
	private String prefix;
	private int courseNum;
	
	private Title(String prefix, int courseNum) {
		this.prefix = prefix;
		this.courseNum = courseNum;
	}
	
	public String toString() {
		return this.prefix + " " + this.courseNum;
	}
}

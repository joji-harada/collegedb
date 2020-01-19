package college;

public enum Rank {
		FRESH("FRESHMAN"),
		SOPH("SOPHOMORE"),
		JUN("JUNIOR"),
		SEN("SENIOR");
	
	String rank;
	
	private Rank(String rank) {
		this.rank = rank;
	}
	
	public String toString() {
		return this.rank;
	}
}

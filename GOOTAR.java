public class GOOTAR {
	private int strings;

	public GOOTAR() {
		strings = 5;
	}

	public GOOTAR (int strgz) {
		strings = strgz;
	}

	public String output() {
		String str = "GOOTAR has " + strings + " strings.";
		return str;
	}
}
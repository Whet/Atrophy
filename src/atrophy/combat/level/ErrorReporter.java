package atrophy.combat.level;

public class ErrorReporter {

	public void reportSyntaxError(int line, int charPositionInLine, String msg) {
		System.err.println("l: " + line + "c: " + charPositionInLine + "  " + msg);
	}

}

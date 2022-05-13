package lexer;

/**
 * Verarbeitung von Leerzeichen, Tabulatoren etc.
 */

public class WhiteSpaceState implements LexerState {

	@Override
	public void scan(Character c, LexerImpl lexer) {
		lexer.skip();
		lexer.setState(new SelectionState());

	}

}

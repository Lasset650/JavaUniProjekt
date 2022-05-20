package lexer;

public class BracketState implements LexerState {

	@Override
	public void scan(Character c, LexerImpl lexer) {
		lexer.addToken(TokenTable.getInstance().get(c));
		lexer.skip();
		lexer.setState(new SelectionState());

	}

}

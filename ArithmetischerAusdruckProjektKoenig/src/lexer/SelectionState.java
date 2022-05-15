package lexer;

public class SelectionState implements LexerState {

	@Override
	public void scan(Character c, LexerImpl lexer) {
		
		if(Character.isWhitespace(c)) {
			lexer.setState(new WhiteSpaceState());
			return;		
		}
		if(Character.isDigit(c)) {
			lexer.setState(new DigitState());
			return;
		}
		if (c == '+' || c == '*') {
			lexer.setState(new OperatorState());
			return;
		}
	}

}

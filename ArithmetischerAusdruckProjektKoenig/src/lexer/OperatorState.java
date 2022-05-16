package lexer;

import tokens.Operator;

public class OperatorState implements LexerState {

	@Override
	public void scan(Character c, LexerImpl lexer) {
		lexer.addToken(new Operator(c));
		lexer.setState(new SelectionState());;

	}

}

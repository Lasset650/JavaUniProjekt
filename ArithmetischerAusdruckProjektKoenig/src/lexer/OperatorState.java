package lexer;

import tokens.Operator;

public class OperatorState implements LexerState {

	@Override
	public void scan(Character c, LexerImpl lexer) {
		lexer.addToken(TokenTable.getInstance().get(c));
		lexer.skip();
		lexer.setState(new SelectionState());;

	}

}

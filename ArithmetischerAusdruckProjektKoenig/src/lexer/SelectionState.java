package lexer;

import tokens.Bracket;
import tokens.Operator;
import tokens.Token;

public class SelectionState implements LexerState {

	@Override
	public void scan(Character c, LexerImpl lexer) throws UnbekanntCExeption {
		
		Token token = TokenTable.getInstance().get(c);
		
		if(Character.isWhitespace(c)) {
			lexer.setState(new WhiteSpaceState());
			return;		
		}
		if(Character.isDigit(c)) {
			lexer.setState(new DigitState());
			return;
		}
		if (token instanceof Operator) {
			lexer.setState(new OperatorState());
			return;
		}
		if (token instanceof Bracket) {
			lexer.setState(new BracketState());
			return;
		}
		throw new UnbekanntCExeption(TextConstante.FEHLERTEXT1 + c);
			
	}

}

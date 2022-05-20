package lexer;

import tokens.NaturalNumber;

public class DigitState implements LexerState {
	
	private String collectedDigits;
	public DigitState() {
		this.collectedDigits = "";
	}
	
	@Override
	public void scan(Character c, LexerImpl lexer) {
		if(Character.isDigit(c)) {
			this.collectedDigits = this.collectedDigits + c;
			lexer.skip();
			if (lexer.isEmpty()) {
				lexer.addToken(new NaturalNumber(Integer.parseInt(this.collectedDigits)));
				lexer.setState(new SelectionState());
			}
		}else {
			lexer.addToken(new NaturalNumber(Integer.parseInt(this.collectedDigits)));
			lexer.setState(new SelectionState());
		}
		

	}

}

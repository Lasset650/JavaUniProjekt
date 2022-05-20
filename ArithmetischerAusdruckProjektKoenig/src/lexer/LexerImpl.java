package lexer;

import java.util.ArrayList;
import java.util.List;

import tokens.Token;

public class LexerImpl implements Lexer {
	
	private String currentExpression;
	private List<Token> currentResult;
	private LexerState state;
	
	public LexerImpl() {
		this.currentResult = new ArrayList<>();
		this.state = new SelectionState();
	}
	
	@Override
	public List<Token> toTokenSequence(String expr) throws UnbekanntCExeption {
		this.currentExpression = expr;
		while(!this.currentExpression.isEmpty()) 
			this.state.scan(this.currentExpression.charAt(0), this);		
		return this.currentResult;
	}
	public void setState(LexerState nextState) {
		this.state = nextState;
		
	}
	/**
	 * Entfernt aus currentExpression das erste Zeichen
	 */
	public void skip() {
		if (!currentExpression.isEmpty()) {
			this.currentExpression = this.currentExpression.substring(1);
		}
	}
	
	/**
	 * Ergänzt ein weiteres Token in der Token Liste
	 */
	public void addToken(Token t) {
		this.currentResult.add(t);
	}
	public boolean isEmpty() {
		return this.currentExpression.isEmpty();
	}
	public String toString(List<Token> tokenList) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < tokenList.size(); i++) {
			builder.append(tokenList.toString().charAt(i));
		}
		String string = builder.toString();
		return string;
	}

}
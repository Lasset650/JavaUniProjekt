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
	public List<Token> toTokenSequence(String expr) {
		this.currentExpression = expr;
		// TODO Bearbeitung mittels State-Objekten
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
		//TODOD: Maßnahme, wenn this.currentExpression leer ist
		this.currentExpression = this.currentExpression.substring(1);
	}
	
	/**
	 * Ergänzt ein weiteres Token in der Token Liste
	 */
	public void addToken(Token t) {
		this.currentResult.add(t);
	}

}
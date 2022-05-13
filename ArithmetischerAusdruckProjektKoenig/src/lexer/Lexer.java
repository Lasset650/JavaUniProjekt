package lexer;

import java.util.List;
import tokens.Token;

public interface Lexer {
	/**
	 * 
	 * Transformiert den Zeichenstrom @param expr
	 * ist eine Token-Liste
	 */
	public List<Token> toTokenSequence(String expr);

}

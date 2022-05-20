package lexer;

import java.util.HashMap;
import java.util.Map;

import tokens.AdditionToken;
import tokens.BracketClose;
import tokens.BracketOpen;
import tokens.MultiplayToken;
import tokens.Token;

public class TokenTable {
	
	private static TokenTable theOneOnlyInstance;
	private Map<Character, Token> table;

	private TokenTable() {
		this.table = new HashMap<>();
		this.fillTable();
	}

	public static TokenTable getInstance() {
		if (theOneOnlyInstance == null)
			theOneOnlyInstance = new TokenTable();
		return theOneOnlyInstance;
	}

	private void fillTable() {
		this.table.put(TextConstante.ADD, new AdditionToken());
		this.table.put(TextConstante.MULTIPLIER, new MultiplayToken());
		this.table.put(TextConstante.BRACKETOPEN, new BracketOpen());
		this.table.put(TextConstante.BRACKETCLOSED, new BracketClose());
	}

	public Token get(Character c) {
		return this.table.get(c);
	}

}

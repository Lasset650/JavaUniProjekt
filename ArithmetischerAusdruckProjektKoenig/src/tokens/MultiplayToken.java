package tokens;

import lexer.TextConstante;

public class MultiplayToken implements Operator {
	
	private static MultiplayToken theInstance;
	
	public MultiplayToken(){
		super();
	}
	public static MultiplayToken getTheInstance(){
		if (theInstance==null) theInstance = new MultiplayToken();
		return theInstance;
	}	
	public String toString(){
		return TextConstante.MULTIPLIER.toString();
	} 

}

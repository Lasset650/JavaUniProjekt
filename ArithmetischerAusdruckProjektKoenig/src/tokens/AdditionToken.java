package tokens;

import lexer.TextConstante;

public class AdditionToken implements Operator {
	
private static AdditionToken theInstance;
	
	public AdditionToken(){
		super();
	}
	public static AdditionToken getTheInstance(){
		if (theInstance==null) theInstance = new AdditionToken();
		return theInstance;
	}	
	public String toString(){
		return TextConstante.ADD.toString();
	}

}

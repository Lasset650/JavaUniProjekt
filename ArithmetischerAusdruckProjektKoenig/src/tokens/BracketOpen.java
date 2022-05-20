package tokens;

import lexer.TextConstante;

public class BracketOpen implements Bracket {
	
	/**
	 * Singleton-Entwurfsmuster: Einzige Instanz 
	 */	
		private static BracketOpen theInstance;
		
		public BracketOpen(){
			super();
		}
	/**
	 * Gibt DIE einzige Instanz zur�ck
	 */	
		public static BracketOpen getTheInstance(){
			if (theInstance==null) theInstance = new BracketOpen();
			return theInstance;
		}
		
		public String toString(){
			return TextConstante.BRACKETOPEN.toString();
		}

}

package tokens;

import lexer.TextConstante;

public class BracketClose implements Bracket {
	
	/**
	 * Singleton-Entwurfsmuster: Einzige Instanz 
	 */	
		private static BracketClose theInstance;
		
		public BracketClose(){
			super();
		}
	/**
	 * Gibt DIE einzige Instanz zur�ck
	 */	
		public static BracketClose getTheInstance(){
			if (theInstance==null) theInstance = new BracketClose();
			return theInstance;
		}
		
		public String toString(){
			return TextConstante.BRACKETCLOSED.toString();
		}

}

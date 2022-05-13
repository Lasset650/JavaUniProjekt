package lexer;
/**
 * Objekte repräsentieren verschiedene Zustände des Lexers *
 */
public interface LexerState {
	/**
	 * 
	 * Kann das @param c aus der Eingabe entfernen
	 * Kann Token an den @param lexer senden
	 * Kann Zustand wechseln
	 */
	public void scan(Character c, LexerImpl lexer);

}

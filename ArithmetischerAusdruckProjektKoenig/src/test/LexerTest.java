package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import lexer.Lexer;
import lexer.LexerImpl;
import lexer.UnbekanntCExeption;
import tokens.NaturalNumber;
import tokens.Token;

class LexerTest {

	@Test
	void test1() throws UnbekanntCExeption {
		Lexer lexer = new LexerImpl();
		List<Token> expected = new ArrayList<>();
		expected.add(new NaturalNumber(23));
		assertEquals(expected, lexer.toTokenSequence("23") );
	}
	@Test
	void test2() throws UnbekanntCExeption {
		Lexer lexer = new LexerImpl();
		List<Token> expected = new ArrayList<>();
		expected.add(new NaturalNumber(23));
		assertEquals(expected, lexer.toTokenSequence("23 ") );
	}

}

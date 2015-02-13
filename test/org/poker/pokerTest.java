package org.poker;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class pokerTest{
	@Test
	public void TestHighestWhite(){
		ArrayList<String> white = createHand("9C","7D");
		ArrayList<String> black = createHand("5D","2H");
		
		assertEquals("White wins !", Poker.result(white, black));
		
		}
	@Test
	public void TestHighestBlack(){
		ArrayList<String> white = createHand("6C","7D");
		ArrayList<String> black = createHand("8D","2H");
		
		assertEquals("Black wins !", Poker.result(white, black));
		
		}

	private ArrayList<String> createHand(String card1, String card2) {
		ArrayList<String> hand = new ArrayList<String>();
		hand.add(card1);
		hand.add(card2);
		return hand;
	}
	
}
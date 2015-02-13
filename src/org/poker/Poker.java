package org.poker;

import java.util.ArrayList;

public class Poker {

	public static String result(ArrayList<String> White, ArrayList<String> Black) {
		String whiteHighest = getHighest(White);
		String blackHighest = getHighest(Black);
		if (whiteHighest.compareTo(blackHighest) > 0){
			return "White wins !";
		}
		else{
			return "Black wins !";
		}
			

	}
	private static String getHighest(ArrayList<String> Hand ){
		String card1 = Hand.get(0);
		String card2 = Hand.get(1);
		String Highest;
		if(card1.compareTo(card2) > 0){
			 Highest= card1;
		}
		else{
			Highest = card2;
		}
		return Highest;
	}

}

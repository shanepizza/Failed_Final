import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Untitled {
	public static void main(String[] args) {
			FaceCard card[][] = new FaceCard[4][13];
			for(int y = 0; y != 3; ++y){
				for (int x = 0; x != 12; ++x){
					card[y][x] = new FaceCard(x, y, "Black");					
				}//end first for					
			}//end for
			int value;
			value = (card[2][4].getSuit()*10) + card[2][4].getFaceNumber();
			String value2 = Integer.toString(value);
			//BlackJackScreen.leftCard = new JButton(value2);
			
						
			BlackJackScreen game = new BlackJackScreen();
			game.setVisible(true);
			game.setSize(700, 500);	
						
						
			
	}//end main
		
}//end class
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.applet.*;

class BlackJackScreen extends JFrame implements ActionListener {
	

	//JPanel card = new JPanel();
	//JLabel newLab = new JLabel("Wow!");
	//card.add(newLab);
//	Graphics draws = getGraphics();
	//draws.drawString("Hey!", 50, 100);
	
	
	
	
	
	
	String sx = "1";
	String sy = "2";
	JButton leftCard = new JButton(sy);
	JButton rightCard = new JButton(sx);
	JButton opLeftCard = new JButton(sy);
	JButton opRightCard = new JButton(sx);	
	JButton deck = new JButton("Deck");
	//JPanel cardsInHand = new JPanel();
	
	JButton draw = new JButton("Draw");
	JButton stand = new JButton("Stand");
	Container con = getContentPane();
	Color someColor = new Color(0, 150, 0);
	//JPanel ttest = new JPanel();
	int x = 1;
	
	//JLabel images = new JLabel();
	
	
	
///Method********************	
	public BlackJackScreen(){
		con.setLayout(null);
		con.setSize(250, 100);
		con.add(draw);
		con.add(stand);
		con.add(rightCard);
		con.add(leftCard);
		con.add(opLeftCard);
		con.add(opRightCard);
		con.add(deck);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		draw.setBounds(525, 410, 150, 50);
		stand.setBounds(20, 410, 150, 50);
		rightCard.setBounds(350, 325, 100, 125);
		leftCard.setBounds(250, 325, 100, 125);
		opLeftCard.setBounds(250, 1, 100, 125);
		opRightCard.setBounds(350, 1, 100, 125);
		deck.setBounds(20, 200, 100, 125);
		con.setBackground(someColor);
		draw.addActionListener(this);
		stand.addActionListener(this);
		//draws.drawString("Hey!", 50, 100);	
		//cardsInHand.add(leftCard);
		//cardsInHand.add(rightCard);
		//cardsInHand.setBounds(225, 300, 400, 400);
		//paint(Graphics g;)
		//g.setColor(Color.BLACK);
		//con.add(images);
		
		//images.setLocation(200, 250);
			
	}//end method
// Another Method***********
	public void actionPerformed(ActionEvent e){
		System.out.print(x);
		
				
	}
	
}//end class 
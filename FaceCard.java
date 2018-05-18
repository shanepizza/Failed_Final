class FaceCard extends Card {
	
	private int suit; 
	
	FaceCard(int cNumx, int cNumy, String c ){
		 if(cNumy != 0){
			cardNumber = 13 * cNumy;
		}//end if
		cardNumber += cNumx + 1;
		
		
		faceNumber = cNumx + 1;
		cardColor = c;
		suit = cNumy;
		
	}// end face card object
	FaceCard(){
		cardColor = "C";
		cardNumber = 1;
		faceNumber = 2;
		suit = 1;
	}
	//public void Shuffle(Array cards[52]){
	//	for(int x = 0; int x < 53; ++x){
	//	cards[x].getCardNumber();
	//	}
	//}//end shuffle method
	public int getCardNumber(){
		return cardNumber;
	}
 	public void setCardNumber(int num){
		cardNumber = num;
	}
	public int getFaceNumber(){
		return faceNumber;
	}
	public void setFaceNumber(int num){
		faceNumber = num;
	}
	public String getCardColor(){
		return cardColor;
	}
	public void setCardColor(String c){
		cardColor = c;
	}
	public int getSuit(){
		return suit;
	}
	public void setSuit(int s){
		suit = s;
	}
	
	
}//end class
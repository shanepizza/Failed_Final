abstract class Card {
	protected  int cardNumber;
	protected  int faceNumber;
	protected  String cardColor;
	
	
	
	Card(){
		
	}
	void Shuffle(){
		
	}
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
}

public class Balken {
	
	//attributes
	private int number;
	private String balken;
	private int balkenLaenge;
	private int yPos;
	
	
	//constructor
	public Balken(int number, int balkenLaenge) {
		this.number = number;
		this.balken = "";
		this.balkenLaenge = balkenLaenge;
		this.yPos = 0;
	}
	
	
	//getter and setter
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getBalken() {
		return balken;
	}

	public void setBalken(String balken) {
		this.balken = balken;
	}

	public int getBalkenLaenge() {
		return balkenLaenge;
	}


	public void setBalkenLaenge(int balkenLaenge) {
		this.balkenLaenge = balkenLaenge;
	}


	public int getyPos() {
		return yPos;
	}


	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	


}


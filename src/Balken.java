
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

/*
package sort.preparation;

import java.util.Arrays;

public class BlubbleSort {

	public static void main(String[] args) {

		int[] numbers = { 1, 5, 8, 2, 7, 4 };
		
		System.out.println("Unsortiert:\t" + Arrays.toString(numbers));
		bubbleSort(numbers);
		System.out.println("Sortiert:\t" + Arrays.toString(numbers));
	}

	public static void bubbleSort(int[] numbers) {
		
		for (int i = 1; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
	}
}

// Sort Animation: https://www.youtube.com/watch?v=9I2oOAr2okY


*/

	

/*

	//=======================================================================
	public void bootEinsetzen(Rennstrecke rennstrecke) {
		String boatAndTrackStringB = "";
		String boatAndTrackStringM = "";
		String boatAndTrackStringS = "";
		String empty = " ";
		
		boatAndTrackStringM = " |" + empty.repeat((this.xPos-1) - this.lengthOfBoot) + this.getBootMitte() + empty.repeat(rennstrecke.getLengthRaceTrack() - (this.getxPos())+1) +"|";
		if (this.isRuderVorn()) {
			boatAndTrackStringB = " |" + empty.repeat((this.xPos-1) - this.lengthOfBoot) + this.getBackBoardRuderVorn() + empty.repeat(rennstrecke.getLengthRaceTrack() - (this.getxPos())+1) +"|";
			boatAndTrackStringS = " |" + empty.repeat((this.xPos-1) - this.lengthOfBoot) + this.getSteuerBoardRuderVorn() + empty.repeat(rennstrecke.getLengthRaceTrack() - (this.getxPos())+1) +"|";
		} else {
			boatAndTrackStringB = " |" + empty.repeat((this.xPos-1) - this.lengthOfBoot) + this.getBackBoardRuderHinten() + empty.repeat(rennstrecke.getLengthRaceTrack() - (this.getxPos())+1) +"|";
			boatAndTrackStringS = " |" + empty.repeat((this.xPos-1) - this.lengthOfBoot) + this.getSteuerBoardRuderHinten() + empty.repeat(rennstrecke.getLengthRaceTrack() - (this.getxPos())+1) +"|";
		}
		
				
		rennstrecke.setBackboardWater(boatAndTrackStringB);
		rennstrecke.setMiddleStringBoat(boatAndTrackStringM);
		rennstrecke.setStarboardWater(boatAndTrackStringS);
		
		setRuderVorn(!isRuderVorn());
				 
	}

	

//=======================================================================
	public int compareTo(Boot compareBoot) {
		
		if (this.sortierSchalter == false) {
			
			int comparePosition = ((Boot) compareBoot).getLeistungBoot();
			
			//ascending order
			//return this.leistungBoot - compareQuantity;
			
			//descending order
			return comparePosition - this.leistungBoot;
		} else {
			
			int compareBahnen = ((Boot) compareBoot).getbahnNummer();
			
			//ascending order;-)");
			return this.bahnNummer - compareBahnen;
			
			//descending order
			//return comparePosition - this.leistungBoot;
		}
		
	}



//================================================================================
	public double luckFaktor() {
	
		return 1.0;
		
	}

	
//================================================================================
	public void rangSetBoote(double streckeBereitsGerudert, int zahlDerBoote, int betrachtungsBahn) {
		int schnellereBoote = 0;
		int langsamereBoote = 0;
		int gleichSchnelleBoote = 0;
		
		for (int i = 0; i < zahlDerBoote; i++) {
			if (this.bahnNummer == betrachtungsBahn) {
				// mache nichts bei Vergleich der Bahnnummer mit sich selbst
				System.out.println("this bahnNUmmer: " +this.bahnNummer);
			} else {
				// 3 Möglichkeiten des Zählers...
				if (streckeBereitsGerudert > this.streckeMade) {
					schnellereBoote++;
				} else if (streckeBereitsGerudert < this.streckeMade) {
					langsamereBoote++;
				} else {
					gleichSchnelleBoote++;
				}
				}
			}
		/*
			System.out.println("schnellereBoote: " +schnellereBoote);
			System.out.println("langsamereBoote: " +langsamereBoote);
			System.out.println("gleichschnelleBoote: " +gleichSchnelleBoote);
			
			System.out.println("streckeBereitsGerudert: " +streckeBereitsGerudert);
			System.out.println("this.streckeMade: " +this.streckeMade);
			
		}
		
	
		
	
	
	
	

}







*/

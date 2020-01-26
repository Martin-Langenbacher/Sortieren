import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class RunSortieren {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		// static: variables belong to class - not to object only...
		int anzahlBalken = 40;
		String balkenString = "";
		String balkenTeil = "***";
		int zaehler = 0;
		String eingabe;
		int sortMethod = 1;

		// Welche Sortier-Methode?
		while (zaehler == 0) {

			try {
				System.out.println("Bitte wählen Sie eine Sortiermethode:");
				System.out.println("1: BubbleSort");
				System.out.println("2: SelectionSort");
				System.out.println("3: QuickSort");
				System.out.println("4: MergeSort");
				System.out.println("5: xy-Sort");
				eingabe = br.readLine();
				sortMethod = Integer.parseInt(eingabe);
			}

			catch (NumberFormatException ausnahme) {
				System.out.println("Bitte eine Zahl eingeben!");
				continue;
			}
			zaehler++;
		}

		if ((sortMethod != 1) && (sortMethod != 2) && (sortMethod != 3) && (sortMethod != 4) && (sortMethod != 5)) {
			sortMethod = 1;
			System.out.println(
					"Falsche Zahl eingegeben, darum ist die Anzahl der Ruderer auf " + sortMethod + " gesetzt worden.");
		}

		// erstelle Balken
		ArrayList<Balken> balken = new ArrayList<>();

		for (int i = 0; i < anzahlBalken; i++) {
			balken.add(new Balken(i, i + 1));
		}

		for (int i = 0; i < anzahlBalken; i++) {
			balkenString = balkenTeil.repeat(i + 1);
			balken.get(i).setBalken(balkenString);
			balken.get(i).setyPos(i + 1);
		}

		System.out.println("Balken nach der Erstellung und vor dem Mischen:");
		for (int i = 0; i < anzahlBalken; i++) {
			System.out.println("i: " + balken.get(i).getBalkenLaenge() + " " + balken.get(i).getBalken() + "| "
					+ "y-Pos: " + balken.get(i).getyPos());
		}

		// Mische Karten:
		Collections.shuffle(balken);

		System.out.println("Balken nach dem Mischen===================================");
		for (int i = 0; i < anzahlBalken; i++) {
			balken.get(i).setyPos(i + 1);
			System.out.println(i + "i/number: " + balken.get(i).getBalkenLaenge() + " " + balken.get(i).getBalken()
					+ "| " + "y-Pos: " + balken.get(i).getyPos());
		}

		// Sortieren
		System.out.println("Vor dem Sortieren ===============================================");
		System.out.println("Start Sort");

		switch (sortMethod) {
		case 1:
			// ======================================================================
			// BubbleSort
			// ======================================================================
			bubbleSort(balken, anzahlBalken);
			break;
		case 2:
			// ======================================================================
			// SelectionSort
			// ======================================================================
			selectionSort(balken, anzahlBalken);
			break;
		case 3:
			// ======================================================================
			// QuickSort
			// ======================================================================
			quickSort(balken, anzahlBalken);
			break;
		case 4:
			// ======================================================================
			// MergeSort
			// ======================================================================
			mergeSort(balken, anzahlBalken);
			break;
		case 5:
			// ======================================================================
			// xxxxxxxxxxxxxxxxxx
			// ======================================================================
			// bubbleSort(balken, anzahlBalken);
			break;

		default:
			System.out.println("Leider die falsche Zahl - Sortieren funktioniert nicht!");
			break;
		}

		System.out.println(" ");
		System.out.println(
				"=====>>>   End of Sort   <<<============================================================================================");

		for (int k = 0; k < anzahlBalken; k++) {
			System.out.println(balken.get(k).getBalken());
		}

		System.out.println("End Sort");

		/*
		 * For test reasons !
		 * =============================================================================
		 * === System.out.
		 * println("Balken ganz am Ende: Später wieder diesen Programm-Code löschen...:"
		 * ); for (int i = 0; i < anzahlBalken; i++) { System.out.println("i: " +
		 * balken.get(i).getBalkenLaenge() + " " + balken.get(i).getBalken() + "| " +
		 * "y-Pos: " + balken.get(i).getyPos()); }
		 */

	}

//========================================================================================	MergeSearch

	public static void mergeSort(ArrayList<Balken> balken, int anzahlBalken) {

		String[] balkenArray;
		balkenArray = new String[anzahlBalken];

		for (int i = 0; i < anzahlBalken; i++) {
			balkenArray[i] = balken.get(i).getBalken();
		}

		mergeSort(balken, balkenArray, 0, anzahlBalken - 1, anzahlBalken);
	}


	

// mergeSort 2: mit Start- und End-Wert	

	private static void mergeSort(ArrayList<Balken> balken, String[] balkenArray, int start, int end, int anzahlBalken) {

		if (start < end) {

			int middle = (start + end) / 2;

			mergeSort(balken, balkenArray, start, middle, anzahlBalken);
			mergeSort(balken, balkenArray, middle + 1, end, anzahlBalken);

			merge(balkenArray, start, middle, end, anzahlBalken);

		}
	}

// merge: Belongs to mergeSort

	private static void merge(String[] balkenArray, int start, int middle, int end, int anzahlBalken) {

		int size_left = middle - start + 1;
		int size_right = end - middle;

		String strings_left[] = new String[size_left];
		String strings_right[] = new String[size_right];

		for (int i = 0; i < size_left; i++)
			strings_left[i] = balkenArray[start + i];

		for (int j = 0; j < size_right; j++)
			strings_right[j] = balkenArray[middle + 1 + j];

		int i = 0, j = 0;

		int k = start;
		while (i < size_left && j < size_right) {
			if (strings_left[i].length() <= strings_right[j].length()) {
				balkenArray[k] = strings_left[i];
				balken.
				
				// balken.get(j).setBalken(tempString);
				// balkenArray[i] = balken.get(i).getBalken();
				i++;
			} else {
				balkenArray[k] = strings_right[j];
				j++;
			}
			k++;
		}

		while (i < size_left) {
			balkenArray[k] = strings_left[i];
			i++;
			k++;
		}
		while (j < size_right) {
			balkenArray[k] = strings_right[j];
			j++;
			k++;
		}
	}

//========================================================================================	QuickSort

	public static void quickSort(ArrayList<Balken> balken, int anzahlBalken) throws InterruptedException {

		quickSort(balken, 0, anzahlBalken - 1, anzahlBalken);
	}

	// quickSort 2: Mit Start- und End-Wert
	private static void quickSort(ArrayList<Balken> balken, int start, int end, int anzahlBalken)
			throws InterruptedException {

		if (start < end) {
			int pivot = partition(balken, start, end, anzahlBalken);
			quickSort(balken, start, pivot - 1, anzahlBalken);
			quickSort(balken, pivot + 1, end, anzahlBalken);
		}
	}

// partition: Belongs to QuickSort
	private static int partition(ArrayList<Balken> balken, int start, int end, int anzahlBalken)
			throws InterruptedException {

		int pivot = balken.get(end).getNumber();
		// int pivot = numbers[end];

		int i = start - 1;
		// int i = start - 1;

		for (int j = start; j < end; j++) {

			if (balken.get(j).getNumber() < pivot) {
				i++;

				int temp = balken.get(i).getNumber();
				String tempString = balken.get(i).getBalken();
				balken.get(i).setNumber(balken.get(j).getNumber());
				balken.get(i).setBalken(balken.get(j).getBalken());
				balken.get(j).setNumber(temp);
				balken.get(j).setBalken(tempString);
			}

//*************************************************************************************************************			
			// show the balken...
			System.out.println(" ");
			System.out.println(
					"=====>>>   QuickSort   <<<============================================================================================");

			for (int k = 0; k < anzahlBalken; k++) {
				System.out.println(balken.get(k).getBalken());
			}

			// Zeitverzögerung
			// slowing down time...
			Thread.sleep(100, 0);
			// end of "show the balken ....
//*************************************************************************************************************				

		}

		int temp = balken.get(i + 1).getNumber();
		String tempString = balken.get(i + 1).getBalken();
		balken.get(i + 1).setNumber(balken.get(end).getNumber());
		balken.get(i + 1).setBalken(balken.get(end).getBalken());
		balken.get(end).setNumber(temp);
		balken.get(end).setBalken(tempString);

		return i + 1;
	}

//========================================================================================	SelectionSort

	private static void selectionSort(ArrayList<Balken> balken, int anzahlBalken) throws InterruptedException {

		int tempInt;
		String tempString;

		for (int i = 0; i < anzahlBalken - 1; i++) {

			for (int j = i + 1; j < anzahlBalken; j++) {

				System.out.println(" ");
				System.out.println(
						"=====>>>   SelectionSort   <<<============================================================================================");

				if (balken.get(i).getNumber() > balken.get(j).getNumber()) {
					tempInt = balken.get(i).getNumber();
					tempString = balken.get(i).getBalken();
					// tempInt = balken.get(j - 1).getNumber();
					// tempString = balken.get(j - 1).getBalken();
					balken.get(i).setNumber(balken.get(j).getNumber());
					balken.get(i).setBalken(balken.get(j).getBalken());
					// balken.get(j - 1).setNumber(balken.get(j).getNumber());
					// balken.get(j - 1).setBalken(balken.get(j).getBalken());
					balken.get(j).setNumber(tempInt);
					balken.get(j).setBalken(tempString);
					// balken.get(j).setNumber(tempInt);
					// balken.get(j).setBalken(tempString);
				}

				for (int k = 0; k < anzahlBalken; k++) {
					System.out.println(balken.get(k).getBalken());
				}

				// Zeitverzögerung
				// slowing down time...
				Thread.sleep(50, 0);

			}

		}

	}

//========================================================================================	bubbleSort

	private static void bubbleSort(ArrayList<Balken> balken, int anzahlBalken) throws InterruptedException {

		int tempInt;
		String tempString;

		for (int i = 1; i < anzahlBalken; i++) {

			for (int j = anzahlBalken - 1; j >= i; j--) {
				System.out.println(" ");
				System.out.println(
						"=====>>>   BubbleSort   <<<============================================================================================");

				if (balken.get(j - 1).getNumber() > balken.get(j).getNumber()) {
					tempInt = balken.get(j - 1).getNumber();
					tempString = balken.get(j - 1).getBalken();
					balken.get(j - 1).setNumber(balken.get(j).getNumber());
					balken.get(j - 1).setBalken(balken.get(j).getBalken());
					balken.get(j).setNumber(tempInt);
					balken.get(j).setBalken(tempString);
				}

				for (int k = 0; k < anzahlBalken; k++) {
					System.out.println(balken.get(k).getBalken());
				}

				// Zeitverzögerung
				// slowing down time...
				Thread.sleep(50, 0);

			}

		}

	}

}

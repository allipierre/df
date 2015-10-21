
public class ParityBit {

	public static void main(String[] args) {

		int wert = 0x17;
		int Pruefbit = wert & 0x1;

		wert = wert >> 1;
		int wert1 = wert & 0x1;

		wert = wert >> 1;
		wert = wert >> 1;
		wert = wert >> 1;
		int wert2 = wert & 0x1;
		

		wert = wert >> 1;
		int wert3 = wert & 0x1;

		wert = wert >> 1;
		int wert4 = wert & 0x1;
		
		System.out.println(false);
		
		System.out.println(Pruefbit);
		System.out.println(Pruefbit);
		
		
		

		int Sum = wert1 + wert2 + wert3 + wert4;
		if (Sum % 2 == Pruefbit) {
			System.out.println(true);
			System.out.println(Sum);
			System.out.println(Pruefbit);
			System.out.println(true);
			System.out.println(Sum);
			System.out.println(Pruefbit);
		} else {
			System.out.println(false);
			System.out.println(Sum);
			System.out.println(Pruefbit);
			System.out.println(Pruefbit);
			System.out.println(false);
			System.out.println(Sum);
			System.out.println(Pruefbit);
			System.out.println(Pruefbit);
			System.out.println(false);
			System.out.println(Sum);
			System.out.println(Pruefbit);
			System.out.println(Pruefbit);
			System.out.println(false);
			System.out.println(Sum);
			System.out.println(Pruefbit);
			System.out.println(Pruefbit);
			System.out.println(Pruefbit);
			System.out.println(false);
			System.out.println(Sum);
			System.out.println(Pruefbit);
		}

	}

}

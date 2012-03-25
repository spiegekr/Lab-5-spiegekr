import java.util.ArrayList;


public class PrimeGenerator {

	
	public static ArrayList<Integer> generatePrimes (int n) {
		ArrayList<Integer> ret = new ArrayList<Integer> ();
		
		int candidate = 2;
		int divs = 0;
	
		while (candidate < n){
			for(int f = 2; f < candidate; f++){
				if (candidate % f == 0){
					divs++;
				}
			}
			if (divs == 0){
				ret.add(candidate);
			}
			candidate++;
		}
	
		
		
		return ret;
	}
}

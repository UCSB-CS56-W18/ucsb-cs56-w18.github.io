public class AllFactors {
    public static void main(String [] args) {
	for (int i=1;i<=100;i++) {
	    Factors f = Factors.primeFactors(i);
	    System.out.println("i: " + i + " factors: " + f); 
	}
    }
}

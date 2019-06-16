import java.lang.Math;
public class PythagoreanTheorem {
    public double calculateHypotenuse(int legA, int legB) {
    	double legC;
    	double squareRoot;
        // the hypotenuse is the side across the right angle. 
        // calculate the value of c given legA and legB
    	legC = Math.pow(legA, 2) + Math.pow(legB, 2);
    	System.out.println(legC);
    	squareRoot= Math.sqrt(legC);
    	
    	return squareRoot;
    }
}


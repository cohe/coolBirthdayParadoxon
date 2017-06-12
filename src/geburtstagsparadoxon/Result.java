package geburtstagsparadoxon;

public class Result {
    void printResults(){
        
        Calculator calculator = new Calculator();
        
        calculator.calculateProbability();
        System.out.println("Wahrscheinlichkeit doppelter Geburtstag: " + calculator.matchProb + " bzw. " + calculator.matchProb*100 + " %" );
    }
}

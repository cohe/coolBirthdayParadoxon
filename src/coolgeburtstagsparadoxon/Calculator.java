package coolgeburtstagsparadoxon;

public class Calculator {

    int people = 22;
    int days = 366;
    double matchProb = 0.0;
    double diffProb = 1;
    double counter = 0;
    double dividor = 0;

    void calculateProbability(){
        
        for(int i = 0; i <= people; i++){
            counter = days - i;
            dividor = days;
            
            System.out.println("Nicht vergebene Tage:" + counter);
            System.out.println("Tage insgesamt: " + dividor);
            System.out.println("Wahrscheinlichkeit freier Tag gewählt: " + counter/dividor * 100 + " %");
            diffProb *= counter/dividor;
            System.out.println("Gesamtwahrscheinlichkeit nur verschiedene Geburtstage: " + diffProb * 100 + " %");
        }

        matchProb = 1 - diffProb;
        
    }
    
    
}



package questionfour;


public class QuestionFour {

    public static void main(String[] args) {
         // Total amount of porridge and milk in liters
        double totalPorridge = 2.0; 
        double totalMilk = 2.0;     

        // Amount the baby eats in one feeding
        double porridgePerFeeding = 0.5; 
        double milkPerFeeding = 0.5;     

        // Time until the baby needs to be fed again
        int timeForPorridge = 45; 
        int timeForMilk = 30;     

        // Calculate the total time
        double totalTime = 0;
         // Calculate time for porridge
        while (totalPorridge >= porridgePerFeeding) {
            totalPorridge -= porridgePerFeeding; 
            totalTime += timeForPorridge;        
        }

        // Calculate time for milk
        while (totalMilk >= milkPerFeeding) {
            totalMilk -= milkPerFeeding; 
            totalTime += timeForMilk;     
        }

        // Print the total time
        System.out.println("Total time for the baby to finish all meals: " + totalTime + " minutes");

        
        
    }
}

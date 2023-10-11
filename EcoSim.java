public class EcoSim
{
   private String predatorName;
   private String preyName;
   private int predatorPop;
   private int preyPop;
   private double predatorPopRate;
   private double preyPopRate;
   private int yearNum;
   
   public EcoSim(){
      predatorName = "lion";
      preyName = "zebra";
      predatorPop = 1000;
      preyPop = 2000;
      predatorPopRate = 0.95;
      preyPopRate = 1.05;
      yearNum = 0;
   }
   
   public void simulateOneYear(){
      yearNum++;
      if (Math.random() < 0.2){
         predatorPop = (int)(predatorPop * (predatorPopRate - 0.05));
         preyPop = (int)(preyPop * (preyPopRate - 0.05));
      } else {
         predatorPop = (int)(predatorPop * predatorPopRate);
         preyPop = (int)(preyPop * preyPopRate);
      }
   }
   
   public boolean checkPredatorPreyMatches(String line){
      int firstComma = line.indexOf(",");
      int secondComma = line.indexOf(",", firstComma+1);
      String lineCompare = line.substring(0, secondComma);
      String correct = predatorName + "," + preyName;
      return lineCompare.equals(correct);
   }
}
public class Truck{
    private boolean breakdownTurnsLeft = false;
    private int turnsBroken = 0;

    public Truck(){
        name = generateRandomName();
        actualSpeed = 100;
    }
    private String generateRandomName(){
        Random random = new Random();
        int truckNumber = random.nextInt(100);
        // zmaiana int na String
        return String.valueOf(truckNumber);
    }
    public void prepareForLap(Race race){
        if(breakdownTurnsLeft){
            actualSpeed = 0;
            turnsBroken += 1;
        }else{
            actualSpeed =100;
            turnsBroken = 0;
        }
        if(turnsBroken == 2){
            breakdownTurnsLeft = false;
        }
    }
    public boolean isBroken(){
        return breakdownTurnsLeft;
    }
    private void riskBreakDown(){
        Random random = new Random();
        double breakdownChance = random.nextDouble();

        if(breakdownChance <= 0.05){
            breakdownTurnsLeft = true;
        }
    }

}
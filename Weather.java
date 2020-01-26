import java.util.Random;

public class Weather{
    private boolean raining;
    
    public void setRaining(){
        double randomNumber = getRandomPrecentage();
        if (randomNumber<= 0.3){
            raining = true;
        
        }else{
            raining = false;
        }
    }
        public boolean getRaining(){
            return raining;
        }

    //generowanie prawdopodobienstwa opadów w % - losowa liczba
    public double getRandomPrecentage(){
        Random random = new Random();
        double randomPrecentage = random.nextDouble();
        return randomPrecentage;
    }
    
}
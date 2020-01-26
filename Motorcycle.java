import java.util.Random;

public class Motorcycle{
    public Motocycle(){
        this.name = generateMotorcycleName();
        normalSpeed = 100;
    }
    private String generateMotorcycleName(){
        Random randomName = new Random();
        int motorcycleNumber = random.nextInt(10-1+1)+1;
        return "Motorcycle" + motorcycleNumber;
    }
    private int speedWhiileRaining(){
        Random random = new Random();
        int randomSpeed = random.nextInt(50-5+1)+5;
        return randomSpeed;
    }
}
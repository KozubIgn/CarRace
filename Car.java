import java.io.RandomAccessFile;
import java.util.Random;

public class Car{
    private int normalSpeed = 0;

    public Car(){
    this.name = generateRandomName();
    }
    private String generateRandomName(){
        //tworzenie array o nazwie carNames
        String [] carNames = {"Tigress", "Elysium", "Vulture", "Moonlight", 
        "Buffalo","Momentum", "Epiphany", "Storm", "Prospect", "Whirlpool"};
        // otrzymanie random name z array o nazwie  carNames
        Random randomName = new Random();
        int index = randomName.nextInt(carNames.length);
        return carNames[index];
    }
    private int getRandomSpeed(){
        Random random = new Random();
        int getRandomSpeed = random.nextInt(110 - 80 +1) + 80;
        return randomSpeed;
    }
    public void prepateForLap(Race race){
        if(race.isThereABrokenTruck()){
            actualSpeed = 75;
        }else{
            actualSpeed = normalSpeed;
        }
    }
}

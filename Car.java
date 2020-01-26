public class Car{
    private int normalSpeed = 0;

    public Car(){
    this.name = generateRandomName();
    }
    private String generateRandomName(){
        String [] carNames = {"Tigress", "Elysium", "Vulture", "Moonlight", 
        "Buffalo","Momentum", "Epiphany", "Storm", "Prospect", "Whirlpool"};
        // otrzymanie random name z array o nazwie  carNames
        Random randomName = new Random();
        int index = randomName.nextInt(carNames.length);
        return carNames[index];
    }
    private int
}

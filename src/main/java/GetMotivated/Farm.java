package GetMotivated;


import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Animal> animalsOnFarm = new ArrayList<>(100);
    private List<Animal> animalVoid = new ArrayList<>(100);

    public void addAnimalToFarm(Animal animal){
        animalsOnFarm.add(animal);
    }

    public void sendAnimalToVoid(Animal animal){
        animalsOnFarm.remove(animal);
        animalVoid.add(animal);
    }

    public void sendAnimalBackToFarm(Animal animal){
        animalVoid.remove(animal);
        animalsOnFarm.add(animal);
    }

}

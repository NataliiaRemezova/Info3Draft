package GetMotivated;

public class Animal {
    private String name;
    private String species;
    private boolean isInVoid;
    private Montage montage;

    public Animal(String species, String name, boolean isInVoid, Montage montage) {
        this.name = name;
        this.species = species;
        this.isInVoid = isInVoid;
        this.montage = montage;
    }

    public void getAnimalInfo(){
        System.out.println("Name: "+this.name);
        System.out.println("Species: "+this.species);
        System.out.println("isInVoid: "+this.isInVoid);
    }
}

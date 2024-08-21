import java.util.Arrays;

public class Farm {
   private String address;

   private Animal[] animal;

   private String OwnerName;

    public Farm(String address, Animal[] animal, String ownerName) {
        this.address = address;
        this.animal = animal;
        OwnerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", animal=" + Arrays.toString(animal) +
                ", OwnerName='" + OwnerName + '\'' +
                '}';
    }
}

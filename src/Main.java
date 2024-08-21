//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Animal[] animals = {
                new Cow(67.4,10,"male","white cow"),
                new Cow(67.1,11,"male","white cow"),
                new Cow(62.4,9,"female","white cow"),
                new Cow(60.9,4,"male","white cow"),
                new Cow(68.5,9,"female","white cow"),

                new Sheep(15.2,5,"female","big sheep"),
                new Sheep(13.2,4,"male","big sheep"),
                new Sheep(11.2,2,"male","big sheep"),

                new Horse(112.2,4,"male","Kunan","topu"),
                new Horse(103.2,4,"male","Kunan","black"),
        };
        Animal[] animals1 = {
                new Cow(69.4,3,"male","white cow"),
                new Sheep(15.2,1,"female","big sheep"),
                new Horse(112.2,4,"male","Kunan","topu"),



        };

        Farm farm1 = new Farm("Tokmok",animals,"Adilet");
        System.out.println(farm1);
        Farm farm2 = new Farm("Sokuluk",animals1,"Kairat");
        System.out.println(farm2);


    }

}
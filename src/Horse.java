public class Horse extends Cow{
    private String color;

    public Horse(double weight, int age, String gender, String nickName, String color) {
        super(weight, age, gender, nickName);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}

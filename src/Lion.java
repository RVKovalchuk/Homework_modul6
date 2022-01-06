public class Lion extends Animal{
    String habitat;

    public Lion(String name, double averageWeight, double averageHight, boolean isVegetarian, String habitat) {
        super(name, averageWeight, averageHight, isVegetarian);
        this.habitat = habitat;
    }

    @Override
    public void getInfo() {
        System.out.println(name +", "+ averageWeight+", "+averageHight+", "+isVegetarian + ", "+ habitat);
    }

}

abstract public class Animal {
    public String name;
    public double averageWeight;
    public double averageHight;
    public boolean isVegetarian;


    public Animal(String name, double averageWeight, double averageHight, boolean isVegetarian) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.averageHight = averageHight;
        this.isVegetarian = isVegetarian;
    }

    abstract public void getInfo();
}

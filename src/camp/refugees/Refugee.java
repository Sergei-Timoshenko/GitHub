package camp.refugees;

public class Refugee extends Character {
    public Refugee(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayName() {
        System.out.println(this.name);
    }

    @Override
    public void sayAge() {
        System.out.println(this.age);
    }
}

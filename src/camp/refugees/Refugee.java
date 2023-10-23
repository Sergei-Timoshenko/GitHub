package camp.refugees;

public class Refugee extends Character {
    @Override
    public void sayName() {
        System.out.println(this.name);
    }

    @Override
    public void sayAge() {
        System.out.println(this.age);
    }
}

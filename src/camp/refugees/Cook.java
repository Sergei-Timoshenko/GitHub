package camp.refugees;

public class Cook extends Character {
    public Cook(String name, int age) {
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

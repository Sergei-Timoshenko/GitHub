package camp.refugees;

public abstract class Character implements CharacterActions {
    protected String name;
    protected int age;
    public Character(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

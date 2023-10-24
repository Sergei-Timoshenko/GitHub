import camp.refugees.Character;
import camp.refugees.Cook;
import camp.refugees.Refugee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cook cook = new Cook("Kyrylo", 27);
        Refugee refugee = new Refugee("Serhii", 22);

        List<Character> characters = new ArrayList<>(List.of(cook, refugee));
        characters.forEach(character -> character.sayAge());
        System.out.println("Hello world!");
        // commit from dev-pick
    }
}
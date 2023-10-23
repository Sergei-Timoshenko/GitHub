package camp;

import java.util.List;

public class Camp {
    private int startDay;
    private int endDay;
    private List<String> characters;

    public Camp(int startDay, int endDay, List<String> characters) {
        this.startDay = startDay;
        this.endDay = endDay;
        this.characters = characters;
    }
}


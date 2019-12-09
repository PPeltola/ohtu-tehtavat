package statistics.matcher;

import statistics.Player;

public class HasFewerThan implements Matcher {

    private HasAtLeast atLeast;

    public HasFewerThan(int value, String category) {
        this.atLeast = new HasAtLeast(value, category);
    }

    @Override
    public boolean matches(Player p) {
        return !atLeast.matches(p);
    }
}

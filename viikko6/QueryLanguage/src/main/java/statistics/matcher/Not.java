package statistics.matcher;

import statistics.Player;

public class Not implements Matcher {

    private Matcher given;

    public Not(Matcher given) {
        this.given = given;
    }

    @Override
    public boolean matches(Player p) {
        return !given.matches(p);
    }
}

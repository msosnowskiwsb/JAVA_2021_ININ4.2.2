package pl.gda.wsb;

import pl.gda.wsb.creatures.Human;

public interface Saleable {
    void sell (Human seller, Human buyer, Double cash) throws Exception;
}

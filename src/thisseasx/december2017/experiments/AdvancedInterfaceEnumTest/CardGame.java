package thisseasx.december2017.experiments.AdvancedInterfaceEnumTest;

import java.util.Map;
import java.util.Set;

public class CardGame {

    public static void main(String[] args) {

        // Made a new deck.
        Deck d = Deck.deckFactory();
        System.out.println(d);

        // Shuffled and split it into 4 decks.
        Map<Integer, Deck> map = d.deal(4, 13);

        // Printed the cards in the individual decks.
        Set<Map.Entry<Integer, Deck>> set = map.entrySet();
        for (Map.Entry<Integer, Deck> entry : set) {
            System.out.printf("Player %s got %s cards:\n", entry.getKey() + 1, entry.getValue().size());
            System.out.println(entry.getValue());
        }

        // Primary deck is empty.
        System.out.println("Cards in deck: \n" + d);
        System.out.println("\nMERGING ALL DECKS...\n");

        // Merged the smaller decks back to the main one.
        for (Map.Entry<Integer, Deck> entry : set) {
            d.addDeck(entry.getValue());
        }

        // Sorted the main deck.
        d.sort();

        // Printed the main deck.
        System.out.println("Cards in deck: \n" + d);
    }
}

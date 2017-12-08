package thisseasx.december2017.experiments.AdvancedInterfaceEnumTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
interface Deck {

    List<Card> getCards();

    static Deck deckFactory() {
        List<Card> cards = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards.add(new PlayingCard(rank, suit));
            }
        }
        Deck d = new StandardDeck(cards);
        d.shuffle();
        return d;
    }

    Card draw();

    int size();

    void addCard(Card card);

    void addCards(List<Card> cards);

    void addDeck(Deck deck);

    void shuffle();

    void sort();

    void sort(Comparator<Card> c);

    String deckToString();

    Map<Integer, Deck> deal(int players, int numberOfCards) throws IllegalArgumentException;
}

package thisseasx.december2017.experiments.AdvancedInterfaceEnumTest;

import java.util.*;

@SuppressWarnings("unused")
public class StandardDeck implements Deck {

    private List<Card> cards;

    StandardDeck(List<Card> cards) {
        this.cards = cards;
    }

    @Override
    public List<Card> getCards() {
        return cards;
    }

    @Override
    public Card draw() {
        if (cards.size() <= 0) return null;
        Card c = cards.get(0);
        cards.remove(0);
        return c;
    }

    @Override
    public int size() {
        return cards.size();
    }

    @Override
    public void addCard(Card card) {
        cards.add(card);
    }

    @Override
    public void addCards(List<Card> cards) {
        this.cards.addAll(cards);
    }

    @Override
    public void addDeck(Deck deck) {
        cards.addAll(deck.getCards());
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public void sort() {
        Collections.sort(cards);
    }

    @Override
    public void sort(Comparator<Card> c) {
        cards.sort(c);
    }

    @Override
    public String toString() {
        return deckToString();
    }

    @Override
    public String deckToString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card).append("\n");
        }
        if (sb.length() <= 0) return "DECK IS EMPTY";
        return sb.toString();
    }

    @Override
    public Map<Integer, Deck> deal(int players, int numberOfCards) throws IllegalArgumentException {
        shuffle();
        Map<Integer, Deck> decks = new TreeMap<>();
        for (int i = 0; i < players; i++) {
            List<Card> playerCards = new ArrayList<>();
            Iterator<Card> iter = cards.iterator();
            int count = 0;
            while (iter.hasNext() && count < numberOfCards) {
                Card c = iter.next();
                playerCards.add(c);
                iter.remove();
                count++;
            }
            Deck d = new StandardDeck(playerCards);
            decks.put(i, d);
        }
        return decks;
    }
}

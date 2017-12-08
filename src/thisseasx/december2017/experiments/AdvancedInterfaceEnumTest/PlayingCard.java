package thisseasx.december2017.experiments.AdvancedInterfaceEnumTest;

class PlayingCard implements Card {

    private Rank rank;
    private Suit suit;

    PlayingCard(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public Rank getRank() {
        return rank;
    }

    @Override
    public Suit getSuit() {
        return suit;
    }

    @Override
    public int hashCode() {
        return 13 * (suit.value() - 1) + rank.value() - 1;
    }

    @Override
    public int compareTo(Card o) {
        return hashCode() - o.hashCode();
    }

    @Override
    public String toString() {
        return String.format("%s of %s", rank.text(), suit.text());
    }
}

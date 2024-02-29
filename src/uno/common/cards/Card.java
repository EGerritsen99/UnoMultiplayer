package uno.common.cards;

public class Card {
    // Fields
    private CardColor cardColor;
    private CardType cardType;

    // Constructor
    public Card(CardColor cardColor, CardType cardType) {

        setCardColor(cardColor);
        setNumber(cardType);

    }

    // Getters and setters
    public CardColor getCardColor() {
        return cardColor;
    }

    public void setCardColor(CardColor cardColor) {
        this.cardColor =  cardColor;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setNumber(CardType cardType) {
        this.cardType = cardType;
    }

}
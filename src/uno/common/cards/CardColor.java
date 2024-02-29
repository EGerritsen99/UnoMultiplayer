package uno.common.cards;

public enum CardColor {
    RED("Red"),
    GREEN("Green"),
    BLUE("Blue"),
    YELLOW("Yellow");

    final String cardColorsStringValue;

    CardColor(String coloursStringValue) {
        this.cardColorsStringValue = coloursStringValue;
    }

}

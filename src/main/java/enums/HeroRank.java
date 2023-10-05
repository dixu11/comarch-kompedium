package enums;

public enum HeroRank {
    //obiekty
    WARRIOR(5),
    CLERIC(3),
    ROGUE(2),
    MAGE(0);

    //stan
    private int attackBonus;

    //konstruktory

    private HeroRank(int attackBonus) { // konstruktor enumów jest prywatny
        this.attackBonus = attackBonus;
    }


    //zachowania
    public int getAttackBonus() {
        return attackBonus;
    }
}

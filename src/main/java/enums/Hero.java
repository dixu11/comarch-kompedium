package enums;

import java.util.Random;

public class Hero {
    private HeroRank rank;
    private int hp = 20;

    public Hero(HeroRank rank) {
        this.rank = rank;
    }

    public Hero() {
        Random random = new Random();
        HeroRank[] ranks = HeroRank.values();
        rank = ranks[random.nextInt(ranks.length)];
    }

    public void healYourself() {
        //jeśli jest magiem, uleczy się o 5 pkt, jeśli klerykiem o 10, jeśli żadne z tych to o 0
        switch (rank){
            case CLERIC:
                hp += 10;
                break;
            case MAGE:
                hp += 5;
        }
    }

    public int getDmg() {
        return rank.getAttackBonus();
    }


    @Override
    public String toString() {
        return "Hero{" +
                "rank=" + rank +
                ", hp=" + hp +
                ", dmg=" + getDmg() +
                '}';
    }
}

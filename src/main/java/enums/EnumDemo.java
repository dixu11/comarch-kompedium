package enums;

public class EnumDemo {
    public static void main(String[] args) {
        Hero hero = new Hero(HeroRank.WARRIOR);
        Hero hero2 = new Hero(HeroRank.MAGE);
        Hero hero3 = new Hero();

        System.out.println(hero);
        System.out.println(hero2);
        System.out.println(hero3);

        hero.healYourself();
        hero2.healYourself();
        hero3.healYourself();

        System.out.println(hero);
        System.out.println(hero2);
        System.out.println(hero3);



        //jak działa switch
       /* String input = "right";
        switch (input){
            case "prawo":
                System.out.println("Idziesz na wschód");
                break;
            case "lewo":
                System.out.println("Idziesz na zachód");
                break;
            default:
                System.out.println("Nie rozpoznano kierunku");
        }*/




    }
}

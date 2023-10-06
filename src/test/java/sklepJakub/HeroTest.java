package sklepJakub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {


    @Test
    public void createHeroTest() {
        String expectedName = "Jakub";
        //given + when
        Hero hero = new Hero(expectedName);
        //then
        assertEquals(25,hero.getCoins());
      assertEquals(expectedName,hero.getName());
    }

    @Test
    public void heroShouldAffordItem() {
        //given
        Hero hero = new Hero(null); // has 25 coins
        hero.setHeroType(HeroType.WOJOWNIK);
        Item item = new Item();

        item.setItemType(ItemType.WOJOWNIK);
        item.setPrice(15);
        int defense = hero.getDefense();
        int power = hero.getPower();

        //when
       boolean success = hero.buyItem(item);

        //then
        assertTrue(success);
        assertEquals(defense+ item.getDefense() , hero.getDefense());
        assertEquals(power+ item.getPower() , hero.getPower());
        //upewnij się że sukces
        //herosowi zostalo 10
        //pamiętać o dopasowaniu klasy
    }

    @Test
    public void heroShouldNotAffordItem() {
        Hero hero = new Hero(null); // has 25 coins
        hero.setHeroType(HeroType.WOJOWNIK);
        Item item = new Item();

        item.setItemType(ItemType.WOJOWNIK);
        item.setPrice(30);

        try {
            hero.buyItem(item);
            fail("Test nie zdany bo nie wystąpił błąd przy zakupie");
        } catch (ItemException e) {
            assertEquals("Heros ma za mało pieniędzy, wybierz inny przedmiot!",
                    e.getMessage());
        }
    }

    @Test
    public void heroShouldNotAffordItem2() {
        Hero hero = new Hero(null); // has 25 coins
        hero.setHeroType(HeroType.WOJOWNIK);
        Item item = new Item();

        item.setItemType(ItemType.WOJOWNIK);
        item.setPrice(30);

        assertThrows(ItemException.class, () -> hero.buyItem(item));
    }



}

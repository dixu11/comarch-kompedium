package sklepJakub;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class GameLogicTest {

    @Test
    public void sellingItemShouldAskAgainIfToExpensive() {
        //given
        Seller sellerMock = Mockito.mock(Seller.class);
        GameInterface gameInterfaceMock = Mockito.mock(GameInterface.class);
        //game interface podrzuci liczbę 1
        //dla liczby 1 seller podrzuci za drogi item
        //za drugim razem game interface podrzuci liczbę 2
        //dla liczby 2 seller podrzuci tani item
        Item tooExpensive = new Item();
        tooExpensive.setPrice(100);

        Item cheapItem = new Item();
        tooExpensive.setPrice(5);
        cheapItem.setItemType(ItemType.WOJOWNIK);

        Hero hero = new Hero("");
        hero.setHeroType(HeroType.WOJOWNIK);

        Mockito.when(gameInterfaceMock.chooseItemFromPool()).thenReturn(1);
        Mockito.when(sellerMock.chooseItemToSell(1)).thenReturn(cheapItem);

        //when
        GameLogic gameLogic = new GameLogic(sellerMock, gameInterfaceMock,hero);
        gameLogic.sellingItem();

        //then
        Mockito.verify(sellerMock).sellItem(cheapItem);
        Mockito.verify(gameInterfaceMock).chooseItemFromPool();

        //metody chose item i buy item zostaną wywołane dokładnie dwa razy
    }

}

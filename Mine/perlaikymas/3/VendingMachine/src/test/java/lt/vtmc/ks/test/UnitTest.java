package lt.vtmc.ks.test;

import lt.vtvpmc.vending.machine.Coin;
import lt.vtvpmc.vending.machine.ProductType;
import lt.vtmc.ks.NewVendingMachine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UnitTest {
    NewVendingMachine machine;

    @BeforeEach
    void init() {
        machine = new NewVendingMachine();
    }

    @Test
    @DisplayName("Checks if coins recognised and sum calculated correctly")
    void getCoinsTest() {


        machine.insertCoin(Coin.CENTS_10);
        Number val01 = machine.getCoins();
        assertEquals(0.1, val01.doubleValue(), 0.01d, "Should be 0.1");

        machine.insertCoin(Coin.CENTS_20);
        Number val02 = machine.getCoins();
        assertEquals(0.3, val02.doubleValue(), 0.01d, "Should be 0.3");

        machine.insertCoin(Coin.CENTS_50);
        Number val05 = machine.getCoins();
        assertEquals(0.8, val05.doubleValue(), 0.01d, "Should be 0.8");

        machine.insertCoin(Coin.EURO_1);
        Number val1 = machine.getCoins();
        assertEquals(1.8, val1.doubleValue(), 0.01d, "Should be 1.8");

        machine.insertCoin(Coin.EURO_2);
        Number val2 = machine.getCoins();
        assertEquals(3.8, val2.doubleValue(), 0.01d, "Should be 3.8");
    }

    @Test
    @DisplayName("Checks if products added correctly")
    void addProductTest() {
        assertThrows(IllegalArgumentException.class, ()->machine.addProduct(null, 1),"Should throw IllegalArgumentException if product type null");
        assertThrows(IllegalArgumentException.class, ()->machine.addProduct(ProductType.CHOCOLATE_DELIGHT, 0),"Should throw IllegalArgumentException if product quantity 0");

        machine.addProduct(ProductType.CHOCOLATE_DELIGHT, 1);
        assertEquals(1,machine.countProductTypesInMachine(),"Should be 1 type");
        assertEquals(1,machine.countProductUnitsInMachine(),"Should be 1 unit");

        machine.addProduct(ProductType.EPIC_CANDY, 2);
        assertEquals(2,machine.countProductTypesInMachine(),"Should be 2 types");
        assertEquals(3,machine.countProductUnitsInMachine(),"Should be 3 units");

    }

}

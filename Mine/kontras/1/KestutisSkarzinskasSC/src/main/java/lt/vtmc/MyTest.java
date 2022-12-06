package lt.vtmc;

import lt.techin.shoppingcart.ShoppingCart;
import lt.techin.shoppingcart.test.BaseShoppingCartTest;


public class MyTest extends BaseShoppingCartTest {
    @Override
    protected ShoppingCart getLockedShoppingCartWithDiscountAndTaxApplied(ShoppingCart shoppingCart, int discountRate,
                                                                          int taxRate) {
        return null;
    }

    @Override
    protected ShoppingCart getDiscountAppliedShoppingCart(ShoppingCart shoppingCart, int percent) {
        return null;
    }

    @Override
    protected ShoppingCart getTaxAppliedShoppingCart(ShoppingCart shoppingCart, int tax) {
        return new LockedShoppingCart(shoppingCart);
    }

    @Override
    protected ShoppingCart getLockedFromModificationShoppingCart(ShoppingCart shoppingCart) {
//
        return new LockedShoppingCart(shoppingCart);
    }
}

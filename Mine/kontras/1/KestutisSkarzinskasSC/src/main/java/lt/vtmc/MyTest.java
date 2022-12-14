package lt.vtmc;

import lt.techin.shoppingcart.ShoppingCart;
import lt.techin.shoppingcart.test.BaseShoppingCartTest;


public class MyTest extends BaseShoppingCartTest {
    @Override
    protected ShoppingCart getLockedShoppingCartWithDiscountAndTaxApplied(ShoppingCart shoppingCart, int discountRate, int taxRate) {
        return new LockedShoppingCardDiscount(new LockedShoppingCartTax( shoppingCart, taxRate),discountRate);
    }

    @Override
    protected ShoppingCart getDiscountAppliedShoppingCart(ShoppingCart shoppingCart, int percent) {

        return new LockedShoppingCardDiscount(shoppingCart, percent);
    }

    @Override
    protected ShoppingCart getTaxAppliedShoppingCart(ShoppingCart shoppingCart, int tax) {
        return new LockedShoppingCartTax(shoppingCart, tax);
    }

    @Override
    protected ShoppingCart getLockedFromModificationShoppingCart(ShoppingCart shoppingCart) {
//
        return new LockedShoppingCart(shoppingCart);
    }
}

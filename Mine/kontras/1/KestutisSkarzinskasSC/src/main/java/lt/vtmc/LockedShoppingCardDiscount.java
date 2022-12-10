package lt.vtmc;

import lt.techin.shoppingcart.ShoppingCart;

public class LockedShopingCardDiscount extends LockedShoppingCart {
    private ShoppingCart shoppingCart;
    private int disCount;

    public LockedShopingCardDiscount(ShoppingCart shoppingCart, int discount) {
        super(shoppingCart);
    }

    @Override
    public double calculateTotalPrice() {
        return shoppingCart.calculateTotalPrice() * (1-disCount / 100.0);
    }
}

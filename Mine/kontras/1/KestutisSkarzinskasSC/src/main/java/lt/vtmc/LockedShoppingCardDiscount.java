package lt.vtmc;

import lt.techin.shoppingcart.ShoppingCart;

public class LockedShoppingCardDiscount extends LockedShoppingCart {
    private ShoppingCart shoppingCart;
    private int discount;

    public LockedShoppingCardDiscount(ShoppingCart shoppingCart, int discount) {
        super(shoppingCart);
        this.discount = discount;
    }

    @Override
    public double calculateTotalPrice() {

        return super.calculateTotalPrice() * (discount / 100.0);
    }
}

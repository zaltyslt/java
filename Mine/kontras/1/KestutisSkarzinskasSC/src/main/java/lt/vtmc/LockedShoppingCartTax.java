package lt.vtmc;

import lt.techin.shoppingcart.ShoppingCart;

public class LockedShoppingCartTax extends LockedShoppingCart{
    private int tax;
    ShoppingCart shoppingCart;
    public LockedShoppingCartTax(ShoppingCart shoppingCart, int tax) {
        super(shoppingCart);
        this.tax = tax;
    }

    @Override
    public double calculateTotalPrice() {
        return super.calculateTotalPrice() * (tax / 100.0 + 1);
    }
}

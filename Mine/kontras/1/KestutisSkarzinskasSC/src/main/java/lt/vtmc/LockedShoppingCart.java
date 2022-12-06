package lt.vtmc;

import lt.techin.shoppingcart.ShoppingCart;
import lt.techin.shoppingcart.ShoppingCartModificationException;
import lt.techin.shoppingcart.ShoppingItem;
import java.util.Collection;


public class LockedShoppingCart implements ShoppingCart {
    private ShoppingCart shopingCart;

    public LockedShoppingCart(ShoppingCart shopingCart, ) {
        this.shopingCart = shopingCart;
    }

    @Override
    public void addShoppingItem(ShoppingItem shoppingItem) {
        throw new ShoppingCartModificationException();

    }

    @Override
    public void removeShoppingItem(ShoppingItem shoppingItem) {
        throw new ShoppingCartModificationException();

    }

    @Override
    public void clearShoppingCart() {
        throw new ShoppingCartModificationException();
    }

    @Override
    public Collection<ShoppingItem> getShoppingCartItems() {
        return shopingCart.getShoppingCartItems();
    }

    @Override
    public double calculateTotalPrice() {
        return shopingCart.calculateTotalPrice();
    }
}

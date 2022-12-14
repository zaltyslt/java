package lt.vtmc;

import lt.techin.shoppingcart.ShoppingCart;
import lt.techin.shoppingcart.ShoppingCartModificationException;
import lt.techin.shoppingcart.ShoppingItem;
import java.util.Collection;


public class LockedShoppingCart implements ShoppingCart {
    private ShoppingCart shoppingCart;

    public LockedShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
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
        return shoppingCart.getShoppingCartItems();
    }

    @Override
    public double calculateTotalPrice(){
        return shoppingCart.calculateTotalPrice();
    }

}

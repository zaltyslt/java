package lt.vtmc;

import lt.techin.shoppingcart.ShoppingCart;
import lt.techin.shoppingcart.ShoppingItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class MyShopingCart implements ShoppingCart {
   private List<ShoppingItem> shoppingCart;


    public MyShopingCart() {
        shoppingCart = new ArrayList<>();
    }

    @Override
    public void addShoppingItem(ShoppingItem shoppingItem) {
        shoppingCart.add(shoppingItem);
    }

    @Override
    public void removeShoppingItem(ShoppingItem shoppingItem) {
        shoppingCart.remove(shoppingItem);
    }

    @Override
    public void clearShoppingCart() {
        shoppingCart.clear();
    }

    @Override
    public Collection<ShoppingItem> getShoppingCartItems() {
        return shoppingCart;
    }

    @Override
    public double calculateTotalPrice() {

        return shoppingCart.stream().mapToDouble(ShoppingItem::getPrice).sum();
    }
}

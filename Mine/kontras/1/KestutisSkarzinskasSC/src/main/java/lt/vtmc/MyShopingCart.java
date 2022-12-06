package lt.vtmc;

import lt.techin.shoppingcart.ShoppingCart;
import lt.techin.shoppingcart.ShoppingItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class MyShopingCart implements ShoppingCart {
   List<ShoppingItem> shopingCart ;

    public MyShopingCart() {
        shopingCart = new ArrayList<>();
    }

    @Override
    public void addShoppingItem(ShoppingItem shoppingItem) {
        shopingCart.add(shoppingItem);
    }

    @Override
    public void removeShoppingItem(ShoppingItem shoppingItem) {
        shopingCart.remove(shoppingItem);
    }

    @Override
    public void clearShoppingCart() {
        shopingCart.clear();
    }

    @Override
    public Collection<ShoppingItem> getShoppingCartItems() {
        return shopingCart;
    }

    @Override
    public double calculateTotalPrice() {
        return shopingCart.stream().mapToDouble(ShoppingItem::getPrice).sum();
    }
}

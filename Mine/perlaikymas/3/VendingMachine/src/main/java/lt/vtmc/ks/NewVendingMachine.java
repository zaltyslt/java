/**
 *  pagrindinės programos paketas
 */
package lt.vtmc.ks;

import lt.vtvpmc.vending.machine.Coin;
import lt.vtvpmc.vending.machine.ProductPurchaseResult;
import lt.vtvpmc.vending.machine.ProductType;
import lt.vtvpmc.vending.machine.VendingMachine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.HashMap;

/**
 * pagrindinė programos klasė
 */

public class NewVendingMachine implements VendingMachine {
    HashMap<ProductType, Integer> products = new HashMap<>();
    double coins = 0;
    public static final Logger logger = LoggerFactory.getLogger(NewVendingMachine.class);

    /**
     * prideda produktų į aparatą
     * @param productType ProductType
     * @param quantity kiekis (int)
     */
    @Override
    public void addProduct(ProductType productType, int quantity) {

        if (productType == null || quantity <= 0) {
            throw new IllegalArgumentException();
        }

        if (products.containsKey(productType)) {
            products.put(productType, products.get(productType) + quantity);
        } else {
            products.put(productType, quantity);
        }

    }

    /**
     * Vykdo produkto pirkimo procedūrą.
     * Produkto tipas
     * @param productType Produkto tipas
     * @return ProductPurchaseResult( Boolean success, double change, ProductType ProductType productType)
     *
     */
    @Override
    public ProductPurchaseResult buyProduct(ProductType productType) {

        logger.info("{} {}", productType.name(), productType.getPrice());
        ProductPurchaseResult result;
        if (products.containsKey(productType)
                && products.get(productType) > 0
                && productType.getPrice() <= coins) {
            products.put(productType, products.get(productType) - 1);
            result = new ProductPurchaseResult(true, coins - productType.getPrice() < 0.1 ? 0: coins - productType.getPrice()  , productType);
            coins = 0;
            logger.info("Coins in machine after {}", coins);
            return result;
        } else {
            result = new ProductPurchaseResult(false, coins, productType);
            coins = 0;
        }
        return result;
    }

    /**
     * Konvertuoja aparato gautas monetas į skaitmeninę reikšmę
     * @param coin enum reikšmė
     */
    @Override
    public void insertCoin(Coin coin) {
        logger.info("Inserting {}", coin.name());
        switch (coin) {
            case EURO_1 -> {
                coins += 1;
                break;
            }
            case EURO_2 -> {
                coins += 2;
                break;
            }
            case CENTS_10 -> {
                coins += 0.1;
                break;
            }
            case CENTS_20 -> {
                coins += 0.2;
                break;
            }
            case CENTS_50 -> coins += 0.5;
        }
//        coins = covert(coins);
        logger.info("Coins in machine {}", coins);
    }

    /**
     * Hellperis testavimui
     * @return monetų, esančių aparate suma
     */
    public double getCoins(){
        return coins;
    }

    /**
     * Hellperis testavimui
     * @return produktų tipų aparate kiekis
     */
    public int countProductTypesInMachine(){
        return products.size();
    }

    public int countProductUnitsInMachine(){

        return products.values().stream().reduce(0,Integer::sum);
    }

}

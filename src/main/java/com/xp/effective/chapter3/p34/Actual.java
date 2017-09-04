package com.xp.effective.chapter3.p34;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author xp
 */
@Component
public class Actual {

    @Autowired
    private ShoppingCart shoppingCart;

    public void out() {
        System.out.println(this+" "+shoppingCart);
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}

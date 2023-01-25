package services;

import data.Cart;
import data.Order;
import estorePojo.exceptions.InsufficientBalanceException;
import estorePojo.exceptions.InvalidCartException;
import estorePojo.exceptions.UnknownAccountException;
import estorePojo.exceptions.UnknownItemException;

public interface IStorePay {

    public Order pay(Cart cart, String address, String bankAccountRef )
            throws
            InvalidCartException, UnknownItemException,
            InsufficientBalanceException, UnknownAccountException;

    public Cart addItemToCart(
            Cart cart,
            Client client,
            Object item,
            int qty )
            throws UnknownItemException, InvalidCartException;
}

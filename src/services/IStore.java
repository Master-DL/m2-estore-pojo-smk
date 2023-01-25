package services;

import data.Cart;
import estorePojo.exceptions.InvalidCartException;
import estorePojo.exceptions.UnknownItemException;

public interface IStore {

    public double getPrice( Object item ) throws UnknownItemException;

    public boolean isAvailable( Object item, int qty )
            throws UnknownItemException;
}

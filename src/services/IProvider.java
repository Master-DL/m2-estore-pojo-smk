package services;

import estorePojo.exceptions.UnknownItemException;

public interface IProvider {

    public int order(Store store, Object item, int qty) throws UnknownItemException;

    public double getPrice(Object item) throws UnknownItemException;
}

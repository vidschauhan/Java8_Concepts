package com.OReilly.functions;

import com.OReilly.utils.Trades;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author vidit.singh
 * @created 05/05/2022 - 14:11
 */
public class SupplierFunctions {

    /**
     * Supplier takes no argument but returns the someType;
     * Useful in returning something from a method.
     * @param trade
     */
    private void getTrades(Trades trade) {
        Supplier<List<Trades>> getAllTrades = () ->  trade.getTradeList();
        getAllTrades.get().stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        Trades trade = new Trades("Trades-@",1000,"CLOSED");
        SupplierFunctions supplierFunctions = new SupplierFunctions();
        supplierFunctions.getTrades(trade);
    }

}

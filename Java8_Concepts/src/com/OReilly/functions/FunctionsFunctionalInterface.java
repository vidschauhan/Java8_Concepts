package com.OReilly.functions;

import com.OReilly.utils.Trades;

import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author vidit.singh
 * @created 05/05/2022 - 14:33
 */
public class FunctionsFunctionalInterface {
    /**
     *
     */
    Function<String, Movie> movieObj = (name) -> createMovieObject(name);

    private Movie createMovieObject(String name) {
        return new Movie(name, 5);
    }

    private Trades createIfTradeNotExists(String tradeName) {
        Supplier<List<Trades>> tradeLists = () -> new Trades().getTradeList(); // Just create a list or put a list in supplier and get them.
        for (Trades trades : tradeLists.get()) {
            return trades.getName().equals(tradeName) ? trades : new Trades(tradeName, new Random().nextInt(), "OPEN");
        }
        return null;
    }

    public static void main(String[] args) {
        FunctionsFunctionalInterface functionsFunctionalInterface = new FunctionsFunctionalInterface();
        Movie movie = functionsFunctionalInterface.movieObj.apply("Tadap");
        System.out.println(movie);

        Function<String, Trades> tradeObject = functionsFunctionalInterface::createIfTradeNotExists;
        Trades trade = tradeObject.apply("Trade@1");
        System.out.println(trade);

    }
}


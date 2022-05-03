package com.OReilly.lambdas;

import com.OReilly.utils.Trades;

/**
 * @author vidit.singh
 * @created 03/05/2022 - 13:30
 */
public class CapturingLambdas {

    @FunctionalInterface
    interface ITtrades<Trades> {
        boolean check(Trades t);
    }

    public boolean checkTradeStatus(){
        ITtrades<Trades> ItTrades = (trades) -> trades.getStatus().equals("OPEN");
        return ItTrades.check(new Trades("IBM",100000,"Closed"));

    }

    public static void main(String[] args) {
        System.out.println(new CapturingLambdas().checkTradeStatus());
    }
}

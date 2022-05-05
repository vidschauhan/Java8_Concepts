package com.OReilly.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

/**
 * @author vidit.singh
 * @created 03/05/2022 - 13:30
 */
public class Trades {
    String name;
    long amount;
    String status;

    public Trades(){};

    public Trades(String name, long amount, String status) {
        this.name = name;
        this.amount = amount;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Trades> getTradeList() {
        ArrayList<Trades> trades = new ArrayList<>();
        int i = 0;
        while (i <= 10) {
            trades.add(new Trades("Trade-" + i, new Random().nextInt(), i % 2 == 0 ? "CLOSED" : "OPEN"));
            i++;
        }
        return trades;
    }

    @Override
    public String toString() {
        return "Trades{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
}

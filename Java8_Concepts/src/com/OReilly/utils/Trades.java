package com.OReilly.utils;

/**
 * @author vidit.singh
 * @created 03/05/2022 - 13:30
 */
public class Trades {
    String name;
    long amount;
    String status;

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
}

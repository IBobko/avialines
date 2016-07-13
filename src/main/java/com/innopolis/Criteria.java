package com.innopolis;

import java.util.Date;

/**
 * @author Igor Bobko <limit-speed@yandex.ru>.
 */

public class Criteria {
    private String from;
    private String to;
    private Date when;
    private Integer countOfPassengers;
    private Integer economy;
    private Integer returnTicket;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Date getWhen() {
        return when;
    }

    public void setWhen(Date when) {
        this.when = when;
    }

    public Integer getCountOfPassengers() {
        return countOfPassengers;
    }

    public void setCountOfPassengers(Integer countOfPassengers) {
        this.countOfPassengers = countOfPassengers;
    }

    public Integer getEconomy() {
        return economy;
    }

    public void setEconomy(Integer economy) {
        this.economy = economy;
    }

    public Integer getReturnTicket() {
        return returnTicket;
    }

    public void setReturnTicket(Integer returnTicket) {
        this.returnTicket = returnTicket;
    }

    @Override
    public String toString() {
        return "Criteria{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", when=" + when +
                ", countOfPassengers=" + countOfPassengers +
                ", economy=" + economy +
                ", returnTicket=" + returnTicket +
                '}';
    }
}

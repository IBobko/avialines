package com.innopolis;

import java.util.Date;

/**
 * This class is designed for the aggregation of search options such as tickets, direction, date, type of class and the number of passengers.
 * It is simple POJO Object.
 *
 * @author Igor Bobko "limit-speed@yandex.ru".
 */

public class Criteria {
    private String from;
    private String to;
    private Date when;
    private Integer countOfPassengers;
    private AviaClass aviaClass;
    private Integer returnTicket;

    /**
     * Returns the class type which the user plans to fly
     *
     * @return
     */
    public AviaClass getAviaClass() {
        return aviaClass;
    }

    public void setAviaClass(AviaClass aviaClass) {
        this.aviaClass = aviaClass;
    }

    /**
     * Returns the Location from which the user plans to fly
     *
     * @return
     */
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Returns the Location to which the user plans to fly
     *
     * @return
     */
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Returns the Date when the user plans to fly
     *
     * @return
     */
    public Date getWhen() {
        return when;
    }

    public void setWhen(Date when) {
        this.when = when;
    }

    /**
     * Returns amount of passengers the user plans to fly
     *
     * @return
     */
    public Integer getCountOfPassengers() {
        return countOfPassengers;
    }

    public void setCountOfPassengers(Integer countOfPassengers) {
        this.countOfPassengers = countOfPassengers;
    }

    /**
     * Returns if the user plans to come
     *
     * @return
     */
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
                ", aviaClass=" + aviaClass +
                ", returnTicket=" + returnTicket +
                '}';
    }
}

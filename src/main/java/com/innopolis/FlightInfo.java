package com.innopolis;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * This class exists for one line of all flights. It exists for simple searching flights. In choosing step we must return list of this class.
 *
 * @author Igor Bobko "limit-speed@yandex.ru".
 */
public class FlightInfo {
    private String flight;
    private String department;
    private Calendar depTime;
    private Calendar arrTime;
    private BigDecimal cost;
    private Integer numberOfFreePlaces;

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Calendar getDepTime() {
        return depTime;
    }

    public void setDepTime(Calendar depTime) {
        this.depTime = depTime;
    }

    public Calendar getArrTime() {
        return arrTime;
    }

    public void setArrTime(Calendar arrTime) {
        this.arrTime = arrTime;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Integer getNumberOfFreePlaces() {
        return numberOfFreePlaces;
    }

    public void setNumberOfFreePlaces(Integer numberOfFreePlaces) {
        this.numberOfFreePlaces = numberOfFreePlaces;
    }
}

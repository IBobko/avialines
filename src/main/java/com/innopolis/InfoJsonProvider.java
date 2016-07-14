package com.innopolis;

import java.util.List;

/**
 * This class exists for working with json files that stores all our flight. Every file describes flight of particular company.
 *
 * @author Igor Bobko "limit-speed@yandex.ru".
 */
public class InfoJsonProvider {
    /**
     * Decrease count of places of Flight
     * @param companyName Company name.
     * @param flightNumber Flight Number.
     */
    public void decreaseCount(final String companyName,final Integer flightNumber,final Integer amountOfTickets){
        //
    }

    /**
     * Returns information about all companies we have.
     * @return
     */
    List<String> getCompaniesName() {
        return null;
    }

    /**
     * Returns list of all flight for this company.
     *
     * @param companyName Company name
     * @return
     */
    List<FlightInfo> getFlights(String companyName) {
        return null;
    }
}

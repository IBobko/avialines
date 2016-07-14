package com.innopolis;

import java.util.List;

/**
 * @author Igor Bobko "limit-speed@yandex.ru".
 */
public interface SearchEngine {
    /**
     * This class make search by criteria user chosen.
     *
     * @param criteria Criteria that user chosen.
     * @return List of found flight for this criteria.
     */
    List<FlightInfo> search(Criteria criteria);
}

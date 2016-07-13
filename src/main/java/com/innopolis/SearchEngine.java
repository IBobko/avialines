package com.innopolis;

import java.util.List;

/**
 * @author Igor Bobko <limit-speed@yandex.ru>.
 */
public interface SearchEngine {
    List<FlightInfo> search(Criteria criteria);
}

package com.innopolis;


import java.util.List;
import java.util.Scanner;

/**
 * In this class are described all bussines logic and all steps of the application.
 *
 * We stores data about flights in json Files.
 * JSON has next format
 *
 * {
 * "Flight": "99A33",
 * "Dep": "LGW",
 * "ArrDep.": "DMD",
 * "TimeArr": "12.07.2016 14:15",
 * "Time": "12.07.2016 12:15",
 * "Cost": "123.443",
 * "NumberOfFreePlaces": "20"
 * }

 */
class Application
{
    public static void main(String[] arr) {

        System.out.println("Welcome to the AVIALINES");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Where are you now: ");

        Criteria criteria = new Criteria();
        criteria.setFrom(scanner.next());

        //TODO: реализовать подтверждение

        System.out.println(criteria);

        // Ввел все данные
        SearchEngine searchEngine = new SearchEngineImpl();
        List<FlightInfo> results = searchEngine.search(criteria);

        System.out.println("Выберите рейсы:");

        Integer flight = scanner.nextInt();

        //TODO: совершается покупка билета

        //TODO: уменьшЕЩВЩить количество билетов

        //TODO:

        //TODO вывести еще один билет
    }
}

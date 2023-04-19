package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

//import ru.netology.services.vacantionservice;
public class vacantionservicetest {
    @Test
    void firstCalculateVacation() {
        vacantionservice service = new vacantionservice();
        // подготавливаем данные:
        int income = 10_000;
        int expences = 3_000;
        int threshold = 20_000;
        int expected = 3;
        // вызываем целевой метод:
        int actual = service.calculate(income, expences, threshold);
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void secondCalculateVacation() {
        vacantionservice service = new vacantionservice();
        // подготавливаем данные:
        int income = 100_000;
        int expences = 60_000;
        int threshold = 150_000;
        int expected = 2;
        // вызываем целевой метод:
        int actual = service.calculate(income, expences, threshold);
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }
}

package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FreelancerServiceTest {
    @Test
    public void testCalculate() {

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        FreelancerService service = new FreelancerService();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testCalculate2() {

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        FreelancerService service = new FreelancerService();
        int actual = service.calculate(income, expenses, threshold);

        Assertions .assertEquals(expected, actual);
    }
}
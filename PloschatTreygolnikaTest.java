package org.example.Lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PloschatTreygolnikaTest {

    private static Logger logger = LoggerFactory.getLogger(PloschatTreygolnikaTest.class);

    @Test
    @DisplayName("Проверка метода PloschatTreygolnika по поиску площади треугольника с известными целыми числами")
    void  PloschatTreygolnikaTest1(){

        String result = null;
        try {
            result = PloschatTreygolnika.Ploschat(13,14,15);
        } catch (NegativeNumber e) {
            throw new RuntimeException(e);
        }
        Assertions.assertEquals("84.00",result);
    }

    @Test
    @DisplayName("Проверка метода PloschatTreygolnika по поиску площади треугольника с отрицательным числом")
    void  PloschatTreygolnikaTest2(){

        String result = null;
        try {
            result = PloschatTreygolnika.Ploschat(13, 14, -1);
        } catch (NegativeNumber e) {
            logger.error("Невозможно получить корень из отрицательного числа");
        }
        Assertions.assertEquals(12,result);
    }
}

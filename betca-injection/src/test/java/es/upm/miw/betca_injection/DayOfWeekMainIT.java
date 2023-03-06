package es.upm.miw.betca_injection;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DayOfWeekMainIT {

    @Autowired
    private DayOfWeekMain dayOfWeekMain;

    @Test
    void testCreateMessage() {
        boolean expected = LocalDate.now().getDayOfWeek().equals(DayOfWeek.SATURDAY) ||
                           LocalDate.now().getDayOfWeek().equals(DayOfWeek.SUNDAY);
        assertEquals(expected, this.dayOfWeekMain.isWeekEnd());
    }

}

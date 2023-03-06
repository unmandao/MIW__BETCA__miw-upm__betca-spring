package es.upm.miw.betca_injection;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DayOfWeekServiceTest {

    @Autowired
    private DayOfWeekService dayOfWeekService;

    @Test
    void testDayOfWeek() {
        assertEquals(LocalDate.now().getDayOfWeek().toString(), dayOfWeekService.dayOfWeek());
    }

}

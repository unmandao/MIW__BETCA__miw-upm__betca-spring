package es.upm.miw.betca_injection;

import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.time.DayOfWeek;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DayOfWeekMainServiceMockTest {

    @MockBean
    private DayOfWeekService dayOfWeekService;

    @Autowired
    private DayOfWeekMain dayOfWeekMain;

    @Test
    void testSaturday() {
        BDDMockito.given(this.dayOfWeekService.dayOfWeek()).willReturn(DayOfWeek.SATURDAY.toString());

        assertTrue(this.dayOfWeekMain.isWeekEnd());
    }

    @Test
    void testSunday() {
        BDDMockito.given(this.dayOfWeekService.dayOfWeek()).willReturn(DayOfWeek.SUNDAY.toString());

        assertTrue(this.dayOfWeekMain.isWeekEnd());
    }

    @Test
    void testMonday() {
        BDDMockito.given(this.dayOfWeekService.dayOfWeek()).willReturn(DayOfWeek.MONDAY.toString());

        assertFalse(this.dayOfWeekMain.isWeekEnd());
    }

}

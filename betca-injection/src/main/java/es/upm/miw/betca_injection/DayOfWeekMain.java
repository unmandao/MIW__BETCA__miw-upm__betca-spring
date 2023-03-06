package es.upm.miw.betca_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;

@Component
public class DayOfWeekMain {

    private DayOfWeekService dayOfWeekService;

    @Autowired
    public DayOfWeekMain(DayOfWeekService dayOfWeekService) {
        this.dayOfWeekService = dayOfWeekService;
    }

    public boolean isWeekEnd(){
        String today = dayOfWeekService.dayOfWeek();
        return DayOfWeek.SATURDAY.toString().equals(today) || DayOfWeek.SUNDAY.toString().equals(today);
    }
}

package es.upm.miw.betca_injection;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DayOfWeekService {

    public String dayOfWeek(){
        return LocalDate.now().getDayOfWeek().toString();
    }
}

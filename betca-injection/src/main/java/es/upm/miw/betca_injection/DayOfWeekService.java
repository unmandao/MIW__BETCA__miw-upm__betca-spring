package es.upm.miw.betca_injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DayOfWeekService {

    private final String author;

    public DayOfWeekService(@Value("${miw.author}") String author) {
        this.author = author;
    }

    public String dayOfWeek(){
        return LocalDate.now().getDayOfWeek().toString();
    }

    public String getAuthor(){
        return this.author;
    }
}

package app.model;

import org.springframework.stereotype.Component;

@Component
public class Timer {
    public Timer() {
    }

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}

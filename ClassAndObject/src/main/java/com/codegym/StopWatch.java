package com.codegym;

import java.util.Date;

public class StopWatch {
    Date startTime;
    Date endTime;

    void setStartTime() {
        this.startTime = new Date();
    }

    void setEndTime() {
        this.endTime = new Date();
    }

    long getElapsedTime() {
        long elapsedTime = this.endTime.getTime() - this.startTime.getTime();
        return elapsedTime;
    }
}

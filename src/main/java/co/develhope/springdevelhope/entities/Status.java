package co.develhope.springdevelhope.entities;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Status {

    ONTIME,
    DELAYED,
    CANCELLED;

    public static Status randomStatus(){
        return Status.values()[new Random().nextInt(Status.values().length)];
    }
}

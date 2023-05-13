package com.driver;

import java.time.LocalTime;

public class Combo
{
    LocalTime endAt;
    int index;

    public Combo(LocalTime endAt, int index) {
        this.endAt = endAt;
        this.index = index;
    }
}

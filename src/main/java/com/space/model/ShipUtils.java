package com.space.model;

import java.util.Calendar;

public class ShipUtils {
    public static Double rate(Ship ship) {
        double k = ship.getUsed() ? 0.5d : 1.0d;
        double speed = ship.getSpeed();

        Calendar cal = Calendar.getInstance();
        cal.setTime(ship.getProdDate());
        double y1 = cal.get(Calendar.YEAR);

        double result = (80 * k * speed) / (3019 - y1 + 1);
        return (double) Math.round(result * 100) / 100;
    }
}
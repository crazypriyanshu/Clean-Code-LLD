package com.pdas.LLD.TrafficManagement.observers;

import com.pdas.LLD.TrafficManagement.core.DIRECTIONS;
import com.pdas.LLD.TrafficManagement.core.LightColor;

public class CentralObserver implements TrafficLightObserver{
    @Override
    public void update(Long intersectionId, DIRECTIONS direction, LightColor color) {
        System.out.printf("[CENTRAL-MONITOR] Intersection %d: Light for %s direction changed to %s. \n", intersectionId, direction, color);
    }
}

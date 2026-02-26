package com.pdas.LLD.TrafficManagement.observers;


import com.pdas.LLD.TrafficManagement.core.DIRECTIONS;
import com.pdas.LLD.TrafficManagement.core.LightColor;

public interface TrafficLightObserver {
    public void update(Long intersectionId, DIRECTIONS direction, LightColor color);
}

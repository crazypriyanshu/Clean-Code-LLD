package com.pdas.LLD.TrafficLightController.observers;


import com.pdas.LLD.TrafficLightController.Direction;
import com.pdas.LLD.TrafficLightController.LightColor;

public interface TrafficObserver {
    void update(int intersectionId, Direction direction, LightColor lightColor);
}

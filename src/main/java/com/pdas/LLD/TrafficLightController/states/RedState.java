package com.pdas.LLD.TrafficLightController.states;


import com.pdas.LLD.TrafficLightController.LightColor;
import com.pdas.LLD.TrafficLightController.SignalState;
import com.pdas.LLD.TrafficLightController.TrafficLight;

public class RedState implements SignalState {
    @Override
    public void handle(TrafficLight context) {
        context.setCurrentColor(LightColor.RED);
        // Red is a stable state, it transitions to green only when IntersectionController asks it,
        // so next state is self
        context.setNextState(new RedState());

    }
}

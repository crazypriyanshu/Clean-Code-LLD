package com.pdas.LLD.TrafficLightController.states;


import com.pdas.LLD.TrafficLightController.LightColor;
import com.pdas.LLD.TrafficLightController.SignalState;
import com.pdas.LLD.TrafficLightController.TrafficLight;

public class YellowState implements SignalState {
    @Override
    public void handle(TrafficLight context) {
        context.setCurrentColor(LightColor.YELLOW);
        context.setNextState(new RedState());

    }
}

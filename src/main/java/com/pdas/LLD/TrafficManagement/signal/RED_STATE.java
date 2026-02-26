package com.pdas.LLD.TrafficManagement.signal;


import com.pdas.LLD.TrafficManagement.core.LightColor;
import com.pdas.LLD.TrafficManagement.core.TrafficLight;

public class RED_STATE implements SignalState{


    @Override
    public void handle(TrafficLight trafficLight) {
        // in red state what we need to do, with intersectionId, we can maintain states of a particular intersectionId
        System.out.println("Start to handle Red state of intersectionId: "+trafficLight.getIntersectionId());
        trafficLight.setLightColor(LightColor.RED);
        trafficLight.setCurrentState(this::handle);
        trafficLight.setNextState(new YELLOW_STATE());

    }
}

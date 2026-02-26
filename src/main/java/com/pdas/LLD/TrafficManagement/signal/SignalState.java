package com.pdas.LLD.TrafficManagement.signal;


import com.pdas.LLD.TrafficManagement.core.TrafficLight;

public interface SignalState {
    public void handle(TrafficLight context);
}

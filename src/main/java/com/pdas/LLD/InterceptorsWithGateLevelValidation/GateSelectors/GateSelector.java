package com.pdas.LLD.InterceptorsWithGateLevelValidation.GateSelectors;


import com.pdas.LLD.InterceptorsWithGateLevelValidation.Gate;
import com.pdas.LLD.InterceptorsWithGateLevelValidation.RequestContext;

import java.util.List;

@FunctionalInterface
public interface GateSelector {
    List<Gate> selectGates(RequestContext context, List<Gate> availableGates);
}

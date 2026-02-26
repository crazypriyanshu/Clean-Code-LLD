package com.pdas.LLD.InterceptorsWithGateLevelValidation.GateSelectors;


import com.pdas.LLD.InterceptorsWithGateLevelValidation.RequestContext;

import java.util.List;

@FunctionalInterface
public interface GateSelectionRule {
    List<String> getGatesForContext(RequestContext context);
}

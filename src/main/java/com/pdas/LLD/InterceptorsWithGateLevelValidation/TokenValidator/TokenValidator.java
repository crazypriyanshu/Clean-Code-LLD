package com.pdas.LLD.InterceptorsWithGateLevelValidation.TokenValidator;

public interface TokenValidator {
    TokenValidationResult validate(String token);
}

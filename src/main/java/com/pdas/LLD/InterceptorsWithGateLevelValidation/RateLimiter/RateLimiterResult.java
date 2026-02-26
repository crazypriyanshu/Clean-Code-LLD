package com.pdas.LLD.InterceptorsWithGateLevelValidation.RateLimiter;

public record RateLimiterResult(boolean allowed, int remainingTokens, long retryAfterMillis) {

}

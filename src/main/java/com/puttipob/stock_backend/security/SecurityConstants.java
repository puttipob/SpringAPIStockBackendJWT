package com.puttipob.stock_backend.security;

public interface SecurityConstants {
	String SECRET_KEY = "RyuRewDevJWS";
	String TOKEN_PREFIX = "Bearer ";
	String HEADER_AUTHORIXSTION = "Authorization";
	String CLAIMS_ROLE = "role";
	long EXPIRATION_TIME = (1 * 60 * 1000);
}

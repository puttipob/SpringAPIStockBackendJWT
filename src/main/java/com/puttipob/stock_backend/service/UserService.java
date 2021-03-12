package com.puttipob.stock_backend.service;

import com.puttipob.stock_backend.controller.request.UserRequest;
import com.puttipob.stock_backend.model.User;

public interface UserService {
	User register(UserRequest userRequest);

	User findUserByUsername(String username);
}

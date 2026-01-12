package main.java.bank.service;

import main.java.User;

public class UserService {
    public Result<User> getUserById(String id) {
        try {
            // Simulate a database call
            User user = null;

            if (user != null) {
                return new Result.Success<>(user);
            } else {
                return new Result.Failure<>("User not found", 404);
            }
        } catch (Exception e) {
            return new Result.Failure<>("Connection Error", 500);
        }
    }
}
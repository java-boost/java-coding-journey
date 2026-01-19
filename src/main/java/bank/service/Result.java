package bank.service;

public sealed interface Result<T> permits Result.Success, Result.Failure, Result.Loading {

    // 1. Success case carries the data
    record Success<T>(T data) implements Result<T> {}

    // 2. Failure case carries error details
    record Failure<T>(String message, int errorCode) implements Result<T> {}

    // 3. Loading case (useful for UI/Frontend integration)
    record Loading<T>() implements Result<T> {}
}

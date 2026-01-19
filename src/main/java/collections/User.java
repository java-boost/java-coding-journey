package collections;

import java.util.Objects;

public class User {
    private final String id;
    private final String email;

    public User(String id, String email) {
        this.id = id;
        this.email = email;
    }

    // 1. equals() - Determines if two objects are logically the same
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Reference check
        if (o == null || getClass() != o.getClass()) return false; // Null and Type check
        User user = (User) o;
        return Objects.equals(id, user.id); // Identity is based on ID
    }

    // 2. hashCode() - Must be consistent with equals()
    @Override
    public int hashCode() {
        return Objects.hash(id); // If IDs are equal, hashes will be equal
    }

    @Override
    public String toString() {
        return "User{id='" + id + "'}";
    }
}
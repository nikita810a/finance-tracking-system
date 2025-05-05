package com.smartfinance;

//public class UserRepository {
    
//}
import com.smartfinance.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// This should be 'interface' instead of 'class'
public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query method to find a User by their email
    User findByEmail(String email);
}
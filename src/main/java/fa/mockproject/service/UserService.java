package fa.mockproject.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import fa.mockproject.entity.User;

@Service
public interface UserService {
    User addUser(User user);
    User findByUserId(long userId);
    boolean findUserByEmail(String email);
    User update(User user);
    Page<User> users(Pageable pageable);
}

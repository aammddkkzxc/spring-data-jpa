package study.data_jpa.repository;

import org.springframework.beans.factory.annotation.Value;

public interface UsernameOnly {
//    String getUsername();

    @Value("#{target.username + ' ' + target.age}")
    String getUsername();
}

package episen.archcloud.testapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TestRepo extends JpaRepository<User, Long> {

    @Query(value = "SELECT * from public.user where id=?1", nativeQuery = true)
    User getUserById(Long id);
}

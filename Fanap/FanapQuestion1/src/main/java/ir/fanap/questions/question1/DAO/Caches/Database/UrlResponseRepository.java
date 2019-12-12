package ir.fanap.questions.question1.DAO.Caches.Database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
public interface UrlResponseRepository extends JpaRepository<UrlResponse,Long> {
    @Query(value = "select * from url_response order by id desc limit 1",nativeQuery = true)
    Optional<UrlResponse> findLast();
}
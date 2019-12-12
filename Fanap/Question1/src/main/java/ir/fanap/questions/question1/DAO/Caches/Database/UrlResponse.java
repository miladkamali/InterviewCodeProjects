package ir.fanap.questions.question1.DAO.Caches.Database;

import javax.persistence.*;

@Entity
public class UrlResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    @Column(length = 3000000)
    public String jsonResponse;
    public long updateTime;
}

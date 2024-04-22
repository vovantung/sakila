package txu.sakila.dao;

import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import txu.sakila.entity.FilmEntity;

@Repository
public class FilmDao extends AbstractDao<FilmEntity> {
    public FilmEntity getFilmById(short id) {
        String stringQuery = "select f from FilmEntity as f where id=:id";
        Query query = getEntityManager().createQuery(stringQuery);
        query.setParameter("id", id);
        return getResultSingle(query);
    }
}

package txu.sakila.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import java.util.List;

public class AbstractDao<E> {
    @PersistenceContext
    private EntityManager entityManager;

    protected EntityManager getEntityManager() {
        return this.entityManager;
    }

    public void flush() {
        this.entityManager.flush();
    }

    protected void persit(E entity) {
        this.entityManager.persist(entity);
    }

    protected E merge(E entity) {
        return this.entityManager.merge(entity);
    }

    protected List<E> getResultList(Query query) {
        return query.getResultList();
    }

    protected E getResultSingle(Query query) {
        List<E> results = getResultList(query);
        if (results == null) {
            return null;
        } else {
            return results.get(0);
        }
    }

}

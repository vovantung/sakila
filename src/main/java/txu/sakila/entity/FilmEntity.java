package txu.sakila.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "film")
public class FilmEntity {
    @Id
    @Column(name = "film_id")
    public short id;

    public String title;
    public String description;

}

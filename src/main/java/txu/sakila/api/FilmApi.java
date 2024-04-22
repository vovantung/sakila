package txu.sakila.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import txu.sakila.dao.FilmDao;
import txu.sakila.entity.FilmEntity;

@RestController
@RequiredArgsConstructor
@RequestMapping("/film")
public class FilmApi {
    private final FilmDao filmDao;

    @GetMapping("")
    public FilmEntity getFilmEntity(){
        return filmDao.getFilmById((short) 2);
    }
}

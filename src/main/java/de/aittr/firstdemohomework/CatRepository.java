package de.aittr.firstdemohomework;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CatRepository {
    private  static List<Cat> list = new ArrayList<>(
            List.of(
                    new Cat(1L, "Bella", 8),
                    new Cat(2L, "Lilly", 4),
                    new Cat(3L, "Lucy", 5),
                    new Cat(4L, "Sophie", 7)
            ));
    public List<Cat> findAll(){
        return list;
    }

}

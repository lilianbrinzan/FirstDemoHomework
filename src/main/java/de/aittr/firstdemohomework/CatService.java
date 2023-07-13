package de.aittr.firstdemohomework;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatService {
    private CatRepository repository;

    public CatService(CatRepository repository) {
        this.repository = repository;
    }
    public List<Cat> findAll(){
        return repository.findAll();
    }
}

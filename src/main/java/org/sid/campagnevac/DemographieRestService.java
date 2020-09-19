package org.sid.campagnevac;

import org.sid.campagnevac.dao.DemographieRepository;
import org.sid.campagnevac.entities.Demographie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
@CrossOrigin(origins = "*", allowedHeaders = "*")

@RestController
public class DemographieRestService {
    @Autowired
    private DemographieRepository demographieRepository;
    @GetMapping(value = "/demogs")
    public List<Demographie> listedemogs(){
        return demographieRepository.findAll();
    }
    @GetMapping(value = "/demogs/{id}")
    public Demographie listedemogs(@PathVariable(name="id") Long id){
        return demographieRepository.findById(id).get();
    }
    @PutMapping(value="/demogs/{id}")
    public Demographie update(@PathVariable(name="id") Long id, @RequestBody Demographie d){
        d.setId(id);
        return demographieRepository.save(d);
    }
    @PostMapping(value="/demogs")
    public Demographie save(@RequestBody Demographie d){
        return demographieRepository.save(d);
    }
    @DeleteMapping(value="/demogs/{id}")
    public void delete(@PathVariable(name="id") Long id){
        demographieRepository.deleteById(id);
    }


}

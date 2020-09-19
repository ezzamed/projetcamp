package org.sid.campagnevac.web;

import lombok.Data;
import org.sid.campagnevac.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.sid.campagnevac.dao.EnqueteRepository;
import org.sid.campagnevac.entities.Enquete;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.sid.campagnevac.service.ICampagneInitService;

@RestController
public class CampagneRestContoller<T,ID> {

    @Autowired
    private ICrudService<T,ID> service;
    @PostMapping("/all")
    public ResponseEntity<List<T>> addAll(@RequestBody List<T> list) {
        service.saveAll(list);
        return new ResponseEntity<>(list, HttpStatus.ACCEPTED);
    }
    /*@PostMapping("/AjouterDonnesDemographie")
    public Enquete ajoutes;
    public Enquete AjouterDonnesDemographie(@RequestBody EnqueteForm enqueteform){
        enqueteform.getEnquetes().ForEach(idEnquete->{
            Enquete enquete=enqueteRepository.findAllById(idEnquete).get();
            enquete.setNb1259(enqueteform.getNb1259());
            enquete.setNb011(enqueteform.getNb011());
            enquete.setPopvisee(enqueteform.getPopvisee());
            enqueteRepository.save(enquete);
            ajoutes.add(enquete);

        });
        return  ajoutes;
    }
    @Data
    class EnqueteForm{
        private int nb011;
        private int nb1259;
        private int popvisee;
        private Long iddemo;

    }*/


}

package org.sid.campagnevac.web;

import lombok.Data;
import org.sid.campagnevac.dao.EnqueteRepository;
import org.sid.campagnevac.entities.Enquete;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CampagneRestContoller {
    private EnqueteRepository enqueteRepository;
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

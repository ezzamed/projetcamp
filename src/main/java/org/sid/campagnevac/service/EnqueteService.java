package org.sid.campagnevac.service;

import org.sid.campagnevac.dao.EnqueteRepository;
import org.sid.campagnevac.entities.Enquete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class EnqueteService implements ICrudService <Enquete,Long> {
    @Autowired
    private EnqueteRepository enqueteRepository;

    @Override
    public void saveAll(Iterable<Enquete> iterable) {
            enqueteRepository.saveAll(iterable);

        }

    }


package org.sid.campagnevac.service;

import org.sid.campagnevac.dao.EnqueteRepository;
import org.sid.campagnevac.entities.Enquete;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.sid.campagnevac.entities.*;

public class EnqueteMockServiceImpl  implements ICrudService <Enquete,Long> {
    private List<Enquete> enquetes;

    public EnqueteMockServiceImpl() {
        enquetes = new ArrayList<Enquete>();


    }
    @Override
    public void saveAll(Iterable<Enquete> iterable) {
        Iterator<Enquete> iterator = iterable.iterator();
        if(iterator.hasNext()) {
            enquetes.add(iterator.next());
        }
    }
    @Autowired
    private EnqueteRepository enqueteRepository;
}

package org.sid.campagnevac.service;

public interface ICrudService <T,ID>{
    void saveAll(Iterable<T> iterable);
}

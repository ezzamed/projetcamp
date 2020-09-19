package org.sid.campagnevac.dao;

import org.sid.campagnevac.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
public interface AppRoleRepository  extends JpaRepository<AppRole,Long> {
    public AppRole findByRoleName(String roleName);
}

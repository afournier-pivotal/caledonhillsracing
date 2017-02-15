package com.caledonhillsracing;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "cyclist", path = "cyclist")
public interface CyclistRepository extends PagingAndSortingRepository<Cyclist, Long>
{

	List<Cyclist> findByLastName(@Param("name") String name);
}

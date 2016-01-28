package com.u2ware.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.u2ware.domain.GraphElectric;


@RepositoryRestResource(collectionResourceRel = "graphElectric", path = "graphElectric")
public interface GraphElectricResource extends PagingAndSortingRepository<GraphElectric, Long>{
	
	Iterable<GraphElectric> findByTagIDsContains(@Param("tagIDs") String tagIDs);

}

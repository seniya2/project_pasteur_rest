package com.u2ware.service;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.u2ware.domain.GraphHvac;


@RepositoryRestResource(collectionResourceRel = "graphHvac", path = "graphHvac")
public interface GraphHvacResource extends PagingAndSortingRepository<GraphHvac, Long>{
	
	Sort sort = new Sort(Direction.DESC, "no");
	Pageable pageable = new PageRequest(0, 20, sort);
	
	Iterable<GraphHvac> findByTagIDsContains(@Param("tagIDs") String tagIDs);
	Iterable<GraphHvac> findAll(Sort sort);
	
}

package com.u2ware.service;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.u2ware.domain.GraphUps;


@RepositoryRestResource(collectionResourceRel = "graphUps", path = "graphUps")
public interface GraphUpsResource extends PagingAndSortingRepository<GraphUps, Long>{
	
	Sort sort = new Sort(Direction.DESC, "no");
	Pageable pageable = new PageRequest(0, 20, sort);
	
	Iterable<GraphUps> findByTagIDsContains(@Param("tagIDs") String tagIDs);
	Iterable<GraphUps> findAll(Sort sort);
	
}

package com.u2ware.service;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.u2ware.domain.PointLighting;


@RepositoryRestResource(collectionResourceRel = "pointLighting", path = "pointLighting")
public interface PointLightingResource extends PagingAndSortingRepository<PointLighting, Long>{

	Sort sort = new Sort(Direction.DESC, "no");
	Pageable pageable = new PageRequest(0, 20, sort);
		
	Iterable<PointLighting> findByTagIDLike(@Param("tagID") String tagID);
	Iterable<PointLighting> findByNameLike(@Param("name") String name);
		
	@Query(value = "SELECT * FROM Point_lighting WHERE name LIKE %:name%", nativeQuery = true)
	Iterable<PointLighting> findByName(@Param("name") String name);
	
	@Query(value = "SELECT * FROM Point_lighting WHERE tagAddr LIKE %:tagAddr%", nativeQuery = true)
	Iterable<PointLighting> findByUrl(@Param("tagAddr") String tagAddr);	
		
	@Query(value = "SELECT * FROM Point_lighting WHERE tagID = :%tagID%", nativeQuery = true)
	Iterable<PointLighting> findByTagID(@Param("tagID") String tagID);
	
	@Query(value = "SELECT * FROM Point_lighting WHERE description LIKE %:description%", nativeQuery = true)
	Iterable<PointLighting> findByTagDesc(@Param("description") String description);
	
	@Query(value = "SELECT * FROM Point_lighting WHERE tagID = :tagID", nativeQuery = true)
	Iterable<PointLighting> findByTagIDFull(@Param("tagID") String tagID);

}

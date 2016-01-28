package com.u2ware.service;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.u2ware.domain.PointHvac;


@RepositoryRestResource(collectionResourceRel = "pointHvac", path = "pointHvac")
public interface PointHvacResource extends PagingAndSortingRepository<PointHvac, Long>{

	Sort sort = new Sort(Direction.DESC, "no");
	Pageable pageable = new PageRequest(0, 20, sort);
		
	Iterable<PointHvac> findByTagIDLike(@Param("tagID") String tagID);
	Iterable<PointHvac> findByNameLike(@Param("name") String name);
		
	@Query(value = "SELECT * FROM point_hvac WHERE name LIKE %:name%", nativeQuery = true)
	Iterable<PointHvac> findByName(@Param("name") String name);
	
	@Query(value = "SELECT * FROM point_hvac WHERE tagAddr LIKE %:tagAddr%", nativeQuery = true)
	Iterable<PointHvac> findByUrl(@Param("tagAddr") String tagAddr);	
		
	@Query(value = "SELECT * FROM point_hvac WHERE tagID = :%tagID%", nativeQuery = true)
	Iterable<PointHvac> findByTagID(@Param("tagID") String tagID);
	
	@Query(value = "SELECT * FROM point_hvac WHERE description LIKE %:description%", nativeQuery = true)
	Iterable<PointHvac> findByTagDesc(@Param("description") String description);
	
	@Query(value = "SELECT * FROM point_hvac WHERE tagID = :tagID", nativeQuery = true)
	Iterable<PointHvac> findByTagIDFull(@Param("tagID") String tagID);

}

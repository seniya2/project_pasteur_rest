package com.u2ware.service;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.u2ware.domain.Point;


@RepositoryRestResource(collectionResourceRel = "point", path = "point")
public interface PointResource extends PagingAndSortingRepository<Point, Long>{

	@Query(value = "SELECT * FROM Point WHERE name LIKE %:name%", nativeQuery = true)
	Iterable<Point> findByName(@Param("name") String name);
	
	@Query(value = "SELECT * FROM Point WHERE url LIKE %:url%", nativeQuery = true)
	Iterable<Point> findByUrl(@Param("url") String url);	
	
	@Query(value = "SELECT * FROM Point WHERE tagID LIKE %:tagID%", nativeQuery = true)
	Iterable<Point> findByTagID(@Param("tagID") String tagID);
}

package com.u2ware.service;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.u2ware.domain.PointCctv;


@RepositoryRestResource(collectionResourceRel = "pointCctv", path = "pointCctv")
public interface PointCctvResource extends PagingAndSortingRepository<PointCctv, Long>{

	Sort sort = new Sort(Direction.DESC, "no");
	Pageable pageable = new PageRequest(0, 20, sort);
		
	Iterable<PointCctv> findByTagIDLike(@Param("tagID") String tagID);
	Iterable<PointCctv> findByNameLike(@Param("name") String name);
		
	@Query(value = "SELECT * FROM point_cctv WHERE name LIKE %:name%", nativeQuery = true)
	Iterable<PointCctv> findByName(@Param("name") String name);
	
	@Query(value = "SELECT * FROM point_cctv WHERE tagAddr LIKE %:tagAddr%", nativeQuery = true)
	Iterable<PointCctv> findByUrl(@Param("tagAddr") String tagAddr);	
		
	@Query(value = "SELECT * FROM point_cctv WHERE tagID = :%tagID%", nativeQuery = true)
	Iterable<PointCctv> findByTagID(@Param("tagID") String tagID);
	
	@Query(value = "SELECT * FROM point_cctv WHERE description LIKE %:description%", nativeQuery = true)
	Iterable<PointCctv> findByTagDesc(@Param("description") String description);
	
	@Query(value = "SELECT * FROM point_cctv WHERE tagID = :tagID", nativeQuery = true)
	Iterable<PointCctv> findByTagIDFull(@Param("tagID") String tagID);

}

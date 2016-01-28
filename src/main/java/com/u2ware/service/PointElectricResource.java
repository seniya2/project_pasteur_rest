package com.u2ware.service;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.u2ware.domain.PointElectric;


@RepositoryRestResource(collectionResourceRel = "pointElectric", path = "pointElectric")
public interface PointElectricResource extends PagingAndSortingRepository<PointElectric, Long>{

	Sort sort = new Sort(Direction.DESC, "no");
	Pageable pageable = new PageRequest(0, 20, sort);
		
	Iterable<PointElectric> findByTagIDLike(@Param("tagID") String tagID);
	Iterable<PointElectric> findByNameLike(@Param("name") String name);
		
	@Query(value = "SELECT * FROM point_electric WHERE name LIKE %:name%", nativeQuery = true)
	Iterable<PointElectric> findByName(@Param("name") String name);
	
	@Query(value = "SELECT * FROM point_electric WHERE tagAddr LIKE %:tagAddr%", nativeQuery = true)
	Iterable<PointElectric> findByUrl(@Param("tagAddr") String tagAddr);	
		
	@Query(value = "SELECT * FROM point_electric WHERE tagID = :%tagID%", nativeQuery = true)
	Iterable<PointElectric> findByTagID(@Param("tagID") String tagID);
	
	@Query(value = "SELECT * FROM point_electric WHERE description LIKE %:description%", nativeQuery = true)
	Iterable<PointElectric> findByTagDesc(@Param("description") String description);
	
	@Query(value = "SELECT * FROM point_electric WHERE tagID = :tagID", nativeQuery = true)
	Iterable<PointElectric> findByTagIDFull(@Param("tagID") String tagID);

}

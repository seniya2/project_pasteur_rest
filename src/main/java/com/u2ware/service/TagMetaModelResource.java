package com.u2ware.service;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.u2ware.domain.TagMetaModel;


@RepositoryRestResource(collectionResourceRel = "tagMetaModel", path = "tagMetaModel")
public interface TagMetaModelResource extends PagingAndSortingRepository<TagMetaModel, Long>{

	@Query(value = "SELECT * FROM tag_meta_model WHERE name LIKE %:name%", nativeQuery = true)
	Iterable<TagMetaModel> findByName(@Param("name") String name);
	
	@Query(value = "SELECT * FROM tag_meta_model WHERE tagAddr LIKE %:tagAddr%", nativeQuery = true)
	Iterable<TagMetaModel> findByUrl(@Param("tagAddr") String tagAddr);	
	
	@Query(value = "SELECT * FROM tag_meta_model WHERE tagID LIKE %:tagID%", nativeQuery = true)
	Iterable<TagMetaModel> findByTagID(@Param("tagID") String tagID);
	
	@Query(value = "SELECT * FROM tag_meta_model WHERE description LIKE %:description%", nativeQuery = true)
	Iterable<TagMetaModel> findByTagDesc(@Param("description") String description);
	
	@Query(value = "SELECT * FROM tag_meta_model WHERE tagID = :tagID", nativeQuery = true)
	Iterable<TagMetaModel> findByTagIDFull(@Param("tagID") String tagID);
}

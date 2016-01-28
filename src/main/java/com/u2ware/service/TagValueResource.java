package com.u2ware.service;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.u2ware.domain.TagValue;


@RepositoryRestResource(collectionResourceRel = "tagValue", path = "tagValue")
public interface TagValueResource extends PagingAndSortingRepository<TagValue, Long>{

	@Query(value = "SELECT * FROM tag_value WHERE tagID = :tagID", nativeQuery = true)
	Iterable<TagValue> findByTagID(@Param("tagID") String tagID);
}

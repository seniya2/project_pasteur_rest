package com.u2ware.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.u2ware.domain.AlarmFire;


@RepositoryRestResource(collectionResourceRel = "alarmFire", path = "alarmFire")
public interface AlarmFireResource extends PagingAndSortingRepository<AlarmFire, Long>{
	
	Iterable<AlarmFire> findByTagIDContains(@Param("tagID") String tagID);
}
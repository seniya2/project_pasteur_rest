package com.u2ware.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.u2ware.domain.AlarmHvac;


@RepositoryRestResource(collectionResourceRel = "alarmHvac", path = "alarmHvac")
public interface AlarmHvacResource extends PagingAndSortingRepository<AlarmHvac, Long>{

	Iterable<AlarmHvac> findByTagIDContains(@Param("tagID") String tagID);
}

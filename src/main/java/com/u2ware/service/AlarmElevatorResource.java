package com.u2ware.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.u2ware.domain.AlarmElevator;


@RepositoryRestResource(collectionResourceRel = "alarmElevator", path = "alarmElevator")
public interface AlarmElevatorResource extends PagingAndSortingRepository<AlarmElevator, Long>{
	
	Iterable<AlarmElevator> findByTagIDContains(@Param("tagID") String tagID);
}

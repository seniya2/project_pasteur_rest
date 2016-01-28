package com.u2ware.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.u2ware.domain.AlarmElectric;


@RepositoryRestResource(collectionResourceRel = "alarmElectric", path = "alarmElectric")
public interface AlarmElectricResource extends PagingAndSortingRepository<AlarmElectric, Long>{

	Iterable<AlarmElectric> findByTagIDContains(@Param("tagID") String tagID);
}

package com.u2ware.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.u2ware.domain.EnergyReport;


@RepositoryRestResource(collectionResourceRel = "energyReport", path = "energyReport")
public interface EnergyReportResource extends PagingAndSortingRepository<EnergyReport, Long>{
	
	Sort sort = new Sort(Direction.ASC, "daily");
	Pageable pageable = new PageRequest(0, 50, sort);
		
	Iterable<EnergyReport> findAll(Sort sort);
	Iterable<EnergyReport> findByDaily(@Param("daily") String Daily);
	//Iterable<EnergyReport> findByDailyContains(@Param("daily") String Daily);
	
	Page<EnergyReport> findByDailyContains(@Param("daily") String Daily, Pageable pageable);
	
}

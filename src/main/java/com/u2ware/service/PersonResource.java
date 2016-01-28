package com.u2ware.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.u2ware.domain.Person;


@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface PersonResource extends PagingAndSortingRepository<Person, Long>{

}

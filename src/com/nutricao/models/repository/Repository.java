package com.nutricao.models.repository;



import java.util.List;

public interface Repository<T> {

	List<T> findAll();

}

package com.pascal.springbootjpaexample.repository;

import com.pascal.springbootjpaexample.dto.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BookModelRepository extends CrudRepository<BookModel, Long> { }
package com.example.curd.service;

import com.example.curd.domain.UserEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.HTMLDocument;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer>,JpaSpecificationExecutor<UserEntity> {

}
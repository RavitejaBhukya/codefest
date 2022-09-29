package com.startyounguk.codefest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.startyounguk.codefest.model.Child;

@Repository
public interface ChildRepository extends JpaRepository<Child, Long> {
}

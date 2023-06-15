package com.tokenservicetestetecnicosql.repository;

import com.tokenservicetestetecnicosql.model.Child;
import com.tokenservicetestetecnicosql.model.Father;
import com.tokenservicetestetecnicosql.model.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentRepository extends JpaRepository<Parent,Long> {
}

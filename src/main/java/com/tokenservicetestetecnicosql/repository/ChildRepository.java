package com.tokenservicetestetecnicosql.repository;

import com.tokenservicetestetecnicosql.model.Child;
import com.tokenservicetestetecnicosql.model.Father;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildRepository extends JpaRepository<Child, Long> {


    @Query("select c from Child c join Parent ")
    Page<Child> findAllChild(Pageable pageable);


}

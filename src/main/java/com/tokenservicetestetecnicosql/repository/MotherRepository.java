package com.tokenservicetestetecnicosql.repository;

import com.tokenservicetestetecnicosql.model.Mother;
import com.tokenservicetestetecnicosql.model.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MotherRepository extends JpaRepository<Mother,Long> {



    @Query("SELECT size(f.childs) FROM Mother f WHERE f.name ='Mary'")
    Integer countHomManyChildenMaryHas();


}

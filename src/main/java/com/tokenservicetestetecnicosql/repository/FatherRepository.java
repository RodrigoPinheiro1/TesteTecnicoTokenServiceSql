package com.tokenservicetestetecnicosql.repository;

import com.tokenservicetestetecnicosql.model.Father;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FatherRepository extends JpaRepository<Father,Long> {




    @Query("select f from Father f join Parent ")
    Page<Father> findByName(Pageable pageable);


  @Query("SELECT f FROM Father f WHERE SIZE(f.childs) > 1")
    Page<Father> countHomManyFathersHaveMoresThanOneChild(Pageable pageable );


    @Query("SELECT size(f.childs) FROM Father f WHERE f.name ='John'")
    Integer countHomManyChildenJohnHas();

}

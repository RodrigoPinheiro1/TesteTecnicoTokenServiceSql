package com.tokenservicetestetecnicosql.service;


import com.tokenservicetestetecnicosql.dto.ChildDto;
import com.tokenservicetestetecnicosql.dto.FatherNameDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ParentService {


    String HowManyChildsJohnHas();
    String HowManyChildsMaryHas();
    Page<FatherNameDto> seachByName(Pageable pageable);

    Page<FatherNameDto> findFatherHasMoreThanOneChild(Pageable pageable);

    Page<ChildDto> getAllFathersAndMothersOfTheirChilds(Pageable pageable);


}

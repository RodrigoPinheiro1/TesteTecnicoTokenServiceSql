package com.tokenservicetestetecnicosql.controller;

import com.tokenservicetestetecnicosql.dto.ChildDto;
import com.tokenservicetestetecnicosql.dto.FatherNameDto;
import com.tokenservicetestetecnicosql.service.implemts.ParentServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parent")
public class FatherController {



    @Autowired
    private ParentServiceImple fatherService;

    @GetMapping("/father")
    public Page<FatherNameDto> getAllFathersName(Pageable pageable){

       return fatherService.seachByName(pageable);
    }

    @GetMapping("/family")
    public Page<ChildDto> getAllFathersAndMothersOfTheirChilds(Pageable pageable){

        return fatherService.getAllFathersAndMothersOfTheirChilds(pageable);
    }


    @GetMapping("/moreThanOneChild")
    public Page<FatherNameDto> getAllFathersNamesHaveMoreThanOneChild(Pageable pageable){

      return   fatherService.findFatherHasMoreThanOneChild(pageable);
    }


    @GetMapping("/john")
    public String qtdChildsJohn(){

        return fatherService.HowManyChildsJohnHas();
    }

    @GetMapping("/mary")
    public String qtdChildsMary(){

        return fatherService.HowManyChildsMaryHas();
    }



}

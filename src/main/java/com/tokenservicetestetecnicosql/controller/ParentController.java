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
public class ParentController {


    @Autowired
    private ParentServiceImple fatherService;

    //exercise 1
    @GetMapping("/father")
    public Page<FatherNameDto> getAllFathersName(Pageable pageable) {

        return fatherService.seachByName(pageable);
    }

    //exercise 2

    @GetMapping("/moreThanOneChild")
    public Page<FatherNameDto> getAllFathersNamesHaveMoreThanOneChild(Pageable pageable) {

        return fatherService.findFatherHasMoreThanOneChild(pageable);
    }

    //exercise 3
    @GetMapping("/family")
    public Page<ChildDto> getAllFathersAndMothersOfTheirChilds(Pageable pageable) {

        return fatherService.getAllFathersAndMothersOfTheirChilds(pageable);
    }


    //exercise 4
    @GetMapping("/john")
    public String qtdChildsJohn() {

        return fatherService.HowManyChildsJohnHas();
    }
    //exercise 5

    @GetMapping("/mary")
    public String qtdChildsMary() {

        return fatherService.HowManyChildsMaryHas();
    }


}

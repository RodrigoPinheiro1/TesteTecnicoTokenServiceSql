package com.tokenservicetestetecnicosql.service.implemts;

import com.tokenservicetestetecnicosql.dto.ChildDto;
import com.tokenservicetestetecnicosql.dto.FatherNameDto;
import com.tokenservicetestetecnicosql.repository.ChildRepository;
import com.tokenservicetestetecnicosql.repository.FatherRepository;
import com.tokenservicetestetecnicosql.repository.MotherRepository;
import com.tokenservicetestetecnicosql.service.ParentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ParentServiceImple implements ParentService {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private FatherRepository fatherRepository;

    @Autowired
    private MotherRepository motherRepository;

    @Autowired
    private ChildRepository childRepository;


    @Override
    public Page<FatherNameDto> seachByName(Pageable pageable) {

     return fatherRepository.findByName(pageable).map(father -> modelMapper.map(father,FatherNameDto.class));

    }

    @Override
    public Page<FatherNameDto> findFatherHasMoreThanOneChild(Pageable pageable) {
        return fatherRepository.countHomManyFathersHaveMoresThanOneChild(pageable)
                .map(father -> modelMapper.map(father,FatherNameDto.class));
    }

    @Override
    public String HowManyChildsJohnHas(){

        return "John Has "+ fatherRepository.countHomManyChildenJohnHas() + " childs";
    }

    @Override
    public String HowManyChildsMaryHas(){

        return "Mary Has "+ motherRepository.countHomManyChildenMaryHas() +" childs";
    }

    @Override
    public Page<ChildDto> getAllFathersAndMothersOfTheirChilds(Pageable pageable) {

      return   childRepository.findAllChild(pageable).map(child -> modelMapper.map(child, ChildDto.class));
    }



}

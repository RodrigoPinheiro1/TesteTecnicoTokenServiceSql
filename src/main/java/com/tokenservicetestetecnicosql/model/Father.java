package com.tokenservicetestetecnicosql.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Father extends Parent {


    @OneToMany(mappedBy = "father",cascade =  CascadeType.ALL)
    private List<Child> childs = new ArrayList<>();
}

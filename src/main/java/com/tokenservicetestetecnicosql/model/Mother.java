package com.tokenservicetestetecnicosql.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Mother extends Parent {

    @OneToMany(mappedBy = "mother", cascade = CascadeType.ALL)
    private List<Child> childs = new ArrayList<>();

}

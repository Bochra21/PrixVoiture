package com.example.PrixVoiture.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity

@Table (  uniqueConstraints = {
        @UniqueConstraint(columnNames = "markName"),

})

public class Mark
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long markId ;
    @NotBlank
    @Size(max = 20)
    private String markName ;

    public List<Model> getModels() {
        return models;
    }

    public void setModels(List<Model> models) {
        this.models = models;
    }

    @OneToMany(mappedBy = "mark", cascade = CascadeType.ALL)
    private List<Model> models = new ArrayList<>();

    public Long getMarkId() {
        return markId;
    }

    public String getMarkName() {
        return markName;
    }


    public void setMarkId(Long markId) {
        this.markId = markId;
    }

    public void setMarkName(String markName) {
        this.markName = markName;
    }



}

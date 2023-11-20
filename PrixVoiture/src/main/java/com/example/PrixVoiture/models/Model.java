package com.example.PrixVoiture.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(uniqueConstraints={
        @UniqueConstraint( columnNames = "modelName")
})
public class Model

{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long modelId ;

    @NotBlank
    private String modelName ;


    @ManyToOne
    @JoinColumn(name = "markId")
    private Mark mark;

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }
}

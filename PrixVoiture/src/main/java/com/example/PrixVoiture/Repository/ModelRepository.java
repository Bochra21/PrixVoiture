package com.example.PrixVoiture.Repository;


import com.example.PrixVoiture.models.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="model")
public interface ModelRepository extends JpaRepository<Model,Long> {
}

package com.example.PrixVoiture.Repository;


import com.example.PrixVoiture.models.Mark;
import com.example.PrixVoiture.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path="mark")
public interface MarkRepository extends JpaRepository<Mark, Long>

{

}

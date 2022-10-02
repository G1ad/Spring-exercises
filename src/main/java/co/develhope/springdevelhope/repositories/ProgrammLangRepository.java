package co.develhope.springdevelhope.repositories;

import co.develhope.springdevelhope.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


@RepositoryRestResource(path = "repo-prog-languages")
public interface ProgrammLangRepository extends JpaRepository <ProgrammingLanguage, Long> {
}

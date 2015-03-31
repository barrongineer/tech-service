package io.barrongineer.techservice.repository;

import io.barrongineer.techservice.domain.Technology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by shaunn on 3/29/2015.
 */
public interface TechnologyRepository extends JpaRepository<Technology, Long> {

    public List<Technology> findAllByDisplayNameContainingIgnoreCase(String displayName);
}

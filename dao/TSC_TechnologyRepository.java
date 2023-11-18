package com.team4.catalogbackend.dao;


import com.team4.catalogbackend.model.TSC_Technology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TSC_TechnologyRepository extends JpaRepository<TSC_Technology, Long> {
    // You can add custom queries if needed
}

package com.example.lab6_gtics_20206442.Repository;

import com.example.lab6_gtics_20206442.Entity.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteRepository extends JpaRepository<Site, Integer> {
}

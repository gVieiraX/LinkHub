package com.tinylinkapi.repository;

import com.tinylinkapi.entity.LinkHub;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LinkHubRepository extends JpaRepository<LinkHub, Long> {
    Optional<LinkHub> findByUrlPortfolio(String urlPortfolio); // Corrigido para findByUrlPortfolio
    Optional<LinkHub> findByEmail(String email);
}
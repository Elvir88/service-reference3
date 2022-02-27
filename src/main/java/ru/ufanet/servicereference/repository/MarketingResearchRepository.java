package ru.ufanet.servicereference.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import ru.ufanet.servicereference.domain.MarketingResearch;

/**
 * Spring Data SQL repository for the MarketingResearch entity.
 */
@SuppressWarnings("unused")
@Repository
public interface MarketingResearchRepository extends JpaRepository<MarketingResearch, Long> {}

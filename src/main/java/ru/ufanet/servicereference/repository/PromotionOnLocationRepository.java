package ru.ufanet.servicereference.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import ru.ufanet.servicereference.domain.PromotionOnLocation;

/**
 * Spring Data SQL repository for the PromotionOnLocation entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PromotionOnLocationRepository extends JpaRepository<PromotionOnLocation, Long> {}

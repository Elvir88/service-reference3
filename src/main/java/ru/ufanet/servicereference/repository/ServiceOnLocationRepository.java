package ru.ufanet.servicereference.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import ru.ufanet.servicereference.domain.ServiceOnLocation;

/**
 * Spring Data SQL repository for the ServiceOnLocation entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ServiceOnLocationRepository extends JpaRepository<ServiceOnLocation, Long> {}

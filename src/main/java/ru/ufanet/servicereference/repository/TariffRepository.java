package ru.ufanet.servicereference.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import ru.ufanet.servicereference.domain.Tariff;

/**
 * Spring Data SQL repository for the Tariff entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TariffRepository extends JpaRepository<Tariff, Long> {}

package ru.ufanet.servicereference.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import ru.ufanet.servicereference.domain.House;

/**
 * Spring Data SQL repository for the House entity.
 */
@SuppressWarnings("unused")
@Repository
public interface HouseRepository extends JpaRepository<House, Long> {}

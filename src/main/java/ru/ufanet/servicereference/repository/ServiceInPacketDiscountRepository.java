package ru.ufanet.servicereference.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import ru.ufanet.servicereference.domain.ServiceInPacketDiscount;

/**
 * Spring Data SQL repository for the ServiceInPacketDiscount entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ServiceInPacketDiscountRepository extends JpaRepository<ServiceInPacketDiscount, Long> {}

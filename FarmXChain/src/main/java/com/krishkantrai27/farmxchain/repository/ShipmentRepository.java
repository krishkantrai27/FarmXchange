package com.krishkantrai27.farmxchain.repository;

import com.krishkantrai27.farmxchain.entity.Shipment;
import com.krishkantrai27.farmxchain.entity.ShipmentStatus;
import com.krishkantrai27.farmxchain.entity.Order;
import com.krishkantrai27.farmxchain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
    Optional<Shipment> findByOrder(Order order);
    List<Shipment> findByDistributor(User distributor);
    List<Shipment> findByDistributorAndStatus(User distributor, ShipmentStatus status);
}

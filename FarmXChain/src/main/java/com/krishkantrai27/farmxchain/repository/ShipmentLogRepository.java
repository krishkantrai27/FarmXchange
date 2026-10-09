package com.krishkantrai27.farmxchain.repository;

import com.krishkantrai27.farmxchain.entity.Shipment;
import com.krishkantrai27.farmxchain.entity.ShipmentLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ShipmentLogRepository extends JpaRepository<ShipmentLog, Long> {
    List<ShipmentLog> findByShipmentOrderByCreatedAtAsc(Shipment shipment);
    List<ShipmentLog> findByShipmentIdOrderByCreatedAtAsc(Long shipmentId);
}

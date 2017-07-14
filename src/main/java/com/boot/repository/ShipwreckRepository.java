package com.boot.repository;

import com.boot.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jordank on 7/13/2017.
 */
public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {
}

package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Zone;
import com.example.demo.repositories.ZoneRepository;

@Service
public class ZoneService {
    @Autowired
    private ZoneRepository zoneRepository;

    public Zone createZone(Zone zone) {
        return zoneRepository.save(zone);
    }

    public List<Zone> getAllZone() {
        return zoneRepository.findAll();
    }

    public Zone getZoneById(Long id) {
        return zoneRepository.findById(id).orElse(null);
    }

    public Zone updateZone(Long id, Zone zone) {
        zone.setId(id);
        return zoneRepository.save(zone);
    }

    public void deleteZone(Long id) {
        zoneRepository.deleteById(id);
    }

}

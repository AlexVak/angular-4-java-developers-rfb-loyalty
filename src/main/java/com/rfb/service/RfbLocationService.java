package com.rfb.service;

import com.rfb.service.dto.RfbLocationDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing {@link com.rfb.domain.RfbLocation}.
 */
public interface RfbLocationService {

    /**
     * Save a rfbLocation.
     *
     * @param rfbLocationDTO the entity to save.
     * @return the persisted entity.
     */
    RfbLocationDTO save(RfbLocationDTO rfbLocationDTO);

    /**
     * Get all the rfbLocations.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<RfbLocationDTO> findAll(Pageable pageable);

    /**
     * Get the "id" rfbLocation.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<RfbLocationDTO> findOne(Long id);

    /**
     * Delete the "id" rfbLocation.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}

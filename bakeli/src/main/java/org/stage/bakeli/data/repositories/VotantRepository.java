package org.stage.bakeli.data.repositories;

import org.stage.bakeli.data.entities.Electeurs;
import org.stage.bakeli.data.entities.Votant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VotantRepository  extends JpaRepository<Votant,Long> {
    Long countAllByIsActiveTrue();

    
}

package org.stage.bakeli.data.fixtures;

import lombok.RequiredArgsConstructor;
import org.stage.bakeli.data.entities.Electeurs;
import org.stage.bakeli.data.entities.Votant;
import org.stage.bakeli.data.repositories.ElecteurRepository;
import org.stage.bakeli.data.repositories.VotantRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class VotantFixtures implements CommandLineRunner {
    private final VotantRepository votantRepository;
    private final ElecteurRepository electeurRepository;


    @Override
    public void run(String... args) throws Exception {
        for(Long i = 1L; i < 10; i++){
            Electeurs electeurs = electeurRepository.findById(i).orElse(null);
            Votant votant = new Votant();
            votant.setElecteurs(electeurs);
            votant.setIsActive(true);
            votantRepository.save(votant);
        }

    }
}

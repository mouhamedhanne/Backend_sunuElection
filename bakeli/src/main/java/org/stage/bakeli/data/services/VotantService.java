package org.stage.bakeli.data.services;

public interface VotantService {
    Long getNombreVotant();
    void addVote(String numeroCni);
}

package org.stage.bakeli.data.security.services;

import org.stage.bakeli.data.entities.Electeurs;
import org.stage.bakeli.data.security.data.entities.AppRole;
import org.stage.bakeli.data.security.data.entities.AppUser;
import org.springframework.security.core.userdetails.UserDetails;

public interface CustomUserDetailsService {
    AppUser getUser(String numeroCNI);
    UserDetails loadUserByUsername(String numeroCNI);
    AppUser saveUser(String nom,String prenom,String telephone ,String Cni,String numeroElecteur);
    AppRole saveRole(String roleName);
    void addRoleToUser(String nom,String roleName);
    void removeRoleToUser(String nom,String roleName);
}

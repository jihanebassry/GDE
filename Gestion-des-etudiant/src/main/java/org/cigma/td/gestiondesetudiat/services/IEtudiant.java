package org.cigma.td.gestiondesetudiat.services;

import org.cigma.td.gestiondesetudiat.entities.Etudiant;
import org.cigma.td.gestiondesetudiat.enums.Gender;

import java.util.Collection;

public interface IEtudiant {
    Etudiant matcheEtudiant(
            final int age, final String cin, final String email, final String nom,
            final String prenom, final Gender sexe, final String telephone
    );

    void affecterIdentifiant(final Etudiant etudiant, final String cin, final String id);

    String afficherEtudiantAutorise(final Collection<Etudiant> etudiants);

    String afficherTousEtudiant(final Collection<Etudiant> etudiants);
}

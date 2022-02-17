package org.cigma.td.gestiondesetudiat.services;

import org.cigma.td.gestiondesetudiat.entities.Etudiant;
import org.cigma.td.gestiondesetudiat.enums.Gender;

import java.util.Collection;
import java.util.Scanner;
import java.util.regex.Matcher;

import static org.cigma.td.gestiondesetudiat.constants.Constant.*;
import static org.cigma.td.gestiondesetudiat.constants.Message.*;

public class EtudiantImp implements IEtudiant {
    private Helper helper = new Helper();
    private String message = "La collection est vide\n";

    @Override
    public Etudiant matcheEtudiant(final int age, final String cin, final String email, final String nom,
                                   final String prenom, final Gender sexe, final String telephone) {
        final Etudiant etd = new Etudiant();

        final Matcher matchNom = helper.matchInput(matcherName, nom);
        if (matchNom.find()) {
            etd.setNom(nom);
        } else {
            System.err.println(nomPrenomWarn);
        }

        Matcher matchPrenom = helper.matchInput(matcherName, prenom);
        if (matchPrenom.find()) {
            etd.setPrenom(prenom);
        } else {
            System.err.println(nomPrenomWarn);
        }

        Matcher matchAge = helper.matchInput(matcherAge, age);
        if (matchAge.find()) {
            etd.setAge(age);
        } else {
            System.err.println(ageWarn);
        }

        Matcher matchCin = helper.matchInput(matcherCIN, cin);
        if (matchCin.find()) {
            etd.setCin(cin);
        } else {
            System.err.println(cinWarn);
        }

        Matcher matchEmail = helper.matchInput(matcherEmail, email);
        if (matchEmail.find()) {
            etd.setEmail(email);
        } else {
            System.err.println(emailWarn);
        }

        Matcher matchTelephone = helper.matchInput(matcherTelephone, telephone);
        if (matchTelephone.find()) {
            etd.setTelephone(telephone);
        } else {
            System.err.println(telephoneWarn);
        }

        Matcher matchGender = helper.matchInput(matcherGender, sexe.name());
        if (matchGender.find()) {
            etd.setSexe(sexe);
        } else {
            System.err.println(genderWarn);
        }
        return new Etudiant(age, cin, email, nom, prenom, sexe, telephone);
    }

    @Override
    public void affecterIdentifiant(final Etudiant etudiant, final String cin, final String id) {
        Matcher matchId = helper.matchInput(matcherId, id);
        if (etudiant.getId() == null) {
            if (matchId.find()) {
                etudiant.setId(id);
                System.out.println(operationInfo);
            } else {
                System.err.println(idWarn);
            }
        } else if (!etudiant.getId().equals(id)) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Étudiant a l'Identifiant " + etudiant.getId() + " déjà!! Voulez-vous modifier (oui|non): ");
            final String reponse = scanner.next();
            if (reponse.equals("oui")) {
                System.out.print("Saisissez le nouveau Identifiant: ");
                final String identifiant = scanner.next();
                if (matchId.find()) {
                    etudiant.setId(identifiant);
                    System.out.println(operationInfo);
                } else {
                    System.err.println(idWarn);
                }
            }
        } else {
            System.out.println("\nIdentifiant " + id + " existe déjà");
        }
    }

    @Override
    public String afficherEtudiantAutorise(Collection<Etudiant> etudiants) {
        if (!etudiants.isEmpty()) {
            for (Etudiant e : etudiants) {
                if (e.getId() != null) {
                    final String fullname = e.fullname();
                    message = "Étudiant: " + fullname + " CIN: " + e.getCin() + " Code d'accès: "
                            + e.getId() + " est autorisé";
                }
            }
        }
        return message;
    }

    @Override
    public String afficherTousEtudiant(Collection<Etudiant> etudiants) {
        if (!etudiants.isEmpty()) {
            for (Etudiant e : etudiants) {
                message = "Étudiant code: " + e.getId() + "\nNom complet " + e.fullname() + " age: " + e.getAge()
                        + " CIN: " + e.getCin() + " Email: " + e.getEmail() + " sexe: " + e.getSexe()
                        + " telephone: " + e.getTelephone();
            }
        }
        return message;
    }

}

package org.cigma.td.gestiondesetudiat.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.cigma.td.gestiondesetudiat.enums.Gender;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
public class Etudiant {
    private String id;
    private Integer age;
    private String cin;
    private String email;
    private String nom;
    private String prenom;
    private Gender sexe;
    private String telephone;

    public Etudiant(int age, String cin, String email, String nom, String prenom, Gender sexe, String telephone) {
        this.age = age;
        this.cin = cin;
        this.email = email;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.telephone = telephone;
    }

    public String fullname() {
        return nom +" "+ prenom;
    }

    @Override
    public String toString() {
        return "Info Etudiant: "+ '\n' + "nom: " + nom + ", prenom: " + prenom + ", age: " + age
                + ", cin: " + cin + ", email: " + email + ", telephone: " + telephone +", sexe: " + sexe;
    }
}

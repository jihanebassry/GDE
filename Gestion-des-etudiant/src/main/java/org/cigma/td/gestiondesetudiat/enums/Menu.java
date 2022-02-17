package org.cigma.td.gestiondesetudiat.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum Menu {
    AJOUTER_ETUDIANT("1"),
    AFFECTER_CODE_ACCES("2"),
    AFFICHER_ETUDIANTS_AUTORISER("3"),
    FAUSSE_OPTION("Merci de choisir une option dans le menu");

    private String option;

    public static Menu selectOption(String selectedOption) {
        return Arrays.stream(Menu.values())
                .filter(o -> o.option.equals(selectedOption))
                .findFirst()
                .orElse(FAUSSE_OPTION);
    }
}

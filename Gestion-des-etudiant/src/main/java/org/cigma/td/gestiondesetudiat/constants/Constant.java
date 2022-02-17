package org.cigma.td.gestiondesetudiat.constants;

import org.cigma.td.gestiondesetudiat.enums.Gender;

public class Constant {
    public static final String matcherId = "^[A-Z][0-9]*";
    public static final String matcherName = "^[a-zA-Z]";
    public static final String matcherEmail = "\\b[a-zA-Z0-9._%-]+@[a-zA-Z].[a-zA-Z]{2,}\\b";
    public static final String matcherCIN = "^[A-Z]{1,2}[0-9]{6}";
    public static final String matcherTelephone = "0|\\+212|00212[5-7][0-9]{8}";
    public static final String matcherAge = "^[2-9][3-9]|^[3-9][0-9]";
    public static final String matcherGender = Gender.MALE + "|" + Gender.FEMALE;
    public static final String options =
            "______________________________________\n" +
            "| 1- Ajouter étudiant                |\n" +
            "| 2- Affecter code d'accès           |\n" +
            "| 3- Afficher les étudiants autorisé |\n" +
            "| 4- Afficher tous étudiants         |\n" +
            "______________________________________\n" +
            "Choisissez le numero d'opération parmi les suivants: ";
    public static String creationMessage = "Veuillez entrer les informations de l'étudiant au format : " +
            "age, cin, email, nom, prenom, gender(MALE|FEMALE), téléphone";

}

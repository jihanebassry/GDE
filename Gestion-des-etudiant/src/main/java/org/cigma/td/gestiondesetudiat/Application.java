package org.cigma.td.gestiondesetudiat;

import org.cigma.td.gestiondesetudiat.entities.Etudiant;
import org.cigma.td.gestiondesetudiat.enums.Gender;
import org.cigma.td.gestiondesetudiat.enums.Menu;
import org.cigma.td.gestiondesetudiat.services.EtudiantImp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import static org.cigma.td.gestiondesetudiat.constants.Constant.creationMessage;
import static org.cigma.td.gestiondesetudiat.constants.Constant.options;
import static org.cigma.td.gestiondesetudiat.constants.Message.ajoutEtudiantInfo;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EtudiantImp service = new EtudiantImp();
        Collection<Etudiant> etudiants = new ArrayList<>();

        do {
            System.out.print(options);
            String input = scanner.nextLine();
            Menu option = Menu.selectOption(input);
            switch (option) {
                case AJOUTER_ETUDIANT: {
                    System.out.println(creationMessage);
                    String[] etudiantArgs = scanner.nextLine().split(", ");

                    etudiants.add(service.matcheEtudiant(
                            Integer.parseInt(etudiantArgs[0]), etudiantArgs[1], etudiantArgs[2], etudiantArgs[3],
                            etudiantArgs[4], Gender.valueOf(etudiantArgs[5]), etudiantArgs[6])
                    );
                    System.out.println(ajoutEtudiantInfo);
                    break;
                }
                case AFFECTER_CODE_ACCES: {
                    System.out.print("Saisissez le numéro de la CIN: ");
                    final String cin = scanner.next();
                    System.out.print("Saisissez le numéro d'Identifiant: ");
                    final String id = scanner.next();
                    etudiants.stream()
                            .filter(etd -> etd.getCin().equals(cin))
                            .findAny()
                            .ifPresentOrElse(
                                    etd -> service.affecterIdentifiant(etd, cin, id),
                                    () -> System.err.println("\nLa CIN " + cin + " n'existe pas !!")
                            );
                    break;
                }
                case AFFICHER_ETUDIANTS_AUTORISER: {
                    System.out.println(service.afficherEtudiantAutorise(etudiants));
                    break;
                }
                default: {
                    System.err.println("\nMerci de choisir une option dans le menu");
                    break;
                }
            }

        } while (true);
    }
}

Pour le compte d'un client, nous allons créer une petite application pour gérer les étudiants et leur accès au site, selon le cadrage avec les gens du métier le Product Owner à prioriser pour le premier sprint trois user stories pour réaliser un premier livrable qui sera présenté au métiers.

## **User Story 1** : Création des étudiants

En tant qu'utilisateur je souhaite avoir la possibilité depuis une ligne de commande de saisir les informations suivantes :
Nom, Prénom, Age Sexe, CIN, Email, Téléphone

### Critère d'acceptantes :
Touts les champs sont requis
#### Exemple :
**Le nom et prénom doit être valide seulement les alphabets**
```
Hassan Bassi Valide
Hassan1 Bassi1 Non Valide
Age doit être supérieur ou égale à 23 ans
Sexe accepte les valeurs suivantes : MALE,FEMALE.
```

#### Exemple :
**CIN doit être sous le format  [A-Z]{1,2} [0-9]{6}**
```
BJ304050 Valide
B404030 Valide
45664 Non Valide
44BJ4400 Non Valide
```

#### Exemple :
**Email doit être sous le format [A-Za-z]@[A-Za-z].[A-Za-z]{2,}**
```
x@x.com Valide
x@1.com Non Valide
1@x.com Non Valide
x@x.1 Non Valide
```

**Téléphone doit être sous le format +212[0-9]{10}**

**Le CIN doit être unique par étudiant**

## **User Story 2** : accorder l'accès à l'étudiant :

En tant qu'utilisateur je souhaite avoir la possibilité depuis une ligne de commande d'affecter un code accès à un étudiant :

### Critère d'acceptantes :
1. Saisir le CIN et le code d'accès Code accès unique par étudiant 
2. **si le code existe déjà un message d'erreur s'affiche**
3. **Si l'étudiant est introuvable un message d'erreur s'affiche**

## **User Story 3** : Afficher la liste des étudiants qui ont l’accès :

En tant qu'utilisateur je souhaite avoir la possibilité depuis une ligne de commande d'afficher l'ensemble des étudiants qui ont l’accès

### Critère d'acceptantes :
Les valeurs à afficher sont : **le nom complet, CIN, code accès**

Vous trouverez ci-joint le code source de l'application qu'on a conçu ensemble avec quelque ajustement pour vous donner des réflexions.

Le livrable se compose d'un : 
1. Rapport qui doit contenir
2. Diagramme de classe
3. Les user stories implémenter avec des questions s'il y on a
4. Le code source sous format zip.

**Date limite d’envoi  06/01/2022**
#exam

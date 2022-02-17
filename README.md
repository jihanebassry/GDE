# GDE

### Nous avons créer un dépôt git sur la plateforme Github sous le lien suivant : 

```
https://github.com/jihanebassry/GDE.git
```

# Gestion des étudiants 

#### Nous avons crée une petite application pour gérer les étudiants et leur accès au site selon  trois *user stories*

## 1. User Story 1 : ``` Création des étudiants ```   

#### Nous avons gérées la possibilité depuis une ligne de commande de saisir les informations suivantes :
```
Nom;
Prénom; 
Age Sexe; 
CIN; 
Email; 
Téléphone.
```
#### Selon les critères suivantes : 

  1. **Touts les champs sont requis**
  2. **Le nom et prénom est valide seulement les alphabets** 

Exemple : 
```
Hassan Bassi Valide 
Hassan1 Bassi1 Non Valide
```
  3. **L'age est ```supérieur ou égale à 23 ans```**
  4. **Les valeurs du Sexe est: ```MALE,FEMALE.```**
  5. **CIN est sous le format: ``` [A-Z]{1,2} [0-9]{6}```**


Exemple : 
```
BJ304050 Valide
B404030 Valide
45664 Non Valide 
44BJ4400 Non Valide
```
  6. **Avec Le CIN est soit ```unique par étudiant```**
  7. **Email est sous le format: ``` [A-Za-z]@[A-Za-z].[A-Za-z]{2,}```**

Exemple : 
```
x@x.com Valide
x@1.com Non Valide
1@x.com Non Valide 
x@x.1 Non Valide
```
  8. **Téléphone est sous le format ```+212[0-9]{10}```**

## 2. User Story 2 : ```accorder l'accès à l'étudiant```

#### Nous avons gérées la possibilité depuis une ligne de commande d'affecter un code accès à un étudiant :

Critère d'acceptantes : 
```
1. Saisir le CIN et le code d'accès
2. Code accès unique par étudiant si le code existe déjà un message d'erreur s'affiche
3. Si l'étudiant est introuvable un message d'erreur s'affiche 
```
## 3. User Story 3 : ```Afficher la liste des étudiants qui ont l’accès```

#### Nous avons gérées la possibilité depuis une ligne de commande d'afficher l'ensemble des étudiants qui ont l’accès 

Les valeurs à afficher sont :

```
1. le nom complet;
2. CIN;
3. code accès.
```

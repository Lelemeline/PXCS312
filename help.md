# Projet Crypto -- Manuel

## Overview
Ce projet a pour but de chiffrer des textes en fonction des méthodes de cryptage et des clés décidées par l'utilisateur.
## Utilisation

Utilisez -help pour voir cette page.
Spécifiez dans les options si vous voulez encode/décoder, quel type de chiffrement, le texte à encoder et la clé si nécessaire ( dans cet ordre ).

## Options
-e/-d : utiliser pour spécifier si l'utilisateur veut encoder/décoder son texte selon la méthode de chiffrement choisie

- rot13 : cas particulier du code césar : rotation de 13.
- caesar : code césar
- sub : code de substitution
- otp : code de verman

L'argument suivant l'algorithme choisi est obligatoirement le texte à modifier, suivi de la clé (sauf pour l'option rot13).

### Code césar

Ce code utilise un entier qui permet de faire une rotation dans l'alphabet.
Exemple : si on spécifie 5 en entier, on remplace A par E.

### Code de substitution

Ce code a besoin d'un tableau de 60 caractères en clé( ou d'un String de 60 char) afin de substituer tous les caractères (alphabet minsucule, majuscule et caractères spéciaux, soit les voyelles avec acccent)

### Code de Verman

Le chiffre de Vernam, est un algorithme de cryptographie qui ajoute la notion de clé aléatoire.
Le chiffrement par la méthode du masque jetable consiste à combiner le message en clair avec une clé présentant les caractéristiques très particulières suivantes :

    1. La clé doit être une suite de caractères au moins aussi longue que le message à chiffrer.
    2. Les caractères composant la clé doivent être choisis de façon totalement aléatoire.
    3. Chaque clé, ou « masque », ne doit être utilisée qu'une seule fois (d'où le nom de masque jetable).
# PXCS312

Ce mini-projet a pour but de nous faire utiliser et découvrir en projet java.
Nous devons développer une application de chiffrement/déchiffrement avec comme chiffrements obligatoire le code césar, la substitution, le code de Vernam.
Le reste des codages est laissé à l'appréciation.
Nous disposons d'un peu moins d'une semaine pour ce projet.

## Construction du projet

Nous avons implémenté dans un package Algos les algos demandés, à savoir le code César, la subsitution et le code de Vernam.
Nous avons également implemté une partie d'Engima, mais par manque de temps, et parce que visiblement il y avait des problèmes au décryptage, nous ne sommes pas allés plus loin.
Nous avons réalisé de façon indépendantes des tests, dans le package test, afin de vérifier que nos codes fonctionnaient. Les tests sont validés.
Nous avons également implémenté une interface Crypto,dans le pacakge Crypto; et enfin, une classe Main, qui nous permettaient d'appeler les différentes fonctions avec les bons arguments.

## Manipulation

Autant les tests ont été validés, autant nous avons eu du mal à travailler avec la classe Main. À la compilation, l'instance cesar ne passait pas du tout, et empêchait le projet de se construire complètement; nous n'avons pas réussi à résoudre ce problème.
Ensuite, une fois le programme compilé ( en commentant cesar), le programme n'affichait pas le texte demandé.

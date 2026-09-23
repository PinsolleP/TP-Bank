# TP-Bank
Objectif : Réaliser de A à Z une petite application de gestion bancaire (en console) 

# Enoncé de l'exercice
    Si vous le souhaitez, vous pouvez réaliser un ou plusieurs diagrammes UML et les faire 
valider par le formateur (diagramme de classes, diagramme des cas d’utilisation 
notamment) 

    Voici ce que vous devrez mettre en place: 
    -la création et la consultation de comptes bancaires  
        Numéro de compte sous la forme FR-XXXX-XXXX par exemple, titulaire et solde 
    -La gestion d’opérations  
        Dépôt, retrait et virement, attention aux exceptions ! 
    -Un stockage persistant : 
        Dans un premier temps base de données, si vous finissez en avance, vous pouvez 
        essayer sans base de données, avec des fichiers texte/csv à la place -l’utilisation des concepts avancés vus en cours : 
        exceptions, regex, threads, flux I/O, streams, lambdas 

    Il faut imaginer cette application comme un outil pour conseiller bancaire, pas pour un 
client lambda

BONUS : 
-ajoutez une gestion de l’historique des opérations : date, type d’opération, montant et 
comptes concernés 
-ajoutez la notion de plafond et les exceptions qui vont avec 
Une liste d’exceptions que vous pouvez faire : 
    -Compte inexistant 
    -Solde insuffisant
# Framework
## ETU001970 RABARIJAONA Angoty Fitia 


web dynamique
Comprehension du fichier: 
    -1), 2)...:dossier
    -a), b)...:fichier
    -a-1), a-2)...:explication

<<<<<<< HEAD
# # sprint3 <!-- Annotations et initiation à l'emploi du framework -->
=======
<<<<<<< HEAD
# # sprint2 <!-- But: Definition de la class Map qui prend le nom et la method de la classe concernée-->
    1)src\java: 
        a)FrontServlet.java:
            a-1) processRequest+Quelques fonctions(prend les derniers urls)
            a-2) doPost, doGet : appelle la fonction processRequest
            a-3) HashMap de <String, Mapping>, instance hashmap qui a pour valeur Mapping et clé String(utile pour mapper les classes)
        b) Mapping.java:
            a-1) simple creation des attributs(className, Method)
        b)exe.bat: 
            a-1) commande pour compiler les classes et redirection dans le sprint3
    2)web 2: 
        a)web.xml: 
            a-1) pointe sur FrontServlet



=======
# # sprint1 <!-- But: Creation d'un simple servlet et rediriger toutes les pages vers celui-ci -->
>>>>>>> 18444ef56fa98bd67651e3018809c59b6c009b44
    1)src\java:
        a)FrontServlet.java:
            a-1) processRequest+Quelques fonctions(prend les derniers urls)
            a-2) doPost, doGet : appelle la fonction processRequest
            a-3) HashMap de <String, Mapping>, instance hashmap qui a pour valeur Mapping et clé String(utile pour mapper les classes)
            a-4) Init: definit le chemin de chaque package et la montre
        b) Mapping.java:
            a-1) simple creation des attributs(className, Method) 
        c) Annotations.java:
            a-1) takeAnnotation:verifie la classe s'il contient des annotations
            a-2) getInPackage: prend chaque classe de chaque package
            a-3) getAnnotation prend les annotations exitants dans les classes  
        d) MappingUrls:
            a-1)getMethodsControllerURL: prend les classes passées venant du servlet et la met dans une
                HashMap
        e) exe.bat:
            a-1) commande pour compiler les classes et redirection dans le sprint4
    2)src\java\classeAnnoted:
        a)AppRoute:
            a-1) simple classe annoté(qui a comme attribut: l'url)
    3) web3:
        a)web.xml:
            a-1) pointe sur FrontServlet
    4) web3\src\model\emp:
        a)Emp.java:
            a-1) Classe pour essayer si l'annotation marche        

# # sprint3-1 <!-- But: Voir les package et classes grace au chemin-->
    1)src\java:
        a)FrontServlet.java:
            a-1) processRequest+Quelques fonctions(prend les derniers urls))
            a-2) doPost, doGet : appelle la fonction processRequest
            a-3) HashMap de <String, Mapping> (pour remplir les classes)
            a-4) Init: definit le chemin de chaque package et la montre
        b) Mapping.java:
            a-1) simple creation des attributs(className, Method) 
        c) Annotations.java:
            a-1) takeAnnotation:verifie la classe s'il contient des annotations
            a-2) getInPackage: prend chaque classe de chaque package
            a-3) getAnnotation prend les annotations exitants dans les classes  
        d) MappingUrls:
            a-1)getMethodsControllerURL: prend les classes passées venant du servlet et la et dans une
                HashMap
        e) exe.bat:
            a-1) commande pour compiler les classes
    2)src\java\classeAnnoted:
        a)AppRoute:
            a-1) simple classe annoté(qui a comme attribut: l'url)
    3) web3:
        a)web.xml:
            a-1) pointe sur FrontServlet
            a-2) les urlpattern et initparam
    4) web3\src\model\emp:
        a)Emp.java:
            a-1) Classe pour essayer si l'annotation marche



>>>>>>> 28dbb64be4b477f95c048ad223fea53ae38bdca0

# Framework
## ETU001970 RABARIJAONA Angoty Fitia 


web dynamique
Comprehension du fichier: 
    -1), 2)...:dossier
    -a), b)...:fichier
    -a-1), a-2)...:explication

<<<<<<< HEAD
# # sprint 6     <!-- But: passage de donnees venant d'une vue vers un controller -->
    1)Framework\src\java:
        a)FrontServlet.java:
            a-1) processRequest:_Quelques fonctions(prend les derniers urls))
                                _qui prend les classes et la redirige dans d'une vue
=======
<<<<<<< HEAD
# # sprint 5  <!-- But: Redirection d'une servlet vers une page(setdispatcher) -->
    1)Framework\src\java:
        a)FrontServlet.java:
            a-1) processRequest:_Quelques fonctions(prend les derniers urls)
                                _qui prend les classes et la redirige dans d'une vue(requestDispatcher)
=======
# # sprint 4 <!-- But: Deploiement et test du projet -->
    1)Framework\src\java:
        a)FrontServlet.java:
            a-1) processRequest+Quelques fonctions(prend les derniers urls)
>>>>>>> ad7aa51bdede769cf1223aaec95723225d976838
>>>>>>> a2dc8d65d3744f3222fd8f6eff2d52f1fe5866bc
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
            a-1) getMethodsControllerURL: prend les classes passées venant du servlet et la et dans une
                HashMap
        e) exe.bat:
<<<<<<< HEAD
            a-1) commande pour compiler les classes
        f) framework.jar: fichier jar(contenant les classes dans  le dossier etu1970)
        g) ModelView.java:classe avec comme attribut: view

=======
<<<<<<< HEAD
            a-1) commande pour compiler les classes et redirection dans le sprint6
        f) framework.jar: fichier jar(contenant les classes dans  le dossier etu1970)
        g) ModelView.java:classe avec comme attribut: view

=======
            a-1) commande pour compiler les classes et redirection dans le sprint5
        f) framework.jar: fichier jar(contenant les classes dans  le dossier etu1970)
>>>>>>> ad7aa51bdede769cf1223aaec95723225d976838
>>>>>>> a2dc8d65d3744f3222fd8f6eff2d52f1fe5866bc
    2)Framework\src\java\classeAnnoted:
        a)AppRoute:
            a-1) simple classe annoté(qui a comme attribut: l'url)
    4)TestFramework\src\model\emp:
        a)Emp.java:
            a-1) Classe pour essayer si l'annotation marche
<<<<<<< HEAD
            a-2) redirect: pour tester s'il va vraiment dans ./pages/welcome.jsp (+url: home)
            a-3) gotoView: pour tester s'il va vraiment dans ./pages/infos.jsp (+url: emp-list)
=======
<<<<<<< HEAD
            a-2) redirect: pour tester s'il va vraiment dans ./pages/welcome.jsp (+url: home)
=======
>>>>>>> ad7aa51bdede769cf1223aaec95723225d976838
>>>>>>> a2dc8d65d3744f3222fd8f6eff2d52f1fe5866bc
    5)TestFramework\WEB-INF:
        a)web.xml:
            a-1) pointe sur FrontServlet
            a-2) les urlpattern et initparam
    6)TestFramework\WEB-INF\lib:
        a)framework.jar:
            a-1) framework.jar: fichier jar(contenant les classes dans  le dossier etu1970)
<<<<<<< HEAD
    7)TestFramework\pages:
        a)welcome.jsp: 
            a-1) affichage pour test de l'url "home" - test de redirection dans une vue
        b)liste.jsp:
            a-2) affichage pour test de l'url "emp-list" - test de recuperation de donnee venant d'un controller
=======
<<<<<<< HEAD
    7)TestFramework\pages:
        a)welcome.jsp: 
            a-1) affichage pour test de l'url "home" - test de redirection dans une vue
=======
>>>>>>> ad7aa51bdede769cf1223aaec95723225d976838
>>>>>>> a2dc8d65d3744f3222fd8f6eff2d52f1fe5866bc
    a) build.bat:
        a-1):commande pour: _excecuter(exe)
                            _creation du fichier jar et sa copie dans lib
                            _compilation du fichier test(Emp)
                            _creation du fichier war
                            _deploiement dans tomcat
                            _demarrage du navigateur et du service tomcat

<<<<<<< HEAD
    b)TestFramework.war:
        a-1):fichier war du dossier de test
=======
<<<<<<< HEAD

=======
>>>>>>> ad7aa51bdede769cf1223aaec95723225d976838
>>>>>>> a2dc8d65d3744f3222fd8f6eff2d52f1fe5866bc

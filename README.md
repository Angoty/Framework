# Framework
## ETU001970 RABARIJAONA Angoty Fitia 
web dynamique
Comprehension du fichier: 
    -1), 2)...:dossier
    -a), b)...:fichier
    -a-1), a-2)...:explication

# # sprint 9    <!-- But: File upload -->
    1)Framework\src\java:
        a)FrontServlet.java:
            a-1) processRequest:_Quelques fonctions(prend les derniers urls)
                                _qui prend les classes et la redirige dans d'une vue
                                _strType(Map<String, Class<?>>): ajout d'autre type: int, boolean, float,...
                                _AutoCast des autres types
                                _setter les attributs venant du formulaire
            a-2) doPost, doGet : appelle la fonction processRequest
            a-3) Init: definit le chemin de chaque package et la montre
            a-4) setData: fonction qui remplace la valeur du type venant de la classe(cast)
            a-5) getMethod
            a-6) chekField
            a-7) nouveau parametres
            a-8) configureUpload : configuration du fichier upload

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
            a-1) commande pour compiler les classes
        f) framework.jar: fichier jar(contenant les classes dans  le dossier etu1970)
        g) ModelView.java:classe avec comme attribut: view

    2)Framework\src\java\classeAnnoted:
        a)AppRoute:
            a-1) simple classe annoté(qui a comme attribut: l'url)
    4)TestFramework\src\model\emp:
        a)Emp.java:
            a-1) Classe pour essayer si l'annotation marche
            a-2) redirect: pour tester s'il va vraiment dans ./pages/welcome.jsp (+url: route1)
            a-3) gotoView: pour tester s'il va vraiment dans ./pages/infos.jsp (+url: route2)
            a-3) gotoController: pour tester s'il va vraiment dans ./pages/formulaire.jsp (+url: route3)
        b)Citoyen.java:
            a-1) Classe pour essayer si l'annotation marche
            a-2) insert: pour tester si les informations venant de ./pages/formulaire.jsp est vraiment  prises.
            a-3) goToController: pour aller à la page fomulaire(./page/formulaire.jsp)
    5)TestFramework\WEB-INF:
        a)web.xml:
            a-1) pointe sur FrontServlet
            a-2) les urlpattern et initparam
            .do(izay misy an'io dia hitany ny css)
    6)TestFramework\WEB-INF\lib:
        a)framework.jar:
            a-1) framework.jar: fichier jar(contenant les classes dans  le dossier etu1970)
    7)TestFramework\pages:
        a)welcome.jsp: 
            a-1) affichage pour test de l'url "home" - test de redirection dans une vue
        b)liste.jsp:
            a-2) affichage pour test de l'url "emp-list" - test de recuperation de donnee venant d'un controlleur
        c)formulaire.jsp:
            a-1) affichage pour test de l'url "form" - test d'envoie de donnee venant d'une vue vers un controlleur
            a-2) lien qui va vers le detail
        d)details.jsp:
           a-1) affichage pour le test de detail
        e)infomations.jsp:
           a-1) affichage pour le test de file_upload
    a) build.bat:
        a-1):commande pour: _creation du fichier jar et sa copie dans lib
                            _compilation du fichier test(Emp)
                            _creation du fichier war
                            _deploiement dans tomcat
                            _demarrage du navigateur et du service tomcat

    b)TestFramework.war:
        a-1):fichier war du dossier de test
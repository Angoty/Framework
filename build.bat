
@REM locations
<<<<<<< HEAD
set initial="E:\L2\S4\Mr Naina\Update\Framework\sprint5"
=======
set initial="E:\L2\S4\Mr Naina\Update\Framework\sprint4"
>>>>>>> ad7aa51bdede769cf1223aaec95723225d976838
set framework=%initial%/Framework/src/java
set testframework=%initial%/TestFramework
set temp=%initial%/Temporary
set lib_location=%testframework%\WEB-INF\lib
set war_dev=%initial%\Temporary.war
set programms="C:\Program Files"
set tomcat_location=%programms%\Apache Software Foundation\Tomcat 9.0
set tomcat_web=%tomcat_location%\webapps
set war_tomcat=Temporary.war
set navigateur=%programms%/Mozilla Firefox
set tomcat_exe=%tomcat_location%/bin

@REM Compilation Framework
cd %framework%
javac -d . classeAnnoted/AppRoute.java
javac -d . Annotations.java
javac -d . Mapping.java
javac -d . MappingUrls.java
<<<<<<< HEAD
javac -d . FrontServlet.java -Xlint
=======
javac -d . FrontServlet.java
>>>>>>> ad7aa51bdede769cf1223aaec95723225d976838

@REM creation du fichier jar et copie dans lib 
jar cf framework.jar etu1970/*
copy framework.jar %lib_location%

@REM  creation du repertoire temporaire et ses contenus
cd %initial%
<<<<<<< HEAD
md Temporary\WEB-INF\classes\model Temporary\WEB-INF\lib Temporary\pages Temporary\src\model
=======
md Temporary\WEB-INF\classes\model Temporary\WEB-INF\lib Temporary\src\model
>>>>>>> ad7aa51bdede769cf1223aaec95723225d976838

@REM compilation des fichiers de test et copie dans le repertoire temporaire
cd %testframework%
javac -cp WEB-INF/lib/framework.jar -d WEB-INF/classes src/model/emp/*.java
<<<<<<< HEAD
cp -R pages/* %temp%/pages
=======
>>>>>>> ad7aa51bdede769cf1223aaec95723225d976838
cp -R WEB-INF/* %temp%/WEB-INF 

@REM creation du fichier war et deploiement sur tomcat
cd %initial%
if exist %war_dev% (
    del %war_dev%
)
cd %temp%
jar -cvf %war_dev% *

cd %tomcat_web%
C:
if exist %war_tomcat% (
    del %war_tomcat%
)
copy %war_dev%

cd %navigateur%
firefox.exe "http://localhost:8181/"

cd %tomcat_exe%
Tomcat9.exe 

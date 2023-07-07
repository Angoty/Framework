
@REM locations
set initial="E:\ITUniversity\L2\S4\Mr Naina\Update\Framework\sprint7"
set framework=%initial%\Framework\src\java
set framework=%framework%"
set testframework=%initial%/TestFramework
set temp=%initial%\Temporary
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
set initial=%initial:~0,-1%
javac -d . classeAnnoted/AppRoute.java
javac -d . Annotations.java
javac -d . Mapping.java
javac -d . MappingUrls.java
javac -d . FrontServlet.java

@REM creation du fichier jar et copie dans lib 
jar cf framework.jar etu1970/*
copy framework.jar %lib_location%

@REM  creation du repertoire temporaire et ses contenus
cd %initial%
md Temporary\WEB-INF\classes\model Temporary\WEB-INF\lib Temporary\pages Temporary\src\model

@REM compilation des fichiers de test et copie dans le repertoire temporaire
cd %testframework%
javac -cp WEB-INF/lib/framework.jar -d WEB-INF/classes src/model/emp/*.java
xcopy pages\* %temp%\pages" /E
xcopy WEB-INF\* %temp%\WEB-INF" /E


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

@REM @REM cd %navigateur%
@REM @REM firefox.exe "http://localhost:8181/"

@REM @REM cd %tomcat_exe%
@REM @REM Tomcat9.exe 

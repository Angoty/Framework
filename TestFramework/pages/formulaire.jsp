<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Veuillez entrer vos informations:</h1>
    <form action="save" method="get">
        <p><input type="text" name="nom" placeholder="Nom"></p>
        <p><input type="number" name="age" placeholder="Age"></p>
        <p>Etudiant?: <input type="checkbox" name="etudiant" value="true"></p>
        <p><input type="number" name="taille" placeholder="Votre taille"></p>
        <p><input type="number" name="survie" ></p>
        <p>Date de naissance: <input type="date" name="temps" value="2023-04-25"></p> 
        <input type="submit" value="Valider">
    </form>
</body>
</html>
<%-- 
    Document   : result
    Created on : 05.06.2022, 11:07:09
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ru">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="initial-scale=1.0, width=device-width">
        <title>Kursach</title>
        <link rel="stylesheet" type= "text/css" href="css/style.css">
    </head>
    <body>
        <div class="first_block">
            <div class="bg_gradient blur">
                <div class="container">
                    <div class="space"></div>
                    <h1 class="placeName"></h1>
                    <img class="placeImg" id="placeImg" src="" alt="" >
                    <h2 class="placeDiscription"></h2>
                    <div class="space"></div>
                    <h2 class="placeAdress"></h2>
                    
                    <a href="index.jsp" class="btn again">Пройти еще раз</a>
                </div>
                
            </div>
            
        </div>
        <script src="JSON\places.json"></script>
        <script src="scripts\resultPage.js"></script>
    </body>
</html>

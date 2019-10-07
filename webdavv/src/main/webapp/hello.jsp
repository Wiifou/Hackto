<%--
  Created by IntelliJ IDEA.
  User: Val
  Date: 30/09/2019
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%-- Ceci est un commentaire JSP --%>
<%@page contentType="text/html; charset=UTF-8"%>
<%@page errorPage="erreur.jsp"%>
<%-- Importation d'un paquetage (package) --%>
<%@page import="java.util.*"%>
<html>
<head><title>Page JSP</title>
    <link href="../resources/css/bootstrap-4.0.0/dist/css/" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="starter-template.css" rel="stylesheet"></head>
<body>
<%-- Déclaration d'une variable globale à la classe --%>
<%! int nombreVisites = 1; %>
<%-- Définition de code Java --%>
<% //Il est possible d'écrire du code Java ici
    Date date = new Date();
    // On peut incrémenter une variable globale pour compter le nombre
    // d'affichages, par exemple.
    nombreVisites++;
%>
<h1>Exemple de page JSP</h1>
<%-- Impression de variables --%>
<p>Au moment de l'exécution de ce script, nous sommes le <%= date %>.</p>
<p>Cette page a été affichée <%= nombreVisites %> fois !</p>
</body>
</html>

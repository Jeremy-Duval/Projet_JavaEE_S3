
<%@page import="Model.Joueur"%>
<HTML>
	<HEAD>
		<title>Dies Iræ</title>
		<meta charset ="utf-8">
		<link rel="stylesheet" type="text/css" href="style.css"/>
	</HEAD>
	<BODY>
		<HEADER>Dies Iræ</HEADER>
		<div id="question">
			<p>
                            Sur la route voute trouvez un mouton, il vous suis jusqu'a une salle.<br>
                            En entrant un prêtre vous appelle, le sourire au lèvre:<br>
                            "<%out.println(((Joueur) session.getAttribute("joueur")).getNom());%>, je vois que vous avez retrouvé le mouton.<br>
                            Apportez le sur l'autel, les Dieux attendent son sacrifice."

                            
                        </p>
		</div>
		<form id="reponse" name="firstForm" action="Controller" method="GET">
                    <input name="action" type="submit" value="Sacrifier le mouton"/>
                    <input name="action" type="submit" value="Tuer le pretre"/>
                    <input name="action" type="submit" value="Se sacrifier a la place"/>
		</form>
		<FOOTER>Réalisé par Jeremy Duval, Alexis Perrot, Johann Pistorius, Jean Rimlinger</FOOTER>
	</BODY>
</HTML>

<%@page import="Model.Joueur"%>
<HTML>
	<HEAD>
		<title>Dies Ir�</title>
		<meta charset ="utf-8">
		<link rel="stylesheet" type="text/css" href="style.css"/>
	</HEAD>
	<BODY>
		<HEADER>Dies Ir�</HEADER>
		<div id="question">
			<p>
                            Sur la route voute trouvez un mouton, il vous suis jusqu'a une salle.<br>
                            En entrant un pr�tre vous appelle, le sourire au l�vre:<br>
                            "<%out.println(((Joueur) session.getAttribute("joueur")).getNom());%>, je vois que vous avez retrouv� le mouton.<br>
                            Apportez le sur l'autel, les Dieux attendent son sacrifice."

                            
                        </p>
		</div>
		<form id="reponse" name="firstForm" action="Controller" method="GET">
                    <input name="action" type="submit" value="Sacrifier le mouton"/>
                    <input name="action" type="submit" value="Tuer le pretre"/>
                    <input name="action" type="submit" value="Se sacrifier a la place"/>
		</form>
		<FOOTER>R�alis� par Jeremy Duval, Alexis Perrot, Johann Pistorius, Jean Rimlinger</FOOTER>
	</BODY>
</HTML>
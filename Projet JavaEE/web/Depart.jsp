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
                            Vous passez de l'autre cot�.<br>
                            <%out.println(((Joueur) session.getAttribute("joueur")).getNom());%>, vos choix seuls determineront votre derni�re demeure.<br>
                            Restez sur vos garde...
                        </p>
		</div>
		<form id="reponse" name="firstForm" action="Controller" method="GET">
			
				<input name="action" type="submit" value="Continuer"/>
		</form>
		<FOOTER>R�alis� par Jeremy Duval, Alexis Perrot, Johann Pistorius, Jean Rimlinger</FOOTER>
	</BODY>
</HTML>

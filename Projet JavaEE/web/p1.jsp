
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
                            Dans le noir, vous ouvrez les yeux.<br>
                            Petit à petit vos yeux s'habituent à l'obscurité.<br>
                            Vous distinguez finalement deux issues.<br>
                            
                            
                        </p>
		</div>
		<form id="reponse" name="firstForm" action="Controller" method="GET">
                    <input name="action" type="submit" value="Droite"/>
                    <input name="action" type="submit" value="Gauche"/>
		</form>
		<FOOTER>Réalisé par Jeremy Duval, Alexis Perrot, Johann Pistorius, Jean Rimlinger</FOOTER>
	</BODY>
</HTML>
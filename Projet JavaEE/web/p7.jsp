
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
                            Vous tentez tant bien que mal de suivre la lumi�re.<br>
                            Quand soudain vous etes aspir� vers le fond.<br>
                            Perdu, vous sentez une main vous attraper et en un eclair celle ci vous sort de l'eau.<br>
                            Vous tombez � votre plus grand etonnement face � une cabanne sous marine.<br>
                            Un ermite, seul habitant de se lieu, vous dis: "Vous etes perdu, <%out.println(((Joueur) session.getAttribute("joueur")).getNom());%>,<br>
                            les courants sont trop fort pour remonter. Mais tenez, choisissez, ca pourra peut etre vous soulager."<br>
                        
                        </p>
		</div>
		<form id="reponse" name="firstForm" action="Controller" method="GET">
                    <input name="action" type="submit" value="Boire le vin"/>
                    <input name="action" type="submit" value="Manger la viande"/>
                    <input name="action" type="submit" value="Aller dormir"/>
		</form>
		<FOOTER>R�alis� par Jeremy Duval, Alexis Perrot, Johann Pistorius, Jean Rimlinger</FOOTER>
	</BODY>
</HTML>
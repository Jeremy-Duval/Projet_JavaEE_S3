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
                            Vous �tes mort
                        </p>
                <% 
                int pointsFinaux = (((Joueur) session.getAttribute("joueur")).getPoints());
                out.print("Valeur de l'ame : " + pointsFinaux );%>
                <br>
                <% if (pointsFinaux>0)
                {
                    out.println("Les dieux ont jug� votre �me assez grande pour entrer au paradis.");%>
                    <br>
                    <% out.println("Bravo "+ (((Joueur) session.getAttribute("joueur")).getNom()) + ".");
                }
                if (pointsFinaux<0)
                {
                    out.println("D�mon ! Vous ne respectez ni les morts ni les vivants.");%>
                    <br>
                    <% out.println((((Joueur) session.getAttribute("joueur")).getNom()) + " votre place est parmis les votres, en Enfer !");
                }
                if (pointsFinaux==0)
                {
                    out.println("Votre esprit est neutre, votre coeur est pur.");%>
                    <br>
                    <% out.println("Bravo "+ (((Joueur) session.getAttribute("joueur")).getNom()) + ", vous retournez montrer l'exemple parmis les vivants");
                }
                %>
		</div>
                <form id="reponse" name="firstForm" action="Controller" method="GET">
                    <input name="action" type="submit" value="Recommencer"/>
		</form>
		<FOOTER>R�alis� par Jeremy Duval, Alexis Perrot, Johann Pistorius, Jean Rimlinger</FOOTER>
	</BODY>
</HTML>

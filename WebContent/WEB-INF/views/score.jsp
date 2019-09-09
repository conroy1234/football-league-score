<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${welcome}</title>
</head>

<body>
	<h1>${message}</h1>
</body>

<c:if test="${not empty entries}">
	<table border="1">
		<tr>
			<th>PLAIED</th>
			<th>WON</th>
			<th>DRAW</th>
			<th>LOST</th>
			<th>GOALS FOR</th>
			<th>GOALS AGAINST</th>
			<th>GOALS DIFFERENCES</th>
			<th>POINTS</th>
		</tr>

		<c:forEach items="${entries}" var="entry">

			<tr>
				<td>${entry.teamName}</td>
				<td>${entry.played}</td>
				<td>${entry.won}</td>
				<td>${entry.draw}</td>
				<td>${entry.lost}</td>
				<td>${entry.goalsFor}</td>
				<td>${entry.goalsAgainst}</td>
				<td>${entry.goalDifference}</td>
				<td>${entry.points}</td>
			</tr>


		</c:forEach>
	</table>
</c:if>

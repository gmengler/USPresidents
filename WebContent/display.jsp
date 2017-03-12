<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>

<link href="StyleSheet.css" rel="stylesheet" type="text/css">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>U.S. Presidents</title>
</head>

<body>
	<H1 id="header">UNITED STATES PRESIDENTS</H1>
	<form action="Presidents.do" method="POST">
			<label>Search by Term Number: <input type="text"
			name="termNumber">    <input type="submit" value="submit" name="getByTermNumber">
		</label> <br>
	<h2>NAVIGATION</h2>
		<button class="picture" type="submit" name="previous" > <img src = "http://www.iconninja.com/files/242/667/718/left-black-arrow-icon.png" ></button>
		<button class="picture" type="submit" name="next" > <img src="http://www.iconninja.com/files/925/250/422/right-arrow-icon.png"></button>
	
	<div>
		<table>
			<tr>
				<td>
				<ul>
					<li>Name: ${currentPresident.name}</li>
					<li>TermNumber: ${currentPresident.termNumber}</li>
					<li>Party: ${currentPresident.party}</li>
					<li>TermLength: From: ${currentPresident.termBeginDate} To:
						${currentPresident.termEndDate}</li>
					<li>Interesting Fact: ${currentPresident.fact}</li>
				</ul>
				</td>
				<td><img class ="resize" src="${currentPresident.picURL}" /></td>
			</tr>
		
	
</table>
	</div>

		
	
		

	</form>
	
	

	
</body>
</html>
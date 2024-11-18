<%!
	public int square(int x)
	{
		return x * x;
	}
	public int sum(int x,int y)
	{
		return x + y;
	}
%>





<html>
	<body>
		<h1>
			<%=new java.util.Date()%>
			
			<br>
			<%= square(15)%>
			<br>
			<%= sum(12,33)%>
			<br>
			<%
				out.println(new java.util.Date());
			%>
			
		</h1>
	</body>
</html>

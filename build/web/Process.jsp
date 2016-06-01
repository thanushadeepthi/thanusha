
<%@page import="bean.Register"%>  
 
<jsp:useBean id="obj" class="bean.user"/>  
  
<jsp:setProperty property="*" name="obj"/>  

<input type="submit" value="register"/>  
<% 
    
int status=Register.register(obj);  
if(status>0)  
out.print("You are successfully registered");  
  
%>
<jsp:forward page="details.jsp"/>
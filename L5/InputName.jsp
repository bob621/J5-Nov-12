<!-- Begin: InputName.jsp -->
<%@ taglib uri="/WEB-INF/tlds/struts-html.tld" prefix="html" %>

<html:html>
<BODY>
  <FONT COLOR=red> <html:errors/>
     <html:messages id ="msg"  message="true" property="firstName">
       <li> <bean write name="msg" property="firstName"/></li
      </html:messages>
  </FONT>
    <html:form action="/displayname">
        <TABLE>
            <TR>
                <TD COLSPAN=2>Please enter the customer's information:</TD>
            </TR>
            <TR>
                <TD>First Name:</TD>
                <TD><html:text property="firstName" size="16"/></TD>
            </TR>
            <TR>
                <TD>Last Name:</TD>
                <TD><html:text property="lastName" size="16"/></TD>
            </TR>
            <TR>
                <TD ALIGN="CENTER" COLSPAN=2><html:submit/></TD>
            </TR>
        </TABLE>
    </html:form>
</BODY>
</html:html>
<!-- End: InputName.jsp --> 

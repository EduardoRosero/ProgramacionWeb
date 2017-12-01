<%-- 
    Document   : jspSuma
    Created on : 11/10/2017, 9:35:20
    Author     : eduardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script language="JavaScript">
            function Calcular(Signo) {
                switch (Signo)
                {
                    case '+':
                        document.form1.resultado.value = eval(document.form1.Numero1.value) + eval(document.form1.Numero2.value);
                        break
                    case '-':
                        document.form1.resultado.value = eval(document.form1.Numero1.value) - eval(document.form1.Numero2.value);
                        break
                    case '*':
                        document.form1.resultado.value = eval(document.form1.Numero1.value) * eval(document.form1.Numero2.value);
                        break
                    case '/':
                        document.form1.resultado.value = eval(document.form1.Numero1.value) / eval(document.form1.Numero2.value);
                        break
                    default:
                         document.form1.resultado.value = "Error"   
                }
            }
        </script>
    </head>
    <body>
        <form name="form1">
            <p>Numero 1: <input type="text" name="Numero1" size="5"></p>
            <p><select name="Signo">
                    <option value="+">+</option>
                    <option value="-">-</option>
                    <option value="*">*</option>
                    <option value="/">/</option>
               </select></p>
             <p>Numero 2: <input type="text" name="Numero2" size="5"></p>
             <input type="button" value="Calcular" name="btnIngresar" onclick="Calcular(Signo.value)"/>
             <p>Resultado: <input type="text" name="resultado" size="5"></p>
        </form>
    </body>
</html>

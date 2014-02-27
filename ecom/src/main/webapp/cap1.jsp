 <%@ page import="net.tanesha.recaptcha.ReCaptcha" %>
    <%@ page import="net.tanesha.recaptcha.ReCaptchaFactory" %>

    <html>
      <body>
        <form action="" method="post">
        <%
          ReCaptcha c = ReCaptchaFactory.newReCaptcha("6Lea4O0SAAAAAIb1cxv-X9ivBK-ylBIgT4Bt8iif", "6Lea4O0SAAAAAKU3dHR1udJFtRgt805--cDe_gtc", false);
          out.print(c.createRecaptchaHtml(null, null));
        %>
        <input type="submit" value="submit" />
        </form>
      </body>
    </html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administrador</title>
<link href="CSS/hoja.css" rel="stylesheet" type="text/css">
</head>
<body>
</table>
<table width="1080" height="881" border="1">
  <tr>
    <td colspan="3"><img src="img/bannerMat.jpg" width="1100" height="251" longdesc="img/bannerMat.jpg"></td>
  </tr>
  <tr>
    <td width="293" align="center" bgcolor="#FF0000" class="fondosModulos">¿Quienes Somos?</td>
    <td width="567" align="center" bgcolor="#FF0000" class="fondosModulos">Extension universitaria</td>
    <td width="198" align="center" bgcolor="#FF0000" class="fondosModulos">Proyeccion univesitaria</td>
  </tr>
  <tr>
    <td height="231" valign="top" bgcolor="#FFFF99"><div><center>CRONOGRAMA DE CURSOS</center></div></td>
    <td rowspan="2" bgcolor="#FFFF99">
    <form action="RegistraCliePub" method="post">Registro de Alumno:<div></div>
    
        <p>
          <label for="txtApePat">Apellido Paterno	:
          </label>
          <input name="txtApePat" type="text" id="txtApePat" value="" size="51">
        </p>
        <p>
          <label for="txtApeMat">Apellido Materno:</label>
          <input type="text" name="txtApeMat" id="txtApeMat" size="51">
        </p>
        <p>
          <label for="txtNombre">Nombres: </label>
          <input type="text" name="txtNombre" id="txtNombre" size="50">
        </p>
        <p>
                    
          <label for="cboFechaNac">Fecha Nacimiento</label>
          <select name="cboDia" size="1" id="cboDia">
            <option selected>1</option>
            <option>2</option>
            <option>3</option>
            <option>4</option>
            <option>5</option>
            <option>6</option>
            <option>7</option>
            <option>8</option>
            <option>9</option>
            <option>10</option>
            <option>11</option>
            <option>12</option>
            <option>13</option>
            <option>14</option>
            <option>15</option>
            <option>16</option>
            <option>17</option>
            <option>18</option>
            <option>19</option>
            <option>20</option>
            <option>21</option>
            <option>22</option>
            <option>23</option>
            <option>24</option>
            <option>25</option>
            <option>26</option>
            <option>27</option>
            <option>28</option>
            <option>29</option>
            <option>30</option>
            <option>31</option>
          </select>
          <select name="cboMez" size="1" id="cboMez">
            <option selected>Enero</option>
            <option>Febrero</option>
            <option>Marzo</option>
            <option>Abril</option>
            <option>Marzo</option>
            <option>Mayo</option>
            <option>Junio</option>
            <option>julio</option>
            <option>Agosto</option>
            <option>Setiembre</option>
            <option>Octubre</option>
            <option>Novimbre</option>
            <option>Diciembre</option>
          </select>
           <select name="cboano" size="1" id="cboano">
            <option selected>1995</option>
            <option>1996</option>
            <option>1997</option>
            
          </select>
        </p>
        <p>DNI: 
          <label for="txtDni"></label>
          <input name="txtDni" type="text" id="txtDni" size="20" maxlength="8">
        </p>
        <p>Telefono/Celular: 
          <label for="txtTel"></label>
          <input type="text" name="txtTel" id="txtTel">
          <label for="txtCel"></label>
          <input type="text" name="txtCel" id="txtCel">
          <label for="cboTipoCel"></label>
          <select name="cboTipoCel" id="cboTipoCel">
            <option>Movistar</option>
            <option>Claro</option>
            <option>Nextel</option>
          </select>
        </p>
        <p>E-Mail 
          <label for="txtEmail"></label>
          <input name="txtEmail" type="text" id="txtEmail" value="">
        </p>
        <p>Direccion: </p>
        <p>&nbsp;</p>
        <p>Curso: 
          <label for="cboCurso"></label>
          <select name="cboCurso" id="cboCurso">
            <option>HTML5</option>
            <option>PHP</option>
            <option>JQUERY</option>
            <option>JAVA</option>
          </select>
        </p>
        <p>Horario: </p>
        <p>Duracion:</p>
        <p>&nbsp;</p>
        <p>
          <input type="reset" name="btnCancelar" id="btnCancelar" value="Restablecer">
           <input type="submit" name="btnEnviar" id="btnEnviar" value="Enviar">
        </p>
    </form> 
    
    </td>
    <td rowspan="2" bgcolor="#FFFF99"></td>
  </tr>
  <tr>
  <td height="127" valign="top" bgcolor="#FFFF99"><div><center>AGENDA EPU-FIA</center></div> </td>
</table>
</body>
</html>

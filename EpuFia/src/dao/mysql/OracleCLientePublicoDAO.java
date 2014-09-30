package dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import util.DataBaseConnection;
import bean.ClientePublicoBean;
import dao.Entidad;

public class OracleCLientePublicoDAO 
implements Entidad<ClientePublicoBean>{
	
	public ClientePublicoBean insert(ClientePublicoBean cliente) {
		// TODO Auto-generated method stub
		Connection con=null;
		try {
			con=DataBaseConnection.opemConnection();
			String sql="INSERT INTO ClientePublico(nombres,fechaIng,apePat,apeMat," +
					"password,fechaNac,email) VALUES(?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
			ps.setInt(1, cliente.getCodCliPu());
			ps.setString(2, cliente.getNombre());
			ps.setObject(3, cliente.getApePat());
			ps.setString(4, cliente.getApeMat());
			ps.setString(5, cliente.getFechaNac());
			ps.setString(6, cliente.getDireccion());
			ps.setString(7, cliente.getFechaIng());
			ps.setString(8, cliente.getEmail());
			ps.executeUpdate();
			ResultSet rs=ps.getGeneratedKeys();
			if(rs.next()){
				int id=rs.getInt(1);
				cliente.setCodCliPu(id);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DataBaseConnection.closeConnection(con);
		}
		return cliente;
	}

	@Override
	public int update(ClientePublicoBean t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(ClientePublicoBean t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ClientePublicoBean> findAll(Object... objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClientePublicoBean> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientePublicoBean findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientePublicoBean findById(ClientePublicoBean t) {
		// TODO Auto-generated method stub
		return null;
	}

}
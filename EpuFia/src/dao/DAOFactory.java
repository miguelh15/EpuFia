package dao;

import bean.ClientePublicoBean;

public abstract class DAOFactory {
	
	public static final int MYSQL=1;
	public static final int ORACLE=2;
	
	public abstract Entidad<ClientePublicoBean> getClientePublicoDAO();
	
	public static DAOFactory getFactoryConcrete(int opcion){
		switch (opcion) {
		case MYSQL:
			return new MySQLFactory();
		case ORACLE:
			return new OracleFactory();
		default:
			break;
		}
		return null;
	}

}

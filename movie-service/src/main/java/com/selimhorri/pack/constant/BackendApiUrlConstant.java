package com.selimhorri.pack.constant;

public abstract class BackendApiUrlConstant {
	
	// private static final String DAO_SERVICE_DEV_HOST = "localhost";
	// private static final String DAO_SERVICE_DEV_PORT = "8081";
	private static final String DAO_SERVICE_DEV_HOST = "dao-service";
	
	// private static final String DAO_SERVICE_PROD_HOST = "localhost";
	// private static final String DAO_SERVICE_PROD_PORT = "8091";
	private static final String DAO_SERVICE_PROD_HOST = "dao-service";
	
	private BackendApiUrlConstant() {
		
	}
	
	public final class DaoServiceDevApiUrlConstant {
		private DaoServiceDevApiUrlConstant() {}
		private static final String BASE_API_URL = "http://" + DAO_SERVICE_DEV_HOST + "/app/dao-service";
		public static final String API_URL = BASE_API_URL;
	}
	
	public final class DaoServiceProdApiUrlConstant {
		private DaoServiceProdApiUrlConstant() {}
		private static final String BASE_API_URL = "http://" + DAO_SERVICE_PROD_HOST + "/app/dao-service";
		public static final String API_URL = BASE_API_URL;
	}
	
	
	
}







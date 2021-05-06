package tacu.mihaela.g1088.proxy;

public class ModulLogin implements InterfataLogin{
	String ipServer;

	public ModulLogin(String ipServer) {
		this.ipServer = ipServer;
	}

	@Override
	public boolean login(String user, String pass) {
		if (user.equals("admin1") && pass.equals("rootasd123"))
			return true;
		else
			return false;
	}

	@Override
	public boolean verificaStatusServer() {
		return false;
	}
}

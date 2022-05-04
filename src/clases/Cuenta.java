package clases;
import java.util.ArrayList;

public class Cuenta {
	private String email="";
	private String contraseña="";
	private TipoPlan planCuenta=TipoPlan.ESTANDAR;
	private ArrayList<Usuario> usuarios= new ArrayList<>();
}

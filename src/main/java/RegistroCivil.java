
public class RegistroCivil {
	public boolean datosPersonales(int id,char sexo, boolean casado, int edad){
		return true;
	}
	public int datos(int id){
		if(id==1234){
				Aseguradora a = new Aseguradora(1234,'m',false, 20);
				return a.getPrima();
		}
		if(id==2468){
			Aseguradora a= new Aseguradora(2468,'f',true, 20);
			return a.getPrima();
		}
		if(id==5678){
			Aseguradora a= new Aseguradora(5678,'f',false, 40);
			return a.getPrima();
		}
		if(id==1357){
			Aseguradora a= new Aseguradora(1357,'m',true, 20);
			return a.getPrima();
		}
		return -1;
	}
}

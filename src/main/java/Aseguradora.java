/*
 * This Java source file was auto generated by running 'gradle buildInit --type java-library'
 * by 'Administrador' at '3/01/17 10:04' with Gradle 2.6
 *
 * @author Administrador, @date 3/01/17 10:04
 */
public class Aseguradora{
	private int edad=0;
	private char sexo;
	private boolean casado;
	
	public Aseguradora(int id, char sexo, boolean estadoC,int edad) {
		super();
		this.edad = edad;
		this.sexo = sexo;
		this.casado = estadoC;
	}

	public int getPrima(){
		int prima = 500;
		
		if (edad<18 || edad>80){
			return -1;
		}else{
			if ((sexo=='m' || sexo=='f')){ 
				if (casado==true || casado==false){
					if (sexo=='m' && casado==false && edad < 25){
						prima+=1500;
					}
					if(sexo=='f' || casado==true)	{
						prima-=200;
					}
					if(edad >= 45 && edad < 65){
						prima-=100;
					}
				}else{
					return -1;
				}
			}else{
				return -1;
			}
		}		
		return prima;
	}
}
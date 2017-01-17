import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;


public class AserguradoraTest {
	@Mock
	RegistroCivil datos;
	@Rule 
	public MockitoRule mockitoRule = MockitoJUnit.rule();
	
	 @Test
	 public void test()  {
		 ArrayList<Aseguradora> as= new ArrayList<>();
		    Aseguradora prima1= new Aseguradora(1234,'m',false, 20);
		    Aseguradora prima2= new Aseguradora(2468,'f',true, 20);
		    Aseguradora prima3= new Aseguradora(5678,'f',false, 40);
		    Aseguradora prima4= new Aseguradora(1357,'m',true, 20);
			as.add(prima1);
		    as.add(prima2);
		    as.add(prima3);
		    as.add(prima4);
		    RegistroCivil rc=Mockito.mock(RegistroCivil.class);
			
		    when(rc.datos(1234)).thenReturn(2000);
		    when(rc.datos(2468)).thenReturn(300);
		    when(rc.datos(5678)).thenReturn(300);
		    when(rc.datos(157)).thenReturn(300);
			
		}
 }
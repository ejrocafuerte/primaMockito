import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;


public class RegistroCivilTest3 {
	@Rule 
	public MockitoRule mockitoRule = MockitoJUnit.rule();
	
	 @Test
	 public void test()  {
		 RegistroCivil r = spy(new RegistroCivil());
		 r.datosPersonales(5678,'f',false, 40);
         assertTrue(r.datosPersonales(5678,'f',false, 40));
 }
}
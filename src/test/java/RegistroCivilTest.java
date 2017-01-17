import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;


public class RegistroCivilTest {
	@Rule 
	public MockitoRule mockitoRule = MockitoJUnit.rule();
	
	 @Test
	 public void test()  {
		 RegistroCivil r = spy(new RegistroCivil());
		 
		 assertTrue(r.datosPersonales(1234,'m',false, 20));
 }
}
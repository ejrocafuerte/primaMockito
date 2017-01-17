import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class RegistroCivilTest4 {
	@Rule 
	public MockitoRule mockitoRule = MockitoJUnit.rule();
	 @Test
	 public void test()  {
		 RegistroCivil r = spy(new RegistroCivil());
		 r.datosPersonales(1357,'m',true, 20);
         assertTrue(r.datosPersonales(1357,'m',true, 20));
 }
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class GoodLordTest {


	@Test
	public void testEmptyString() {
	
	//Assert
	assertEquals("", StringUtils.toUppercase(""));
    }

	@Test
	public void testBasicConversion() {

	//Assert
	assertEquals("THE LORD IS GOOD.", StringUtils.toUppercase("The lord is good."));
    }
}
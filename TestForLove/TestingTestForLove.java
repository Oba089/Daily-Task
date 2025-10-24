import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestForLove {


	@Test
	public void testThatTheFlowersHasAnEvenNumber() {
	
	// Arrange
	Love love = new Love();

	// Act
	int result = input.totalNumberOfFlowersEven();

	//Assert
	 assertFalse(TestForLove.isLove(6, 10), "Should not be in love: both even"));
    }

	@Test
	public void testThatTheFlowersHasAOddNumber() {

	// Arrange
	Love love = new Love();

	// Act
	int result = input.totalNumberOfFlowersOdd();

	//Assert
	 assertEqualsFalse(TestForLove.isLove(3, 5), "Should not be in love: both odd"));
    }
}
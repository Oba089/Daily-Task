public class TestForLove {

	public static boolean isLove(int flower1Petals, int flower2Petals) {

	boolean isFlowerEven = flower1Petals % 2 == 0;
	boolean isFlower2Even = flower2Petals % 2 == 0;

		return isFlower1Even != isFlower2Even;

    }
}
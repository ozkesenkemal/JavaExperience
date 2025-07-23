
public class MainException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] numbers = new int[] { 1, 2, 3 };
			numbers[5] = 3;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException " + e.getMessage());
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException " + e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("works all the time");
		}
	}
}

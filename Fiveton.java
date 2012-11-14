
public class Fiveton {

  private static int INSTANCE_CNT = 0;
	private static int NO_INSTANCE = 5;
	public static Fiveton INSTANCE[] = null;
	public static Fiveton SINGLE_INSTANCE = null;

	private Fiveton() {

	}

	public static Fiveton[] getInstance() {

		if (INSTANCE == null) {
			synchronized (Fiveton.class) {
				for (int i = 0; i < NO_INSTANCE; i++) {
					INSTANCE[i] = new Fiveton();
				}
			}
		}

		return INSTANCE;
	}

	/**
	 * synchronized version
	 * 
	 * @return
	 */
	public static Fiveton getSingleInstance() {

		if (SINGLE_INSTANCE == null) {
			synchronized (Fiveton.class) {
				if (INSTANCE_CNT < 5)
					SINGLE_INSTANCE = new Fiveton();
				INSTANCE_CNT++;
			}
		}

		return SINGLE_INSTANCE;
	}

	/**
	 * Double checking of null
	 * http://www.ibm.com/developerworks/java/library/j-dcl/index.html
	 * @return
	 */
	public static Fiveton getSingleInstanceDoubleCheck() {

		if (SINGLE_INSTANCE == null) {
			synchronized (Fiveton.class) {
				if (SINGLE_INSTANCE == null) {
					if (INSTANCE_CNT < 5)
						SINGLE_INSTANCE = new Fiveton();
					INSTANCE_CNT++;
				}
			}
		}

		return SINGLE_INSTANCE;
	}

}

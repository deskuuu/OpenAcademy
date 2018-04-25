package Library;

import java.security.InvalidParameterException;

public class HelperCheck {
	public static void checkForNull(Object obj) {
		if (obj == null) {
			throw new InvalidParameterException("Invalid parameter!");
		}
	}
}

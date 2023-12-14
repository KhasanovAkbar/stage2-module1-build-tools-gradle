public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        // Implementation using Apache Commons Lang
        return org.apache.commons.lang3.StringUtils.isNumeric(str) && Integer.parseInt(str) > 0;
    }
}

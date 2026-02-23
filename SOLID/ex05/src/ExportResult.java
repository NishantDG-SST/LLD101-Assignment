public class ExportResult {

    private final boolean success;
    private final int bytes;
    private final String errorMessage;

    private ExportResult(boolean success, int bytes, String errorMessage) {
        this.success = success;
        this.bytes = bytes;
        this.errorMessage = errorMessage;
    }

    public static ExportResult success(int bytes) {
        return new ExportResult(true, bytes, null);
    }

    public static ExportResult error(String message) {
        return new ExportResult(false, 0, message);
    }

    @Override
    public String toString() {
        if (success) {
            return "OK bytes=" + bytes;
        }
        return "ERROR: " + errorMessage;
    }
}
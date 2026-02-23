public abstract class Exporter {

    public final ExportResult export(ExportRequest request) {

        if (request == null) {
            return ExportResult.error("Request cannot be null");
        }

        if (request.getContent() == null) {
            return ExportResult.error("Content cannot be null");
        }

        try {
            return doExport(request);
        } catch (Exception e) {
            return ExportResult.error(e.getMessage());
        }
    }

    abstract ExportResult doExport(ExportRequest request);
}
public class PdfExporter extends Exporter {

    @Override
    protected ExportResult doExport(ExportRequest request) {

        String content = request.getContent();

        if (content.length() > 20) {
            return ExportResult.error("PDF cannot handle content > 20 chars");
        }

        int bytes = content.getBytes().length;
        return ExportResult.success(bytes);
    }
}
public class CsvExporter extends Exporter {

    @Override
    protected ExportResult doExport(ExportRequest request) {

        String content = request.getContent();
        String escaped = content.replace("\"", "\"\"");
        
        if (escaped.contains(",") || escaped.contains("\n")) {
            escaped = "\"" + escaped + "\"";
        }

        int bytes = escaped.getBytes().length;
        return ExportResult.success(bytes);
    }
}
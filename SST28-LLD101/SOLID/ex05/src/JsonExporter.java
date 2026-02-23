public class JsonExporter extends Exporter {

    @Override
    protected ExportResult doExport(ExportRequest request) {

        String content = request.getContent();
        String escaped = content.replace("\"", "\\\"");
        String json = "{ \"data\": \"" + escaped + "\" }";

        int bytes = json.getBytes().length;
        return ExportResult.success(bytes);
    }
}
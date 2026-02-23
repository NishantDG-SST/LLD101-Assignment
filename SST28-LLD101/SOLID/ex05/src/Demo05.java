public class Demo05 {

    public static void main(String[] args) {


        ExportRequest request = new ExportRequest("Name,Score\nAyaan,82\nRiya,91\n");

        Exporter pdf = new PdfExporter();
        Exporter csv = new CsvExporter();
        Exporter json = new JsonExporter();

        System.out.println("=== Export Demo ===");
        System.out.println("PDF: " + pdf.export(request));
        System.out.println("CSV: " + csv.export(request));
        System.out.println("JSON: " + json.export(request));
    }
}
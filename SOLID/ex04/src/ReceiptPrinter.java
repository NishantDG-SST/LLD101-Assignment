public class ReceiptPrinter {

    public void print(BookingRequest request, FeeBreakdown breakdown) {

        System.out.println("=== Hostel Fee Calculator ===");
        System.out.println("Room: " + request.getRoomType() + 
                " | AddOns: " + request.getAddOns());
        System.out.println("Monthly: " + breakdown.getMonthly());
        System.out.println("Deposit: " + breakdown.getDeposit());
        System.out.println("TOTAL DUE NOW: " + breakdown.totalDueNow());
    }
}
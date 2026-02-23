import java.util.List;

public class HostelFeeCalculator {

    public FeeBreakdown calculate(List<PricingComponent> components) {

        Money monthly = new Money(0);
        Money deposit = new Money(0);

        for (PricingComponent component : components) {
            monthly = monthly.add(component.monthly());
            deposit = deposit.add(component.deposit());
        }

        return new FeeBreakdown(monthly, deposit);
    }
}
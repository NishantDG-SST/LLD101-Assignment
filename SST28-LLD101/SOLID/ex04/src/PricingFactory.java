import java.util.ArrayList;
import java.util.List;

public class PricingFactory {

    public static List<PricingComponent> createComponents(BookingRequest request) {
        List<PricingComponent> components = new ArrayList<>();

        switch (request.getRoomType()) {
            case SINGLE -> components.add(new SingleRoom());
            case DOUBLE -> components.add(new DoubleRoom());
            case DELUXE -> components.add(new DeluxeRoom());
        }

        for (AddOn addOn : request.getAddOns()) {
            switch (addOn) {
                case LAUNDRY -> components.add(new LaundryAddOn());
                case MESS -> components.add(new MessAddOn());
            }
        }

        return components;
    }
}
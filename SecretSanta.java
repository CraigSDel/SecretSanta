import java.util.ArrayList;
import java.util.List;

public class SecretSanta{
    public static void main(String[] args) {
        List<String> buyer = List.of("Angela", "Kevin", "Justin", "Craig", "Gregory", "Nunny", "Drummond", "Andrea");
        List<String> receiver = new ArrayList<>();

        while (buyer.size() != receiver.size()) {
            double x = (Math.random() * ((buyer.size() - 0) + 1)) + 0;
            final int receiverIndex = Double.valueOf(x).intValue();
            if (receiverIndex < buyer.size()) {
                final String receiverName = buyer.get(receiverIndex);
                if ((buyer.indexOf(receiverName) != receiver.size()) && !receiver.contains(receiverName)) {
                    receiver.add(receiverName);
                }
            }
        }

        System.out.println("Merry Chirstmas - Lets play secret Santa");
        for (int i = 0; i < buyer.size(); i++) {
            System.out.printf("Buyer: %-20s Receiver: %s%n", buyer.get(i), receiver.get(i));
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class SecretSanta{
    public static void main(String[] args) {
        List<String> gifter = List.of("Angela", "Kevin", "Justin", "Craig", "Gregory", "Nunny", "Drummond", "Andrea");
        List<String> receiver = new ArrayList<>();

        while (gifter.size() != receiver.size()) {
            double x = (Math.random() * ((gifter.size()) + 1));
            final int receiverIndex = Double.valueOf(x).intValue();
            if (receiverIndex < gifter.size()) {
                final String receiverName = gifter.get(receiverIndex);
                if ((gifter.indexOf(receiverName) != receiver.size()) && !receiver.contains(receiverName)) {
                    receiver.add(receiverName);
                }
            }
        }

        System.out.println("Merry Chirstmas - Lets play secret Santa");
        for (int i = 0; i < gifter.size(); i++) {
            System.out.printf("Gifter: %-20s Receiver: %s%n", gifter.get(i), receiver.get(i));
        }
    }
}

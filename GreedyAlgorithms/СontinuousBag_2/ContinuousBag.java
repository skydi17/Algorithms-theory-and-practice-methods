import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ContinuousBag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        List<Subject> subjects = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            Subject subject = new Subject(scanner.nextInt(), scanner.nextInt());
            subjects.add(subject);
        }
        subjects.sort((Subject s1, Subject s2) ->  s1.getVolume()/s1.getCost() - s2.getVolume()/s2.getCost());

        float maxCost = 0;
        Iterator iterator = subjects.listIterator();
        while (w > 0 && iterator.hasNext()) {
            Subject subject = (Subject)iterator.next();
            if (w >= subject.getVolume()) {
                maxCost = maxCost + subject.getCost();
                w = w - subject.getVolume();
            } else {
                maxCost = maxCost + w/subject.getVolume()*subject.getCost();
                w = w - w/subject.getVolume();
            }
        }
        System.out.printf("%8.3f", maxCost);
    }
}

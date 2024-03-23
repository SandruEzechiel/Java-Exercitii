import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Interval {
    private double lowerLimit;
    private double upperLimit;
    private int totalNumbersTested;
    private int numbersContained;

    public Interval(double lowerLimit, double upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        this.totalNumbersTested = 0;
        this.numbersContained = 0;
    }

    public void testNumber(Double number) {
        totalNumbersTested++;
        if (number >= lowerLimit && number <= upperLimit) {
            numbersContained++;
        }
    }

    public void writeStatistics(PrintWriter writer) {
        double percentage = (double) numbersContained / totalNumbersTested * 100;
        writer.println("Interval [" + lowerLimit + ", " + upperLimit + "]: " + percentage + "%");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            List<Interval> intervals = readIntervals("intervale.dat");
            List<Double> numbers = readNumbers("numere.dat");
            writeStatistics("statistica.dat", intervals, numbers);
            System.out.println("Statistica a fost scrisa in fisierul 'statistica.dat'.");
        } catch (IOException e) {
            System.err.println("Eroare la citirea sau scrierea fisierelor: " + e.getMessage());
        }
    }

    public static List<Interval> readIntervals(String fileName) throws IOException {
        List<Interval> intervals = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                double lowerLimit = Double.parseDouble(parts[0].substring(1));
                double upperLimit = Double.parseDouble(parts[1].substring(0, parts[1].length() - 1));
                Interval interval = new Interval(lowerLimit, upperLimit);
                intervals.add(interval);
            }
        }
        return intervals;
    }

    public static List<Double> readNumbers(String fileName) throws IOException {
        List<Double> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                for (String part : parts) {
                    numbers.add(Double.parseDouble(part));
                }
            }
        }
        return numbers;
    }

    public static void writeStatistics(String fileName, List<Interval> intervals, List<Double> numbers) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Double number : numbers) {
                for (Interval interval : intervals) {
                    interval.testNumber(number);
                }
            }
            for (Interval interval : intervals) {
                interval.writeStatistics(writer);
            }
        }
    }
}


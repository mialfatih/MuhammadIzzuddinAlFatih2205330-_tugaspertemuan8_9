import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan sisi pertama dari segitiga: ");
            double side1 = input.nextDouble();

            System.out.print("Masukkan sisi kedua dari segitiga: ");
            double side2 = input.nextDouble();

            System.out.print("Masukkan sisi ketiga dari segitiga: ");
            double side3 = input.nextDouble();
            input.nextLine(); // Consume newline

            System.out.print("Masukkan warna: ");
            String color = input.nextLine();

            System.out.print("Apakah segitiga terisi (true/false): ");
            boolean filled = input.nextBoolean();

            Segitiga segitiga = new Segitiga(side1, side2, side3);
            segitiga.setColor(color);
            segitiga.setFilled(filled);

            System.out.println("\nInformasi Segitiga:");
            System.out.println("Luas segitiga: " + segitiga.getArea());
            System.out.println("Keliling segitiga: " + segitiga.getPerimeter());
            System.out.println("Warna segitiga: " + segitiga.getColor());
            System.out.println("Apakah segitiga terisi: " + segitiga.isFilled());
            System.out.println(segitiga);
        }
    }
}

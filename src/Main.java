import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ExceptionCatch {
        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt(); // olkolor
//        Country[] values = Country.values();
//        switch (number) {
//            case 1 -> System.out.println(Arrays.toString(Country.getAllCountry(values)));
//            case 2 -> System.out.println(Country.findById(5, values));
//            case 3 -> System.out.println(Country.findByName("china", values));
//        }
        writerMethod();
        readerMethod();

        Customer[] customers = {new Customer("Akmat", "Mamatov", Country.KYRGYZSTAN,
                LocalDate.of(1990, 12, 1), "akmat@gmail.com")
                new Customer("Nuriza", "Nurseiitova",
                        Country.TURKEY, LocalDate.of(1960, 4, 4), "nuriza@mail.ru")
        };
//
//       try { String name = scanner.nextLine(); //jaw mn at chikti
//           int age = scanner.nextInt();
//           Student student = new Student(name, age);
//
//           if (!name.matches("[a-zA-Za-яА-Я]*")) {
//               throw new ExceptionCatch("No numbers");
//           }System.out.println(student);
//
//       }catch (ExceptionCatch e){
//            System.out.println(e.getMessage());
//        }catch (InputMismatchException e){
//           e.getStackTrace();
//           System.out.println("No letters");
//       }

    }


    public static void writerMethod() {
        try (FileWriter fileWriter = new FileWriter("homeWork.txt")) {
            fileWriter.write("\n Customer деген класс тузунуз.");
            fileWriter.write("\n Полерерин толтурунуз аты, фамилиясы,туулган олкосу,туулган жылы,почтасы болсун.");
            fileWriter.write("\n Дагы бир service деген интерфейс ачып аны анын ичине 4 метод жазыныз.");
            fileWriter.write("\n 1-кардардын жашын кайтаруучу метод жазыныз,");
            fileWriter.write("\n 2-мамлекети окшош кардарларды кайтарыныз,");
            fileWriter.write("\n 3-кардарлардын мамлекетин сорттоп чыгарыныз,");
            fileWriter.write("\n 4-баардык кардарларды кайтаруучу метод жазыныз.");
            fileWriter.write("\n Ал интерфейсти Customer клаcсына impliments кылып методдорго логикасын жазыныз.");
            fileWriter.write("\n Mainдан жазган логиканызды иштетиниз");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readerMethod() {
        try {
            FileReader fileReader = new FileReader("homeWork.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


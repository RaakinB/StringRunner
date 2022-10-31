import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coordinates, in format (x, y): ");
        String coordinate = scanner.nextLine();
        String xcord = coordinate.substring(1, coordinate.indexOf(","));
        String ycord = coordinate.substring(coordinate.indexOf(",") + 2, coordinate.indexOf(")"));
        int xcoordinate1 = Integer.parseInt(xcord);
        int ycoordinate1 = Integer.parseInt(ycord);

        System.out.println("Enter the 2nd coordinates, in format (x, y): ");
        String coordinate2 = scanner.nextLine();
        String xcord2 = coordinate2.substring(1, coordinate2.indexOf(","));
        String ycord2 = coordinate2.substring(coordinate2.indexOf(",") + 2, coordinate2.indexOf(")"));
        int xcoordinate2 = Integer.parseInt(xcord2);
        int ycoordinate2 = Integer.parseInt(ycord2);

        LinearEquation le = new LinearEquation(xcoordinate1,ycoordinate1, xcoordinate2, ycoordinate2);
        System.out.println(le.lineInfo());

        System.out.println("Enter an x value you wish to find, in integer form: ");
        int xval = scanner.nextInt();

        System.out.println(le.coordinateForX(xval));
    }






}
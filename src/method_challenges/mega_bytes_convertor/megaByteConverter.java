package method_challenges.mega_bytes_convertor;

public class megaByteConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
            return;
        }
        System.out.printf("%d KB = %d MB and %d KB%n", kiloBytes,
                kiloBytes / 1024, kiloBytes % 1024);
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
}

public class LatihanSwitchStatement2 {
    public static void main(String[] args) {
        var nilai = "E";
        switch (nilai) {
            case "A":
                System.out.println("Wow, Anda lulus summa cum laude");
                break;
            case "B":
                System.out.println("Anda lulus magna cum laude");
                break;
            case "C":
                System.out.println("Anda lulus cum laude");
                break;
            default:
                System.out.println("Maaf Anda kurang beruntung");
        }

        // switch lambda:
        switch (nilai) {
            case "A" -> System.out.println("Wow, Anda lulus summa cum laude");
            case "B", "C", "Z" -> System.out.println("Anda lulus magna cum laude");
            case "D" -> System.out.println("Anda gak lulus");
            default -> System.out.println("Mungkin Anda salah jurusan");
        }

        // switch Yield:
        // nilai dari si ucapan bergantung dari nilai si nilaiYield:
        var nilaiYield = "B";
        String ucapan = switch (nilaiYield) {
            case "A":
                yield "Wow Anda lulus dengan baik";
            case "B", "C":
                yield "Anda lulus";
            case "D":
                yield "Anda tidak lulus";
            default:
                yield "Mungkin Anda salah jurusan";
        };
        // print nilainya si ucapan:
        System.out.println(ucapan);
    }
}

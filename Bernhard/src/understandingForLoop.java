public class understandingForLoop {
    public static void main(String[] args) {

        var counter = 1;

        for(;counter <=10;){
            ++counter; // hasilnya bakalan sampe 11 (karena 'tambahin dulu baru print kemudian');
            System.out.println(counter);
            // kalo taro ++counter; di sini, bakalan print cuman sampe 10, karena 'print dulu baru tambahin');
        }
    }
}

package src.main.java.learn;

public class LearnArray {

    public static String[] DataArray = new String[5];
    
    public static String[][][] TetehFitri = 
    {
        {
            {"Fitri", "18", "Sumedang"},
            {"Masak", "Ngoding", "Benerin Motor"}
        },
        {
            {"Rizka", "24", "Rancamanyar"},
            {"Masak", "Bikin ciliung", "Nyoo Ucing"}
        },
    };


    public static record Mahasiswa(
        String namaString,
        int nim,
        String kelasString
    ) {}
    
    public static record AlatMasak(
        String bahan_satu, 
        String bahan_dua,
        String bahan_tiga
    ){}



    public static class BelajarArray {

        public static void LearnArray(){

            AlatMasak sushi = new AlatMasak("Seaweed", "Daging Tuna", "Saos");
            AlatMasak batagor = new AlatMasak("aci", "daging", "sambel kacang");


            System.out.println(batagor.bahan_satu);
            System.out.println(batagor.bahan_dua);

            // Mahasiswa mhs = new Mahasiswa("Aurhelya Dara Anardi", 321231, "TIF K 24A");
            // System.out.println(mhs.nim);

            // for(String data : TetehFitri){
            //     System.out.println("Data Ke "  + ": " + data);
            // } 

            // System.out.println(TetehFitri[1][1][1]);
            

        };
    }

   
}
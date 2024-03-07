public class Buku {
    
    private String judul ;
    private String penulis;
    private String tahunTerbit ;

    public Buku (String judul, String penulis, String tahunTerbit){
        this.judul = judul ;
        this.penulis = penulis ;
        this.tahunTerbit = tahunTerbit ;
    }
    
    public String getNip() {
        return penulis ;
    }
    @Override
    public String toString(){
        return  "Penulis = " + penulis + '\'' +
                ", nama= " + judul + '\'' +
                ", tahunTerbit=' " + tahunTerbit + '\''
                ;
    }
}
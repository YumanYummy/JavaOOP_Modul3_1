package Modul3_1;

class smartphone{
    String merk;
    public smartphone(){

    }
    public smartphone(String merk) {
        this.merk = merk;
    }
}

class specs extends smartphone{
    String spek1,spek2,spek3;
    public specs(String spek1, String spek2, String spek3){
        this.spek1 = spek1;
        this.spek2 = spek2;
        this.spek3 = spek3;
    }
}

class price extends smartphone{
    int harga1;
    int harga2;
    int harga3;
    public price(int harga1, int harga2, int harga3){
        this.harga1 = harga1;
        this.harga2 = harga2;
        this.harga3 = harga3;
    }

}

class color extends smartphone{
    String color1,color2,color3,color4,color5,color6;

    public color(String color1, String color2, String color3, String color4, String color5, String color6){
        this.color1 =  color1;
        this.color2 = color2;
        this.color3 = color3;
        this.color4 = color4;
        this.color5 = color5;
        this.color6 = color6;
    }
}

public class Devicer{
    public static void main(String[] args) {
        System.out.println();
        System.out.println("\t\t\tSmartphone Specifications");
        System.out.println();
        smartphone xyz = new smartphone("Apple Iphone 11");
        System.out.println("Merk Smartphone\t\t\t: " +xyz.merk);
        specs xyy = new specs("64gb","128gb","256gb");
        System.out.println("Smartphone Specifications\t: " +xyy.spek1+ " "+xyy.spek2+" "+xyy.spek3);
        color xas = new color("Red","Purple","Yellow","Green","White","Black");
        System.out.println("Warna Smartphone\t\t: "+xas.color1+" ,"+xas.color2+" ,"+xas.color3+" ,"+xas.color4+" ,"+xas.color5+" ,"+xas.color6);
        price xaa = new price(6600000,7550000,7750000);
        System.out.println("Harga Smartphone\t\t: Rp." +xaa.harga1);
        System.out.println("\t\t\t\t\t\t  Rp."+xaa.harga2);
        System.out.println("\t\t\t\t\t\t  Rp."+xaa.harga3);
    }
}

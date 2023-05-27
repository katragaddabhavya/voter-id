package Practice;

public class Furniture {
    private int furniturecode;
    private String furnituretype;
    private String gradeoffurniture;
    private String furniturecolour;
    private String furnitureusage;
    private float price;
    static final int discount=5;

    public Furniture(){
        this.furniturecode=101;
        this.furnituretype="chairs";
        this.gradeoffurniture="grade2";
        this.furniturecolour="brown";
        this.furnitureusage="outdoor";
    }
    public int getFurnitureCode(){
        return furniturecode;
    }
    public void setFurniturecode(int furniturecode){
        this.furniturecode=furniturecode;
    }
    public String getFurnituretype(){
        return furnituretype;
    }
    public void setFurnituretype(String furnituretype){
        this.furnituretype=furnituretype;
    }
    public String getGradeoffurniture(){
        return gradeoffurniture;
    }
    public void setGradeoffurniture(String gradeoffurniture){
        this.gradeoffurniture=gradeoffurniture;
    }
    public String getFurniturecolour(){
        return furniturecolour;
    }
    public void setFurniturecolour(String furniturecolour){
        this.furniturecolour=furniturecolour;
    }
    public String getFurnitureusage(){
        return furnitureusage;
    }
    public void setFurnitureusage(String furnitureusage){
        this.furnitureusage=furnitureusage;
    }
    public float getPrice(){
        return price;
    }
    public void setPrice(float price){
        this.price=price;
    }
    public float getCalculatediscount(){
        if(getGradeoffurniture().equals("grade2") && getFurnitureusage().equals("indoor")){
            price=price-(price*discount/100);
            return price;
        }
        return price;
    }

}
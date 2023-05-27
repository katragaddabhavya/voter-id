package Practice;


public class FurnitureImpl {
    public static void main(String[] args){
        Furniture item=new Furniture();
        item.setFurniturecode(101);
        item.setFurnituretype("chairs");
        item.setGradeoffurniture("grade2");
        item.setFurniturecolour("brown");
        item.setFurnitureusage("outdoor");
        item.setPrice(8000);
        System.out.println(item.getCalculatediscount());
    }
}
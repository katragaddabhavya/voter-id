package practices;

public class voter {
    private String name;
    private int age;
    static final int voterelegibleage=18;
    public voter(){
        this.name="john";
        this.age=32;
    }
    public String getName(){

        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getAgeCriteria(){
        if(getAge()>=voterelegibleage){
            return getName()+" is eligible to vote";
        }else if(getAge()<voterelegibleage && getAge()>0){
            return getName()+" is not eligible to vote";
        }else {
            return "age cant be negative or zero";
        }
    }

}
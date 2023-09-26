

public class Farzand {
    private String farzandName;   
    private String farzandFam;   
    private int age;
    private boolean jinsii;  
    private int parentId;
    

    public String getFarzandName(){
        return farzandName;
    }
    public void setFarzandName(String farzandName){
        this.farzandName = farzandName;
    }
    public String getFarzandFam(){
        return farzandFam;
    }
    public void setFarzandFam(String farzandFam){
        this.farzandFam = farzandFam;
    }
    public int getAgee(){
        return age;
    }
    public void setAgee(int age){
        this.age = age;
    }
    public boolean getFJinsi(){
        return jinsii;
    }
    public void setFJinsi(boolean jinsii){
        this.jinsii = jinsii;
    }

    public int getParentId(){
        return parentId;
    }
    public void setParentId(int parentId){
        this.parentId = parentId;
    }

    public void printData(){
        System.out.println("Hodimning farzandini ismi  " + farzandName);
        System.out.println("Hodimning farzandini familiyasi "+farzandFam);
        System.out.println("Hodimning farzandini yoshi  "+age);
        System.out.println("Jinsi: " + (jinsii ? "ayol" : "erkak"));
    }
}

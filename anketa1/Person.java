

// import java.util.ArrayList;
// import java.util.List;

public class Person {
    private String firstName;   
    private String lastName;   
    private int age;   
    private boolean jinsi;
    private boolean uylanganmisiz;
    private boolean farzand;

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getAge(){
        return this.age;
       
    }

    public void setAge(int age){
        this.age = age;
    }

    public boolean getJinsi(){
        return jinsi;
    }

    public void setJinsi(boolean jinsi){
        this.jinsi = jinsi;
    }

    public boolean getUylanganmisiz(){
        return uylanganmisiz;
    }

    public void setUylanganmisiz(boolean uylanganmisiz){
        this.uylanganmisiz = uylanganmisiz;
    }

    public boolean getFarzand(){
        return farzand;
    }

    public void setFarzand(boolean farzand){
        this.farzand = farzand;
    }

    public void printData(){
        System.out.println("Hodim ismi: " + firstName);
        System.out.println("Hodim familiyasi: " + lastName);
        System.out.println("Hodim yoshi: "+age);
        System.out.println("Jinsi: " + (jinsi ? "ayol" : "erkak"));
        System.out.println("Toy: "+(uylanganmisiz? "uylangan":"uylanmagan"));
        // if (farzand) {
        //     int farzandSoni = farzandList.size();
        //     for (int i = 0; i < farzandSoni; i++) {
        //         System.out.println("Farzandlaringiz soni: " + farzandSoni);
        //         Farzand farzand = farzandList.get(i);
        //         farzand.printData();
        //         farzandList.add(farzand);
        //     }
        // } else {
        //     System.out.println("Farzandlaringiz yo'q");
        // }
        // System.out.println();
        if(farzand){
                // Farzand farzand =  new Farzand();
                System.out.println("Farzandlar soni: " + 1);
        } 
        else if(farzand == false){
            
        }        
        else {
                System.out.println("Farzandlar yo'q");
        }
        System.out.println();
    }

}
// obstrak qlass
// interface
// inner qlass
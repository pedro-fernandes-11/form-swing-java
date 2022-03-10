package first;

public class Account{
    private String title;
    private double value;
    private boolean paid;
    
    //Método construtor
    public Account(String title, double value, boolean paid){
        this.title = title;
        this.value = value;
        this.paid = paid;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public void setValue(double value){
        this.value = value;
    }
    
    public double getValue(){
        return this.value;
    }
    
    public void setPaid(boolean paid){
        this.paid = paid;
    }
    
    public String getPaid(){
        if(this.paid){
            return "Sim";
        }else{
            return "Não";
        }
    }
    
    public String toString(){
        return this.title+", "+this.value+", "+this.paid;
    }
   }
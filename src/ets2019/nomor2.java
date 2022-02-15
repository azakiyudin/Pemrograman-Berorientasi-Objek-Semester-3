package ets2019;

class Account{
    private long acc_no;
    private String name, email;
    private int amount;

    public long getAcc_no(){
        return this.acc_no;
    }
    public void setAcc_no(long acc_no){
        this.acc_no = acc_no;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public int getAmount(){
        return this.amount;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
}
public class nomor2 {
    public static void main(String[] args){
        Account maudy = new Account();
        maudy.setAcc_no(123456);
        maudy.setName("Maudy Ayunda");
        maudy.setEmail("mayunda@gmail.com");
        maudy.setAmount(50000000);
        System.out.println(maudy.getAcc_no() + " " +maudy.getName()+ " " +maudy.getEmail()+ " " +maudy.getAmount());
    }
}

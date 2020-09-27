/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impound;

/**
 *
 * @author ASUS
 */
public class Client {
    private int clientid;
    String ClientName,Date,PltNo;
    
    public Client(int clientId,String ClientName,String PltNo,String Date)
    {
        this.clientid=clientId;
        this.ClientName=ClientName;
        this.Date=Date;
        this.PltNo=PltNo;
    }
    public int getId(){

        return clientid;
    }
    
    public String getClientName(){
        return ClientName;
    }
    
    public String getDate(){
        return Date;        
    }
    
    public String getPltNo(){
        return PltNo;
    }
}
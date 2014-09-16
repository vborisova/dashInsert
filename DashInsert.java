/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication31;



/**
 *
 * @author вики
 */
public class DashInsert {

    /**
     * @param args the command line arguments
     */
    
    static String dashInsert(int number){
        
        int copy= number;
        int cntDigitsOfNum=0;
    while(copy>0){   
       
        copy=copy/10;
     cntDigitsOfNum++;
       }
    String dash="";
    int [] num= new int [cntDigitsOfNum];
    int cnt=num.length-1;
    while(number>0){       
    int p=number%10;
    number=number/10;
    num[cnt]=p;
    cnt--;
       }
        
    for(int i=0;i<num.length-1;i++){
        if(num[i]%2!=0 && num[i+1]%2!=0){
        dash=dash+num[i]+"-";
       if(i==num.length-2){
       dash=dash+num[i+1];
       }
        }
        else
       
        {dash=dash+num[i];
           if(i==num.length-2){
       dash=dash+num[i+1];
       }
           }
    }
    return dash;
               }    
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(dashInsert(999560));
    }
    
}

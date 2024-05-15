/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedliststarter;

/**
 *
 * @author michael.roy-diclemen
 */
public class Data implements Comparable{
    private String code;
    private String teacher;
    private int period;
    
    public Data(String c, String t, int p){
        code = c;
        teacher = t;
        period = p;
    }
    
    @Override
    public String toString(){
        String retur = ("Code: "+code+" Teacher: "+teacher+" period: "+period);
        return retur;
    }
    
//    @Override
    public boolean equals(Data o){
        //anything not of type Data is false
        if (! (o instanceof Data))
            return false;
        //add code to properly compare
        else{
            if(code.equals(o.getCode()) && teacher.equals(o.getTeacher()) && period == o.getPeriod()){
                return true;
            }
            return false;
        }
        
    }

    @Override
    public int compareTo(Object o) {
        
        return 0;
    }
        /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the teacher
     */
    public String getTeacher() {
        return teacher;
    }

    /**
     * @param teacher the teacher to set
     */
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    /**
     * @return the period
     */
    public int getPeriod() {
        return period;
    }

    /**
     * @param period the period to set
     */
    public void setPeriod(int period) {
        this.period = period;
    }
    
    @Override
    public boolean equals(Object o){
        //anything not of type Data is false
        if (! (o instanceof Data))
            return false;
        //add code to properly compare
        
        return true;
        
    }
}

package studentmenu;
public class StudentRecord
{
private String[] name=new String [100];
private int [] NilaiUTSE;
private int [] NilaiUASE;
private int [] TotalE;
private static int studentCount;
private static int indek;
public StudentRecord(){
studentCount=0;
}
public String getName(int indek){
return name[indek];
}

public int getNilaiUTS(int indek){
return NilaiUTSE[indek];
}
public int getNilaiUAS(int indek){
return NilaiUASE[indek];
}
public int getTotal(int indek){
return TotalE[indek];
}
public void setName( String nama, int indek,int NilaiUTS,int NilaiUAS, int Total){
name[indek] = nama;
NilaiUTSE[indek] = NilaiUTS;
NilaiUASE[indek] = NilaiUAS;
TotalE[indek] = Total;
studentCount++;
}
public static int getStudentCount(){
return studentCount;
}
}
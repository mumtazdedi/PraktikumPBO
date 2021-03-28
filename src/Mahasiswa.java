/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mumta
 */
public class Mahasiswa {
    String nama,nim;
     int umur;
     float uts,uas;
    public Mahasiswa(String nama,String nim,Integer umur,float uts,float uas){
        this.nama= nama; 
        this.nim= nim;
        this.umur= umur;
        this.uts= uts;
        this.uas= uas;
     }
     
     float nilaiRerata(){
         return (uts+uas)/2;
     }
}

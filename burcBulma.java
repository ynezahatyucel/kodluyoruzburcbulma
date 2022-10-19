package Giris;
import java.util.Scanner;

public class burcBulma {
    public static void main(String[] args) {
        int mont,day;
        String burc ="";
        Scanner input =new Scanner(System.in);
        boolean hata=false;

        System.out.print("Doğduğunuz ay :");
        mont= input.nextInt();
        System.out.print("Doğduğunuz gün :");
        day= input.nextInt();

        if (mont==1){
            if (day>1&& day<31){
                if (day<21){
                burc="Oglak";
                }else {
                burc="Kova";}
            }else{
                hata=true;}
            }
        if (mont==2){
            if (day>1&& day<28){
                if (day<21){
                    burc="Kova";
                }else {
                    burc="Balık";}
            }else{
                hata=true;}
        }
        if (mont==3){
            if (day>1&& day<31){
                if (day<21){
                    burc="Balık";
                }else {
                    burc="Koç";}
            }else{
                hata=true;}
        }
        if (mont==4){
            if (day>1&& day<30){
                if (day<21){
                    burc="Koç";
                }else {
                    burc="Boğa";}
            }else{
                hata=true;}
        }
        if (mont==5){
            if (day>1&& day<30){
                if (day<21){
                    burc="Boğa";
                }else {
                    burc="İkizler";}
            }else{
                hata=true;}
        }
        if (mont==6){
            if (day>1&& day<31){
                if (day<21){
                    burc="İkizler";
                }else {
                    burc="Yengeç";}
            }else{
                hata=true;}
        }
        if (mont==7){
            if (day>1&& day<30){
                if (day<21){
                    burc="Yengeç";
                }else {
                    burc="Aslan";}
            }else{
                hata=true;}
        }
        if (mont==8){
            if (day>1&& day<31){
                if (day<21){
                    burc="Aslan";
                }else {
                    burc="Başak";}
            }else{
                hata=true;}
        }
        if (mont==9){
            if (day>1&& day<31){
                if (day<21){
                    burc="Başak";
                }else {
                    burc="Terazi";}
            }else{
                hata=true;}
        }
        if (mont==10){
            if (day>1&& day<30){
                if (day<21){
                    burc="Terazi";
                }else {
                    burc="Akrep";}
            }else{
                hata=true;}
        }
        if (mont==11){
            if (day>1&& day<30){
                if (day<21){
                    burc="Akrep";
                }else {
                    burc="Yay";}
            }else{
                hata=true;}
        }
        if (mont==12){
            if (day>1&& day<31){
                if (day<21){
                    burc="Yay";
                }else {
                    burc="oğlak";}
            }else{
                hata=true;}
        }
            if (hata) {
                System.out.println("Hatalı bir giriş yaptınız. ltfen tekrar deneyiniz");
            }else {
                System.out.println("Burcunuz :" + burc);
        }}

    }


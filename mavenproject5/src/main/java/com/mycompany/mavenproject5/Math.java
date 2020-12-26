/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject5;

/**
 *
 * @author Mohamed
 */
public class Math {
public int add(int a, int b) {
return a + b;
}
public int subtract(int a, int b) {
return a - b;
}
public int multi(int a, int b) {
return a * b;
}
public int divid(int a, int b) {
return a / b;
}
public int forloob(int a, int b) {
    int all=0;
    for(int x=0;x<5;x++)
    {
        all+=a+b ;
    }
    if(all==40)
    {
        all+=140;
    }
    return all;
    }
public char readname(char a){
    char alha='a';
    for(int bb=0;bb<10 ;bb++)
    {
       alha=a++;
       
    }
    return alha;
}

}

package com.irfan.tugas1_17090047
import java.util.Scanner

fun main(args: Array<String>){
    val input:Scanner = Scanner(System.`in`)
    println("© 17090047-Muhammad Irfan Bakhtiar")
    println("MENGHITUNG LUAS SEGITIGA")
    println("========INPUT========")
    print("Masukkan Nilai Alas : ")
    val alas = input.nextFloat()
    print("Masukkan Nilai Tinggi : ")
    val tinggi = input.nextFloat()
    println("========OUTPUT========")

    val hasil = """
    Jadi Luas Segiiga : ${0.5*alas*tinggi}
    """.trimIndent()
    print(hasil)

}

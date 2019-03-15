package com.ibnu.basic;

import com.ibnu.basic.gitar.Gitar;
import com.ibnu.basic.kendaraan.Kereta;
import com.ibnu.basic.kendaraan.Mobil;
import com.ibnu.basic.kendaraan.Motor;

public class Main {
    public static void main(String[] args) {
        Gitar gitarAkustik = new Gitar();
        Gitar gitarListrik = new Gitar();
        Gitar gitarNew = new Gitar();

        gitarAkustik.bunyi();
        gitarListrik.bunyiEffect();
        gitarNew.bunyiBunyian();

        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();
    }
}

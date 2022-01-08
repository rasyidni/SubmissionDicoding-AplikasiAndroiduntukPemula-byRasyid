package com.example.astronomicalobject

import AstronomicalObject

object AstronomicalObjectData {
    private val astronomicalObjectNames = arrayOf("Planet",
        "Satelit Alami",
        "Bintang",
        "Nebula",
        "Galaksi",
        "Asteroid",
        "Meteoroid",
        "Sistem Keplanetan",
        "Komet",
        "Gugus Galaksi",
        "Debu Kosmik",
        "Lubang Hitam",
        "Supernova")

    private val astronomicalObjectDetails = arrayOf("Planet adalah sebuah benda langit yang mengelilingi atau mengorbit suatu bintang dengan kecepatan dan lintasan tertentu. Contohnya adalah venus, bumi, dan mars yang mengelilingi matahari.",
        "Satelit alami adalah benda langit yang tidak memiliki sumber cahaya sendiri dan bergerak mengelilingi planet tertentu mengikuti jalur edarnya. Contohnya Bulan yang menjadi satelit alami Bumi yang mengelilingi sesuai jalur edarnya.",
        "Bintang adalah merupakan benda langit yang memancarkan cahayanya sendiri. Menurut ilmu astronomi, definisi bintang adalah semua benda massif (bermassa antara 0,08 hingga 200 kali massa matahari) yang sedang atau pernah melakukan pembangkitan energi melalui fusi nuklir.",
        "Nebula merupakan awan antarbintang yang terdiri dari hidrogen, debu, plasma, helium dan juga gas yang terionisasi lain yang diyakini sebagai tempat pembibitan bintang baru.",
        "Galaksi adalah suatu sistem yang terdiri atas bintang-bintang, gas, dan debu yang amat luas, di mana anggotanya memiliki gaya tarik menarik (gravitasi). Suatu galaksi pada umumnya terdiri atas miliaran bintang yang memiliki ukuran, warna, dan karakteristik yang sangat beraneka ragam.",
        "Asteroid adalah benda langit kecil dan padat yang terdapat dalam sistem tata surya. Asteorid terbentang di antara orbit planet Mars dan planet Yupiter. Struktur badannya tersusun dari batu, karbon, dan logam. Sama seperti benda langit lain, asteroid juga mengorbit matahari. ",
        "Meteoroid adalah batu-batu angkasa berukuran kecil-kecil yang berada dan melayang-layang bebas di angkasa dan bergerak cepat. Lintasan meteoroid tidak beraturan dan tidak mengorbit pada Matahari. Meteoroid ini berasal dari reruntuhan komet dan asteroid yang mengorbit matahari. ",
        "Sistem keplanetan adalah sekumpulan objek non-bintang yang terikat oleh gravitasi di dalam atau di luar orbit di sekitar sistem bintang atau sistem bintang. Secara umum, sebuah sistem dengan satu atau lebih planet merupakan sistem keplanetan.",
        "Komet adalah benda angkasa yang mirip dengan asteroid, tetapi hampir seluruhnya terbentuk dari gas (karbon dioksida, metana, dan air) dan debu yang membeku. Komet memiliki orbit atau lintasan yang berbentuk elips. Ketika dekat dengan matahari dia akan kelihatan mempunyai ekor yang terbentuk dari gas dan debu. ",
        "Sebuah gugusan galaksi adalah suatu struktur yang terdiri dari ratusan sampai ribuan galaksi yang terikat bersama oleh gravitasi. Gugusan galaksi merupakan struktur ikatan gravitasi terbesar di alam semesta dan diyakini sebagai struktur terbesar yang dikenal di alam semesta sampai tahun 1980-an, ketika gugusan super (supercluster) ditemukan.",
        "Debu kosmik atau bisa juga disebut debu luar angkasa adalah debu yang dapat ditemukan di luar bumi dan tak jarang ada yang jatuh ke dalam Bumi. Debu kosmik pada dasarnya terdiri dari karbon, besi silikat, oksigen, dan magnesium.",
        "Lubang hitam adalah sebuah pemusatan massa yang cukup besar sehingga menghasilkan gaya gravitasi yang sangat besar. Gaya gravitasi yang sangat besar ini mencegah apa pun lolos darinya kecuali melalui perilaku terowongan kuantum. Medan gravitasinya begitu kuat sehingga kecepatan lepas di dekatnya mendekati kecepatan cahaya.",
        "Supernova adalah ledakan yang sangat energik dari suatu bintang besar dan masif yang berada di titik tertentu dalam siklus hidupnya, yang disebabkan oleh keruntuhan inti gravitasi di mana dapat memancarkan energi lebih banyak daripada nova dan kecerahannya dapat bertahan hingga beberapa bulan.",
        )

    private val astronomicalObjectImages = intArrayOf(R.drawable.planet,
        R.drawable.satelit_alami,
        R.drawable.bintang,
        R.drawable.nebula,
        R.drawable.galaksi,
        R.drawable.asteroid,
        R.drawable.meteoroid,
        R.drawable.sistem_keplanetan,
        R.drawable.komet,
        R.drawable.gugus_galaksi,
        R.drawable.debu_kosmik,
        R.drawable.lubang_hitam,
        R.drawable.supernova)

    val listData: ArrayList<AstronomicalObject>
        get() {
            val list = arrayListOf<AstronomicalObject>()
            for (position in astronomicalObjectNames.indices) {
                val astronomicalObject = AstronomicalObject()
                astronomicalObject.name = astronomicalObjectNames[position]
                astronomicalObject.detail = astronomicalObjectDetails[position]
                astronomicalObject.photo = astronomicalObjectImages[position]
                list.add(astronomicalObject)
            }
            return list
        }
}
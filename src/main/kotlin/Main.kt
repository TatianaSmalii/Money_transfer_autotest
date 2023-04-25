import java.util.Scanner

fun main() {
    println(comission("VK Pay", 100_000, 0))

}

fun comission(typeCard: String, transfer: Int, previos: Int): Int {
    return when (typeCard) {
        "MasterCard", "Maestro" -> {
            when {
                transfer > 150_000 || transfer + previos > 600_000 -> -1
                //ВЫВОД ОШИБКА -> -1 //проверяем превышение лимитов ( если сумма перевода за день больше 150000
                //либо сумма текущих + месячных прошлых переводов больше 600000
                transfer > 300 && transfer < 74_999 -> 0
                //если сумма больше 300000 и меньше 75000
                else -> (transfer * 0.006f).toInt() + 20
                //если выхожу за рамки, считается комиссиия
                //для округления до целого (.tоInt)
            }
        }
        "Visa", "Mir" -> {
            when {
                transfer > 150_000 || transfer + previos > 600_000 -> -1
                transfer in 35..150_000 -> (transfer * 0.0075f).toInt()
                else -> 0
            }
        }
        "VK Pay" -> {
            when {
                transfer > 15_000 || transfer + previos > 40_000 -> -1
                else -> 0
            }
        }
        else -> -2
    }
}

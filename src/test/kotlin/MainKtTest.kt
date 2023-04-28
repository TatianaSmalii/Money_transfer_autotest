import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun testMasterCard1() {
        val type = "MasterCard"
        val transfer = 500_000
        val previos = 0
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(20, result)
    }

    @Test
    fun testMasterCard2() {
        val type = "MasterCard"
        val transfer = 500
        val previos = 0
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(0, result)
    }

    @Test
    fun testMasterCard3() {
        val type = "MasterCard"
        val transfer = 74_998
        val previos = 0
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(0, result)
    }

    @Test
    fun testMasterCard4() {
        val type = "MasterCard"
        val transfer = 100_000
        val previos = 550_000
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(-1, result)
    }

    @Test
    fun testMasterCard5() {
        val type = "MasterCarjufd"
        val transfer = 100_000
        val previos = 550_000
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(-2, result)
    }

    @Test
    fun testMasterCard6() {
        val type = "MasterCard"
        val transfer = 250
        val previos = 0
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(21, result)
    }

    @Test
    fun testMasterCard7() {
        val type = "MasterCard"
        val transfer = 75_000
        val previos = 0
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(470, result)
    }


    @Test
    fun testMaestro1() {
        val type = "Maestro"
        val transfer = 500_000
        val previos = 0
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(-1, result)
    }

    @Test
    fun testMaestro2() {
        val type = "Maestro"
        val transfer = 500
        val previos = 0
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(0, result)
    }

    @Test
    fun testMaestro3() {
        val type = "Maestro"
        val transfer = 74_998
        val previos = 0
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(0, result)
    }

    @Test
    fun testMaestro4() {
        val type = "Maestro"
        val transfer = 100_000
        val previos = 550_000
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(-1, result)
    }

    @Test
    fun testMaestro5() {
        val type = "Maestro12"
        val transfer = 100_000
        val previos = 550_000
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(-2, result)
    }

    @Test
    fun testMaestro6() {
        val type = "Maestro"
        val transfer = 250
        val previos = 0
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(21, result)
    }

    @Test
    fun testMaestro7() {
        val type = "Maestro"
        val transfer = 75_000
        val previos = 0
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(470, result)
    }

    @Test
    fun testMir1() {
        val type = "Mir"
        val transfer = 155_000
        val previos = 0
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(-1, result)
    }

    @Test
    fun testMir2() {
        val type = "Mir"
        val transfer = 140_000
        val previos = 470_000
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(-1, result)
    }

    @Test
    fun testMir3() {
        val type = "Mir"
        val transfer = 70_000
        val previos = 0
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(525, result)
    }

    @Test
    fun testMir4() {
        val type = "Miru"
        val transfer = 70_000
        val previos = 0
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(-2, result)
    }

    @Test
    fun testMir5() {
        val type = "Mir"
        val transfer = 20
        val previos = 0
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(0, result)
    }

    @Test
    fun testVisa1() {
        val type = "Visa"
        val transfer = 155_000
        val previos = 0
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(-1, result)
    }

    @Test
    fun testVisa2() {
        val type = "Visa"
        val transfer = 140_000
        val previos = 470_000
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(-1, result)
    }

    @Test
    fun testVisa3() {
        val type = "Visa"
        val transfer = 70_000
        val previos = 0
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(525, result)
    }

    @Test
    fun testVisa4() {
        val type = "Vifsa"
        val transfer = 70_000
        val previos = 0
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(-2, result)
    }

    @Test
    fun testVisa5() {
        val type = "Visa"
        val transfer = 20
        val previos = 0
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(0, result)
    }

    @Test
    fun testVk1() {
        val type = "VK Pay"
        val transfer = 15_100
        val previos = 0
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(-1, result)
    }

    @Test
    fun testVk2() {
        val type = "VK Pay"
        val transfer = 15_100
        val previos = 40_000
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(-1, result)
    }

    @Test
    fun testVk3() {
        val type = "VK Pay"
        val transfer = 200
        val previos = 0
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(0, result)
    }

    @Test
    fun testVk4() {
        val type = "VKf Pay"
        val transfer = 200
        val previos = 0
        val result = comission(typeCard = type, transfer = transfer, previos = previos)
        assertEquals(-2, result)
    }
}